package Nthd.ravi.exceptionModule;

public class ATM {

	String name;

	public ATM(String n)
	{
		if(n==null)
			throw new IllegalArgumentException("Name of ATM is null.... It cannot be!!");

		name = n;

	}
	public void withDraw(Card c, double amt) throws NotEnoughBalanceInCardException
	{
		System.out.println("ATM "+name+" Bank is being asked to withdraw "+amt +" from card which belongs to "+c.getOwner()+" which has balance "+c.getBalance());
		if(c==null)
			throw new IllegalArgumentException("Card is null.... It cannot be!!");

		if(amt <= 0)
			throw new IllegalArgumentException("Not possible to  withdraw "+amt+" which is <=0 ?....");

		System.out.println("all input validations have succeeded..");

		if(amt > c.getBalance())
			throw new NotEnoughBalanceInCardException("cannot withdraw "+amt+" when  balance is "+c.getBalance()+".....");

		System.out.println("all business validations have succeeded..");

		double val = c.getBalance() - amt;
		c.setBalance(val);



	}
}
