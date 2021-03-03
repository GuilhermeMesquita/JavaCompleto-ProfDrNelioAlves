package entities;

public class Account_Exercise {

	private int number;
	private String holder;
	private double acc;

	public Account_Exercise(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account_Exercise(int number, String holder, double acc) {
		this.number = number;
		this.holder = holder;
		deposit(acc);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getAcc() {
		return acc;
	}

	public void deposit(double amount) {
		acc += amount;
	}

	public void withDraw(double amount) {
		acc -= amount;
	}

	public String toString() {
		return "Account " + number + " , Holder: " + holder + " , Balance: $" + String.format("%.2f", acc);
	}

}
