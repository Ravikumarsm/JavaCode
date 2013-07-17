package nthDimenzion.ravi.pkg1;

import nthDimenzion.ravi.Parent;

public class Child extends Parent{
	public void callProtectedMethod(){
		Parent a=new Parent();
		//a.methodProtected();	// line 4
		
		Parent p = new Child();
		if (p instanceof Child) {
			Child b = (Child) p;
			b.methodProtected();   // line 8
			
		}
		
	}
}
