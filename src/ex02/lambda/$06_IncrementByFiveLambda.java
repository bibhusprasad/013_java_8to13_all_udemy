package ex02.lambda;

public class $06_IncrementByFiveLambda {

	public static void main(final String[] args) {
		final $04_IncrementByFiveInterface ibfl = input -> input + 5;
		System.out.println(ibfl.incrementByFive(5)); // OP: 10
	}
}
