package user.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import user.model.vo.UserVO;

public class UserDao {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static final String USER = "hr";
	public static final String PASSWD = "hr"; 

	public UserDao(){
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public UserVO loginRow(UserVO user){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		UserVO result = null;

		String loginSQL = "SELECT * FROM USER_TBL WHERE ID = ? AND PWD = ? ";
		
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(loginSQL);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			rset = pstmt.executeQuery();
			while(rset.next()){
			result = new UserVO(
						rset.getString(1),
						rset.getString(2),
						rset.getString(3),
						rset.getString(4),
						rset.getString(5),
						rset.getInt(6)
						//스페셜생성자를 정의해놨기때문에 이렇게가능
			);}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Dao login Row");
		return result;
	}
	
}
