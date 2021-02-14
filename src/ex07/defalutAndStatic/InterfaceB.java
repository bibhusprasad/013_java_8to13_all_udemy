package ex07.defalutAndStatic;

public interface InterfaceB extends InterfaceA {
	default void sumB(final int num1, final int num2) {
		System.out.println("InterfaceB.sumB : " + (num1 + num2));
	}

	@Override
    default void sumA(final int num1, final int num2) {
		System.out.println("InterfaceB.sumA : " + (num1 + num2));
	}

}
