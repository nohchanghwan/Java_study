package board.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import board.model.vo.BoardVO;

public class BoardDao {
	// 이건 JDBC를 위한 클래스
	
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static final String USER = "hr";
	public static final String PASSWD = "hr"; 
	
	public BoardDao(){
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	////////////////////////글 등록
	public int insertRow(BoardVO board){
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String insertSQL = "INSERT INTO BOARD_TBL VALUES(BOARDSEQ.NEXTVAL,?,?,?,SYSDATE,0)";
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	public int updateRow(BoardVO board){
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String updateSQL = "UPDATE BOARD_TBL SET TITLE =?,CONTENT=? WHERE SEQ = ? ";
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(updateSQL);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getSeq());
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
	public int deleteRow(BoardVO board){
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String deleteSQL = "DELETE FROM BOARD_TBL WHERE SEQ = ?";
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(deleteSQL);
			pstmt.setInt(1, board.getSeq());
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
	public ArrayList<BoardVO> listRow(){
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		
		ResultSet rset = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String listSQL = "SELECT * FROM BOARD_TBL";
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(listSQL); //3 번과정
			rset = pstmt.executeQuery(); 			//4 번과정
			while(rset.next()){
				BoardVO board = new BoardVO(
						rset.getInt(1),
						rset.getString(2),
						rset.getString(3),
						rset.getString(4),
						rset.getString(5),
						rset.getInt(6)
						);
				list.add(board);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	
	
	public BoardVO readRow(BoardVO board) {
		
		BoardVO myboard = new BoardVO();
		ResultSet rset = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String readSQL = "SELECT * FROM BOARD_TBL WHERE SEQ = ?";
		
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(readSQL);
			pstmt.setInt(1, board.getSeq());
			rset = pstmt.executeQuery();
			rset.next();
			myboard = new BoardVO(
				rset.getInt(1),
				rset.getString(2),
				rset.getString(3),
				rset.getString(4),
				rset.getString(5),
				rset.getInt(6)
			);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return myboard;
		
		
	}
	
	
	public ArrayList<BoardVO> searchRow(BoardVO board) {
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		ResultSet			rset = null;
		Connection 			conn = null;
		PreparedStatement 	pstmt = null;
		String searchSQL = "SELECT * FROM BOARD_TBL WHERE TITLE LIKE '%'||?||'%' ";
		
		try{
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(searchSQL);
			pstmt.setString(1, board.getTitle());
			rset = pstmt.executeQuery();
			while(rset.next()){
			BoardVO board01 = new BoardVO(
				rset.getInt(1),
				rset.getString(2),
				rset.getString(3),
				rset.getString(4),
				rset.getString(5),
				rset.getInt(6));
			
			list.add(board01);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return list;
		
		
	}
	
	
}
