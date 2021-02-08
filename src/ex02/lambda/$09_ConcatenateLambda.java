package ex02.lambda;

public class $09_ConcatenateLambda {

	public static void main(final String[] args) {
		final $07_ConcatenateInterface ci = (s1, s2) -> s1 + " " + s2;
		System.out.println(ci.concatenate("bibhu", "samal")); // OP: bibhu samal
	}
}
