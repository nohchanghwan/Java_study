import com.work02.model.vo.Human;
import com.work02.model.vo.Studentt;


public class StudentMain {

	public static void main(String[] args) {

	Human [] arrays = new Human[10];
	Studentt stu1 = new Studentt("홍길동",15,171,81,"201101","영문");
	Studentt stu2 = new Studentt("한사람",13,183,72,"201102","건축");
	Studentt stu3 = new Studentt("임꺽정",16,175,65,"201103","무용");
	
	int idx = 0;
	arrays[idx++] = stu1;
	arrays[idx++] = stu2;
	arrays[idx++] = stu3; 
	
	for(int i=0;i<arrays.length;i++){
		Studentt person = (Studentt) arrays[i];
		if(person == null){
			break;
			}
		System.out.println(person.printInformation());
		}
	}

}
