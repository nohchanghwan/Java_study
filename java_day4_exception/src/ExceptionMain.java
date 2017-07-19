
public class ExceptionMain {

	public static void main(String[] args) {

		System.out.println("main Start");
		Exception ex = new Exception();
		
		try{
			ex.invokeE(6000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
