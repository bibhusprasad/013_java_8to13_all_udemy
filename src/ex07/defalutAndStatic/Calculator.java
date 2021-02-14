package ex07.defalutAndStatic;

public interface Calculator {

	public int sum(int num1, int num2);

	default int dif(final int num1, final int num2) {
		return num1 - num2;
	}

	static int mul(final int num1, final int num2) {
		return num1 * num2;
	}

	public double divide(int num1, int num2);
}
