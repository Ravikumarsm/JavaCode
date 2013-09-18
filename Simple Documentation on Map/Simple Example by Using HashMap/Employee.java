package com.ibm.application.module.MapPkg;

public class Employee {
public String empId;
public String Ename;
public Employee(String empId,String Ename) {
	this.empId=empId;
	this.Ename=Ename;

}
@Override
public int hashCode() {
	
	return 123456;
}
@Override
public boolean equals(Object o) {
	if (o instanceof Employee) {
		Employee emp=(Employee)o;
		if (this.empId.equalsIgnoreCase(emp.empId)) {
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
}
}
