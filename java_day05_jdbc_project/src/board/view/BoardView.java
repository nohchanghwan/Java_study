package board.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import board.ctrl.BoardCtrl;
import board.model.vo.BoardVO;
public class BoardView {

	private BoardCtrl ctrl;
	
	public BoardView(){
		ctrl = new BoardCtrl();
	}
	public void menu() {
		while(true){
		System.out.println("1.전체출력 2.읽기 3.입력 4.수정 5.삭제 6.종료 7.검색");
		System.out.print("번호선택 :");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		switch(number){
			case 1 :
				printAll(); break;
			case 2 :
				read(); break;
			case 7:
				search(); break;
			case 6 :
				System.exit(1);
		 	}
		}
	}
	/////////////////////////////////////////////////////////////////////////////
	public void printAll() {
		System.out.println(">>게시물 리스트 화면");
		System.out.println();
		
	
		ArrayList<BoardVO> mylist = ctrl.list();
		Iterator<BoardVO> ite = mylist.iterator();
		while(ite.hasNext())
			
			System.out.println(ite.next());
		// 메소드를 따로 명시안해도 묵시적으로 toString을 호출한다 
		} 
	
	public void read(){
		
		System.out.println(" ");
		System.out.println(">>게시물 읽기");
		System.out.print("게시글 번호 :");
		Scanner scan = new Scanner(System.in); //번호받기
		int seq = scan.nextInt();
		BoardVO board = new BoardVO();
		board.setSeq(seq);
		BoardVO result = ctrl.read(board);
		System.out.println(result);
	}
	
	public void search(){
		System.out.println();
		System.out.println(">>키워드검색");
		System.out.println();
		System.out.print("키워드입력 :");
		Scanner scan = new Scanner(System.in);
		String keyword = scan.nextLine();
		
		BoardVO board = new BoardVO();
		board.setTitle(keyword);
		ArrayList<BoardVO> list = ctrl.search(board);
		Iterator<BoardVO> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	
	}

}




