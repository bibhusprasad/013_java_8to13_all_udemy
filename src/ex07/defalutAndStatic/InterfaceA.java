package ex07.defalutAndStatic;

public interface InterfaceA {
	default void sumA(final int num1, final int num2) {
		System.out.println("InterfaceA.sumA : " + (num1 + num2));
	}
}
