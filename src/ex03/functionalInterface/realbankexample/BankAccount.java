package ex03.functionalInterface.realbankexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {

	private int id;
	private double balance;
	private String accountName;
	final Lock lock = new ReentrantLock();
	BiFunction<Double, Double, Double> subtractFunction = (a, b) -> a - b;
	BiFunction<Double, Double, Double> addFunction = Double::sum;

	public BankAccount(final int id, final double balance, final String accountName) {
		this.id = id;
		this.balance = balance;
		this.accountName = accountName;
	}

	public boolean withdraw(final double amount) throws InterruptedException {
		if (this.lock.tryLock()) {
			Thread.sleep(100);
			this.balance = this.subtractFunction.apply(this.balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}

	public boolean deposit(final double amount) throws InterruptedException {
		if (this.lock.tryLock()) {
			Thread.sleep(100);
			this.balance = this.addFunction.apply(this.balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}

	public boolean transfer(final BankAccount to, final double amount) throws InterruptedException {
		if (this.withdraw(amount)) {
			System.out.println("Withdrawing amount: " + amount + " from: " + this.getAccountName());
			if (to.deposit(amount)) {
				System.out.println("Depositing amount:" + amount + " to: " + to.getAccountName());
				return true;
			} else {
				System.out.println("Failed to acquire both locks: refunding " + amount + " to: " + this.accountName);
				while (!this.deposit(amount)) {
					continue;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount{" + "id=" + this.id + ", balance=" + this.balance + ", accountName='" + this.accountName + '\'' + '}';
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(final double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(final String accountName) {
		this.accountName = accountName;
	}
}
