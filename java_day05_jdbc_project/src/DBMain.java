import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBMain {

	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static final String USER = "hr";
	public static final String PASSWD = "hr"; 
	
	public static void main(String[] args) {
	
		Connection conn = null;
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		
		
			try {
				Class.forName(DRIVER);
				System.out.println("1.Driver Loading");
				
				 conn = DriverManager.getConnection(URL,USER,PASSWD);
				System.out.println("2.Connection");
				
				 pstmt = conn.prepareStatement("SELECT SYSDATE FROM DUAL");
				System.out.println("3.PreparedStatement");
				 rset = pstmt.executeQuery();
				System.out.println("4. execute");
				while(rset.next())//next가 커서를내린다
				{
					String date = rset.getString(1);
					System.out.println(date);
					//가져오려는sysdate가 날짜형이므로 문자로 받는다
				}
				System.out.println("5.ResultSet");
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				try{
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}

}
