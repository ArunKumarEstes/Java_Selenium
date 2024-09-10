
package Super_Keyword;

public class Super_Call_Method_2 extends Super_Call_Method_1{
	
	public void Test_2() {

		System.out.println("Test EPIC 2");
	}
	
	public void Test_1() {

		System.out.println("Test EPIC 1_ Sub class");
	}
	
	public void Test3() {
		
	super.Test_1();
	Test_2();

	}
	public static void main(String[] args) {
		Super_Call_Method_2 Runner = new Super_Call_Method_2();
		Runner.Test3();
	}

}
