package ex02.lambda;

public class $05_IncrementByFiveTraditional implements $04_IncrementByFiveInterface {

	@Override
	public int incrementByFive(final int input) {
		return input + 5;
	}

	public static void main(final String[] args) {
		final $05_IncrementByFiveTraditional ibft = new $05_IncrementByFiveTraditional();
		System.out.println(ibft.incrementByFive(5)); // OP: 10
	}
}
