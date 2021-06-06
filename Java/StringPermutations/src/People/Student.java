package People;

public class Student extends Person {
	
	private int id;
	//private String name;
	//private String address;
	
	public Student(String name,String address,int id){
		super(name,address);
		this.id=id;
				
	}
	

	public int GetId(){	
	return id;		
	}
		
	
	public String GetName(){
		
		return name;	
	}
	

	public String GetAddress(){
			
			return address;	
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.name+ " ==="+this.id;
	}
	
	
}
