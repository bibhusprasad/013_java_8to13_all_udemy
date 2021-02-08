package ex02.lambda;

public class $08_ConcatenateTraditional implements $07_ConcatenateInterface {

	@Override
	public String concatenate(final String s1, final String s2) {
		return s1 + " " + s2;
	}

	public static void main(final String[] args) {
		final $08_ConcatenateTraditional ct = new $08_ConcatenateTraditional();
		System.out.println(ct.concatenate("bibhu", "samal")); // Op: bibhu samal
	}
}
