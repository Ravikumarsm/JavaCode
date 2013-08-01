package NthD.ravi.serialisationObjectToXML;

public class StateBank extends ReserveBank{
private String name ;
private Depositor depositor =new Depositor("Mr.one", "ABCD1234");

	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Depositor getDepositor() {
	return depositor;
}


public void setDepositor(Depositor depositor) {
	this.depositor = depositor;
}


	

}
