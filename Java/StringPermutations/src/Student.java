import java.util.Comparator;


public class Student 
{
	private int id;
	private String name;
	private String school;
	
	public Student (int id, String name, String school) {
		this.id = id;
		this.name = name;
		this.school = school;
	}

	int getId() {
		return id;
	}
	
	String getSchool() {
		return school;
	}
	
	@Override
	public String toString() {
		return name + "," + id + "," + school;
	}
	
	
public static Comparator<Student> GetSchool (){
   return new Comparator<Student>() {

@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return (o1.getSchool().compareTo(o2.getSchool()));

}


	
};
}





 static Comparator<Student> Schoolid(){
return new Comparator<Student>() {

@Override
public int compare(Student o1, Student o2) {
// TODO Auto-generated method stub
	

	
	 int compared =o1.getSchool().compareTo(o2.getSchool());
     if(compared==0){
     	
     	
     	return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
	
     }
     else 
    	 return compared;    
}



};
 }

 static Comparator<Student> SortAll(){
	 return new Comparator<Student>() {

	 @Override
	 public int compare(Student o1, Student o2) {
		 int compared =o1.getSchool().compareTo(o2.getSchool());
         if(compared==0){
         	
         	
         	return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
		
         }else return compared;
	 }



	 };
	  }


 
}
