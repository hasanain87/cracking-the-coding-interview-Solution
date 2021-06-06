package People;

public class Teacher extends Person {
	
	//String name,address;
	int id;
	
	
//If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call 
//to the no-argument constructor of the superclass.
//If the super class does not have a no-argument constructor, you will get a compile-time error. 
//Object does have such a constructor, so if Object is the only superclass, there is no problem.
	
	Teacher(String name, String address,int id){
		super(name,address);
		this.id=id;	
	}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return   "Teacher name===" +this.name+" =="+this.id;
}


//@Override
public int GetId() {
	// TODO Auto-generated method stub
	return  id;
}
	
}
