package prodapt25;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("YOGESH",21,"ASE");
		Employee e2=new Employee("SIVAN",21,"ASE");
		Employee e3=new Employee("GOWTHAM",21,"ASE");
		HR_Manager HRm= new HR_Manager(); 
		HRm.process_Records(e1.name,e1.age,e1.designation);
		HRm.process_Records(e2.name,e2.age,e2.designation); 
		HRm.process_Records(e3.name,e3.age,e3.designation);	
	}

}
