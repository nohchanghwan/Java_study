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
		System.out.println("1.��ü��� 2.�б� 3.�Է� 4.���� 5.���� 6.���� 7.�˻�");
		System.out.print("��ȣ���� :");
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
		System.out.println(">>�Խù� ����Ʈ ȭ��");
		System.out.println();
		
	
		ArrayList<BoardVO> mylist = ctrl.list();
		Iterator<BoardVO> ite = mylist.iterator();
		while(ite.hasNext())
			
			System.out.println(ite.next());
		// �޼ҵ带 ���� ���þ��ص� ���������� toString�� ȣ���Ѵ� 
		} 
	
	public void read(){
		
		System.out.println(" ");
		System.out.println(">>�Խù� �б�");
		System.out.print("�Խñ� ��ȣ :");
		Scanner scan = new Scanner(System.in); //��ȣ�ޱ�
		int seq = scan.nextInt();
		BoardVO board = new BoardVO();
		board.setSeq(seq);
		BoardVO result = ctrl.read(board);
		System.out.println(result);
	}
	
	public void search(){
		System.out.println();
		System.out.println(">>Ű����˻�");
		System.out.println();
		System.out.print("Ű�����Է� :");
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



