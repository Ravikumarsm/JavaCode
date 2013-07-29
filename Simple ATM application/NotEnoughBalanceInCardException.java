package Nthd.ravi.exceptionModule;

public class NotEnoughBalanceInCardException extends Exception{
	
	public NotEnoughBalanceInCardException(String n)
	{
		super(n);
	}
	
	@Override
	public String toString() {
		return "Not enough balance";
	}
}
