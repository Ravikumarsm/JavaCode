package NthD.ravi.serialisationObjectToXML;

import com.thoughtworks.xstream.XStream;

public class Runner {
public static void main(String[] args) {
	ReserveBank bank = new StateBank();
	bank.setName("State Bank Mysore");
	bank.setNoOfBanks(100);
	XStream convertObjectTOXML=new XStream();
	String objectToXml=convertObjectTOXML.toXML(bank);
	
	
ReserveBank deserializationXMLToOBject=(ReserveBank)convertObjectTOXML.fromXML(objectToXml);
	
}
}
