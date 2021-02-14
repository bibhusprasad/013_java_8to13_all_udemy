package ex07.defalutAndStatic;

public interface InterfaceC {
	default void sumC(final int num1, final int num2) {
		System.out.println("InterfaceC.sumC : " + (num1 + num2));
	}
}
