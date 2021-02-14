package ex07.defalutAndStatic;

public class $03_MultipleInheritanceConflictExample implements InterfaceA, InterfaceD {

	@Override
	public void sumA(final int num1, final int num2) {
		System.out.println("Same class : " + (num1 + num2));
	}
}
