
public class ControlExam {
	
	public boolean isAdult(int age){
		boolean flag = false;
		if(age>20){
			flag=true;
		}
		return flag;
	}
	
	public String grade(int mygrade){
		String result = null; //참조타입의 초기값은 null로 준다.
		if(mygrade>=90){
			if(mygrade>=95){
			result = "A+입니다";
			}else
			result = "A입니다";
		}else if(mygrade>=80){
			if(mygrade>=85){
				result = "B+입니다";
				}else
				result = "B입니다";		
		}else if(mygrade>=70){
			if(mygrade>=75){
				result = "B+입니다";
				}else
				result = "B입니다";		
		}else if(mygrade>=60){
			if(mygrade>=65){
				result = "D+입니다";
				}else
				result = "D입니다";		
		}else
			result = "F입니다";
		return result;
	}
}
