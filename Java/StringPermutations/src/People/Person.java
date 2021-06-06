package People;

public abstract class Person {

	 // change private  to protected it will be hidden
	protected String name;
	protected String address;
	
	// Constructor
	
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	
	public abstract String toString();

	
	
	//public abstract int Get();
	
}


