package ex02.lambda;

public class $02_HelloWorldTraditional implements $01_HelloWorldInterface {

	@Override
	public String sayHelloWorld() {
		return "Hello World Traditional Ways";
	}

	public static void main(final String[] args) {

		final $02_HelloWorldTraditional hwt = new $02_HelloWorldTraditional();
		System.out.println(hwt.sayHelloWorld()); // OP: Hello World Traditional Ways
	}
}
