import com.oop.Student;

public class StudentMain {

	public static void main(String[] args) {
	
	Human [] stuAry = new Human[3];
	Studentt stu = new Studentt("홍길동",15,170,80);
	Studentt stu2 = new Studentt("한사람",13,180,70);
	Studentt stu3 = new Studentt("임꺽정",16,175,65);
	
	int idx = 0;
	stuAry[idx++] = stu;
	stuAry[idx++] = stu2;
	stuAry[idx++] = stu3;   	
	System.out.println("이름	 나이    신장   몸무게");
		for(int i=0;i<stuAry.length;i++){
			Studentt person = stuAry[i];
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
		System.out.println("나이 평균:"+ageHap/3);
		System.out.println("신장 평균:"+heightHap/3);
		System.out.println("몸무게평균:"+weightHap/3);
		System.out.println("");
		System.out.println("나이가 가장 많은 학생:"+ageMaxname);
		System.out.println("나이가 가장 적은 학생:"+ageMinname);
		System.out.println("신장이 가장 큰 학생:"+heightMaxname);
		System.out.println("신장이 가장 작은 학생:"+heightMinname);
		System.out.println("몸무게가 가장 많이 나가는 학생:"+weightMaxname);
		System.out.println("몸무게가 가장 적게 나가는 학생:"+weightMinname);
	}
	
}
