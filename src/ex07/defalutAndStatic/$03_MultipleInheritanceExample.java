package ex07.defalutAndStatic;

public class $03_MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {

	public static void main(final String[] args) {

		final $03_MultipleInheritanceExample multiple = new $03_MultipleInheritanceExample();
		multiple.sumA(4, 2); // resolve to child
		multiple.sumB(4, 2);
		multiple.sumC(4, 2);
		// OP:
		// InterfaceB.sumA : 6
		// InterfaceB.sumB : 6
		// InterfaceC.sumC : 6

	}
}
