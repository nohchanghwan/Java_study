
public class Lotto {

	public static void main(String[] args) {

		int [] lottoAry = new int[6];
			for(int i=0;i<lottoAry.length;i++){
			lottoAry[i] = (int)(Math.random()*45)+1;
				for(int j=0;j<i;j++){
					if(lottoAry[i]==lottoAry[j]){
						i--;
						break;
					}
				}
			}
		for	(int i=0;i<lottoAry.length;i++){
		System.out.println(lottoAry[i]+"\t");
		}
	}
}
