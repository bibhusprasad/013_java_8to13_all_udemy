package ex03.functionalInterface.realbankexample;

@FunctionalInterface
public interface AccountFactory {
	public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}