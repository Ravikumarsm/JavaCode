package NthD.ravi.objectPool;

import java.io.Serializable;

public class University implements Serializable{
private String name;
private int NoOfColleges;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoOfColleges() {
	return NoOfColleges;
}
public void setNoOfColleges(int noOfColleges) {
	NoOfColleges = noOfColleges;
}

}
