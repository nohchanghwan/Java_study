import com.work02.model.vo.Human;
import com.work02.model.vo.Student;

public class StudentMain {

	public static void main(String[] args) {

	Human [] arrays = new Human[10];
	Human stu1 = new Student("ȫ�浿",15,171,81,"201101","����");
	Student stu2 = new Student("�ѻ��",13,183,72,"201102","����");
	Student stu3 = new Student("�Ӳ���",16,175,65,"201103","����");
	
	int idx = 0;
	arrays[idx++] = stu1;
	arrays[idx++] = stu2;
	arrays[idx++] = stu3; 
	
	for(int i=0;i<arrays.length;i++){
		Student person = (Student) arrays[i];
		if(person == null){
			break;
			}
		System.out.println(person.printInformation());
		}
	}

}