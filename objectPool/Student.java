package NthD.ravi.objectPool;

import java.io.Serializable;

public class Student implements Serializable{
private String sName;
private String id;
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}




}

