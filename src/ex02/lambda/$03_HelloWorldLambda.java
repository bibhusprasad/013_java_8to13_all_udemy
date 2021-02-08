package ex02.lambda;

public class $03_HelloWorldLambda {

	public static void main(final String[] args) {

		// implementing interface
		final $01_HelloWorldInterface hwi = () -> "Hello World Lambda ways";
		System.out.println(hwi.sayHelloWorld()); // OP: Hello World Lambda ways

	}
}
