
public class ControlExam {
	
	public boolean isAdult(int age){
		boolean flag = false;
		if(age>20){
			flag=true;
		}
		return flag;
	}
	
	public String grade(int mygrade){
		String result = null; //����Ÿ���� �ʱⰪ�� null�� �ش�.
		if(mygrade>=90){
			if(mygrade>=95){
			result = "A+�Դϴ�";
			}else
			result = "A�Դϴ�";
		}else if(mygrade>=80){
			if(mygrade>=85){
				result = "B+�Դϴ�";
				}else
				result = "B�Դϴ�";		
		}else if(mygrade>=70){
			if(mygrade>=75){
				result = "B+�Դϴ�";
				}else
				result = "B�Դϴ�";		
		}else if(mygrade>=60){
			if(mygrade>=65){
				result = "D+�Դϴ�";
				}else
				result = "D�Դϴ�";		
		}else
			result = "F�Դϴ�";
		return result;
	}
}