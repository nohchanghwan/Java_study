

public class LoopExam {
	public static int evenSum(int start, int end){
		int result = 0;
		for(int i=start ; i<=end ; i++){
			if(i%2 == 0){
				result+=i;
			}
		}
		return result;
	}
	
	
	
	public void leapYear(int year){
		if((year%4 ==0 && year%100!=0)||year%400==0){
			System.out.println("����");
		}else{
			System.out.println("���");
		}
	}
	
	public void leapYearLoop(int strYear, int endYear){
		int cntY =0;
		int cntP =0;
		int cnt  =0;
		for(int i= strYear;i<=endYear;i++){
			if((i%4 ==0 && i%100!=0)||i%400==0){
				System.out.print(i+" ");
				cntY+=1;
				cnt++;
				if(cnt%5==0){
					System.out.println();
				}
			}else{
				cntP+=1;
			}
		}
		System.out.println("������"+cntY+"ȸ"+"�����"+cntP+"ȸ");	
	}
	   
	
	public void gugudan(){
		int result;
		for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				result = i*j;
				System.out.print("\t"+i+"*"+j+"="+result);
			}
			System.out.println();
		}
	}
	
}
