package com.application.module.MapPkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Company {
	public static void main(String[] args) {
Employee e1=new Employee("e001","userOne");
Employee e2=new Employee("e002","userTwo");
Employee e3=new Employee("e003","userThree");
Employee e4=new Employee("e004","userFour");
Employee e5=new Employee("e001","userOne");

Dept d1=new Dept("d001","dev");
Dept d2=new Dept("d002","mgt");

/* Here Employee made as key by overriding hashCode() and equals() method.*/

 HashMap<Employee, Dept> map=new HashMap<Employee, Dept>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d2);
		map.put(e4, d2);
		map.put(e5, d2);
		map.put(e5, d2);
		map.put(e1, d1);
		
Set<Employee> key=map.keySet();
for (Employee employee : key) {
	System.out.println(employee.empId+"   "+employee.Ename+"   ");
	
	
   }	
}
	
}



