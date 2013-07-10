package com.rOrg.puzzle;

public class Employee {
private String name;
private double salary;
private String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
	public int hashCode() {
	return 1122;
	}
@Override
	public String toString() {

return name+id+salary;


}
}
