package Java;

public class Interface_three implements Interface_one,Interface_two{

	@Override
	public void Run_1() {
		
		
		System.out.println(" Print interfcae 1");
	}

	@Override
	public void Run_2() {
		System.out.println(" Print interfcae 1");
		
	}
	
	public static void main(String[] args) {
		Interface_three Runner = new Interface_three();
		Runner.Run_1();
		Runner.Run_2();
	}
	

}
