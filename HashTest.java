package com.rOrg.puzzle;

import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashTest {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the name");
	String name=scan.next();
	System.out.println("Enter the salary");
	double salary=scan.nextDouble();
	System.out.println("Enter the name");
	String id=scan.next();
	HashSet set=new HashSet();
	Employee emp=new Employee();
	emp.setName(name);
	emp.setSalary(salary);
	emp.setId(id);
	set.add(emp);
	//System.out.println(name+" "+id+" "+salary);
Iterator itr=set.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next().hashCode());
	System.out.println(set);
	
	}
	
	
}
}
