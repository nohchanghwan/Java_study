
public class testtest {

	public static void main(String[] args) {

		int [] intAry = {29,50,2,100,80,69};
		int temp = 0;
		//소팅알고리즘
		for(int i=0;i<intAry.length-1;i++){
			for(int j=i+1;j<intAry.length;j++){
				if(intAry[i] > intAry[j]){
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
		}
		for(int i=0;i<intAry.length;i++){
		System.out.println(intAry[i]+"\t");
		}
	}
	

}
