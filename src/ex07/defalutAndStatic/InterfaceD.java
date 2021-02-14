package ex07.defalutAndStatic;

public interface InterfaceD {
	default void sumA(final int num1, final int num2) {
		System.out.println("InterfaceD.sumA : " + (num1 + num2));
	}
}
