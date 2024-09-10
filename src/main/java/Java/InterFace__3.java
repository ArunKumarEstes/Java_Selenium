package Java;

public class InterFace__3 implements InterFace_2 {

	@Override
	public void Test_1() {
		System.out.println("Test Pass");
	}

	@Override
	public void Test_2() {
		System.out.println("Test Fail");
	}

	public static void main(String[] args) {
		InterFace__3 Runner = new InterFace__3();
		Runner.Test_1();
		Runner.Test_2();
	}

}
