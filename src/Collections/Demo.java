package Collections;


interface A{
	void m1();

	private  void sleeping() {
		System.out.println("sleeping with dreamz");
	}
}
public class Demo implements A {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("eating in the class");
		
	}
	private void sleeping() {
		System.out.println("sleeping with dreamz along with eating");
	}

	public static void main(String args[]) {
		Demo d=new Demo();
		d.m1();
		d.sleeping();
	}
}
