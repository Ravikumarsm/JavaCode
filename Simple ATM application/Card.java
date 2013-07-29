package Nthd.ravi.exceptionModule;

public class Card {
	private String owner;
	private double balance;

	public String getOwner()
	{
		return owner;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double d)
	{
		if(d <= 0)
			throw new IllegalArgumentException(" balance cant be less than zero?");

		balance = d;
	}


	public void addToBalance(double d)
	{
		if(d <= 0)
			throw new IllegalArgumentException("balance cannot be less than zero?");

		balance = balance + d;
	}

	public Card(String o, double d)
	{
		if (o == null)
			throw new IllegalArgumentException("Owner is null.... It cannot be!!");

		if (d < 0)
			throw new IllegalArgumentException("balance cannot be less than zero?");

		owner = o;
		balance = d;
	}

}
