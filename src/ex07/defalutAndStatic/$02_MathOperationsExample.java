package ex07.defalutAndStatic;

public class $02_MathOperationsExample implements Calculator {

	@Override
	public int sum(final int num1, final int num2) {
		return num1 + num2;
	}

	@Override
	public double divide(final int num1, final int num2) {
		return num1 / num2;
	}

	public static void main(final String[] args) {
		final $02_MathOperationsExample math = new $02_MathOperationsExample();

		System.out.println(math.sum(6, 2)); // OP: 8
		System.out.println(math.divide(6, 2)); // OP: 3.0
		System.out.println(math.dif(6, 2)); // OP: 4
		System.out.println(Calculator.mul(6, 2)); // OP: 12
	}
}
