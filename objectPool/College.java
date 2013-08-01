package NthD.ravi.objectPool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class College extends University implements Serializable{
private Library library;
private List<Student> students;

public Library getLibrary() {
	return library;
}
public void setLibrary(Library library) {
	this.library = library;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

public List<Student> studentList(){
	List<Student> list=new ArrayList<Student>();
	Student s1=new Student();
	s1.setId("1NC");
	s1.setsName("ABC");
	list.add(s1);
	
	return students;
	
}
}
