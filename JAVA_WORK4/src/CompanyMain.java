import com.emp.Bonus;
import com.emp.Employee;
import com.emp.Sales;
import com.emp.Secretary;



public class CompanyMain {

	public static void main(String[] args) {

		Employee [] emparr = new Employee[2];
		
		
		emparr[0] = new Secretary("Hilery",1,"secretary",800);
		emparr[1] = new Sales("Clinten",2,"sales",1200);
		
		
		System.out.println("name         department         salary");
		System.out.println("-------------------------------------");
		for(int i=0;i<emparr.length;i++){
			System.out.println(emparr[i].returntax());
		}
		
		emparr[0].

	}

}
