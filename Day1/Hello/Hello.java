public class Hello{

	private int x;
	private static int y;

	public String sayHello(){

	return "Hello Java!";
	}

	public static void main(String[] args)
	{
		Hello hello = new Hello();
		System.out.println(hello.sayHello());

	}
}
