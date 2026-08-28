package Demopack;

interface Employee{
	void work();
	
	static void companyName() {
		System.out.println("ABC Company");
	}
}

class Developer implements Employee{
	
	@Override
	public void work() {
		System.out.println("handling some bug");
	}
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		d.work();
		Employee.companyName();

	}

}
