import com.oop.Student;

public class StudentMain {

	public static void main(String[] args) {
	
	Student [] stuAry = new Student[3];
	Student stu = new Student("ȫ�浿",15,170,80);
	Student stu2 = new Student("�ѻ��",13,180,70);
	Student stu3 = new Student("�Ӳ���",16,175,65);
	
	int idx = 0;
	stuAry[idx++] = stu;
	stuAry[idx++] = stu2;
	stuAry[idx++] = stu3;   	
	System.out.println("�̸�	 ����    ����   ������");
		for(int i=0;i<stuAry.length;i++){
			Student person = stuAry[i];
			if(person == null){
				break;
				}
			System.out.println(person.studentInfo());
		}
	
	double ageHap= 0;
	int ageMax=0;
	int ageMin=1000;
	String ageMaxname = null ;
	String ageMinname = null ;
	
	double heightHap= 0;
	int heightMax=0;
	int heightMin=1000;
	String heightMaxname = null ;
	String heightMinname = null ;

	double weightHap= 0;
	int weightMax=0;
	int weightMin=1000;
	String weightMaxname = null ;
	String weightMinname = null ;
	
		for(int i=0;i<stuAry.length;i++){
			Student person = stuAry[i];
			if(person == null){
				break;
				}
			ageHap += person.getAge();
				if(person.getAge()>ageMax){
					ageMaxname = person.getName();
					ageMax = person.getAge();
				}
				if(person.getAge()<ageMin){
					ageMinname = person.getName();
					ageMin = person.getAge();
				}
		}
		for(int i=0;i<stuAry.length;i++){
			Student person = stuAry[i];
			if(person == null){
				break;
				}
			heightHap += person.getHeight();
				if(person.getHeight()>heightMax){
					heightMaxname = person.getName();
					heightMax = person.getHeight();
				}
				if(person.getHeight()<heightMin){
					heightMinname = person.getName();
					heightMin = person.getHeight();
				}
		}
		for(int i=0;i<stuAry.length;i++){
			Student person = stuAry[i];
			if(person == null){
				break;
				}
			weightHap += person.getWeight();
				if(person.getWeight()>weightMax){
					weightMaxname = person.getName();
					weightMax = person.getWeight();
				}
				if(person.getWeight()<weightMin){
					weightMinname = person.getName();
					weightMin = person.getWeight();
				}
		}
		System.out.println("");
		System.out.println("���� ���:"+ageHap/3);
		System.out.println("���� ���:"+heightHap/3);
		System.out.println("���������:"+weightHap/3);
		System.out.println("");
		System.out.println("���̰� ���� ���� �л�:"+ageMaxname);
		System.out.println("���̰� ���� ���� �л�:"+ageMinname);
		System.out.println("������ ���� ū �л�:"+heightMaxname);
		System.out.println("������ ���� ���� �л�:"+heightMinname);
		System.out.println("�����԰� ���� ���� ������ �л�:"+weightMaxname);
		System.out.println("�����԰� ���� ���� ������ �л�:"+weightMinname);
	}
	
}