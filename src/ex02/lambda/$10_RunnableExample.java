package ex02.lambda;

public class $10_RunnableExample {

	public static void main(final String[] args) {

		// Traditional
		final Runnable rt = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i < 10; i++) {
					sum += i;
				}
				System.out.println("Traditional : " + sum); // OP: Traditional : 45
			}
		};
		new Thread(rt).start();

		// Lambda
		final Runnable rl = () -> {
			int sum = 0;
			for (int i = 1; i < 10; i++) {
				sum += i;
			}
			System.out.println("Lambda : " + sum); // OP: Lambda : 45
		};
		new Thread(rl).start();

	}
}
