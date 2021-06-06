import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {

private int id;
private String  name;
private String school;

	Student(int id,String name,String school){
		this.id=id;
		this.name=name;
		this.school=school;							
	}

	public int getId(){
		return id;			
	}
	public String getName(){
	    return name;	
	   }
	
	public String getSchool(){	
		return school;			
	}
	
	public String toString(){
		
		return "id:  "+id+"  name :"+name+"  School:   "+school;	
		
		
	}
	
	
	
	/**
	 * Sorts the students list by school. Same school students are sorted by ID.
	 * 
	 * Performs two stable sorts with different criteria. One sort and then another sort.
	 * 
	 * @param students
	 */
	
	
	public static Comparator <Student> GetSchool(){
		return new  Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				//return (o1.getSchool()-o2.getSchool());				
			return o1.getSchool().compareTo(o2.getSchool()) ;
			
			}					
		};		
	   }
	
	
	
	
	
	public static Comparator <Student> Schoolid(){ return new Comparator<Student>(){

		@Override
		public int compare(Student o1, Student o2) {
			
			int compared=  o1.getSchool().compareTo(o2.getSchool());
			if(compared==0){	
					return ((Integer)o2.getId()).compareTo(o1.getId());		
			      }
			return compared;		
		
		}	
	};
	}
	
	/**
	 * Sorts the students list by school. Same school students are sorted by ID.
	 * 
	 * Performs two stable sorts with different criteria. One sort and then another sort.
	 * 
	 * @param students
	 */
	
	static void  sortBySchoolById1(ArrayList<Student> students){
		
		Collections.sort( students, GetSchool());
		
		Collections.sort(students,new SortbySchool ());
		
	}
	
	
	static void writeToFile(ArrayList<Student> students, String filename) {
		try (FileWriter out = new FileWriter(filename)) {
			for (Student s : students) {
				out.write(s.toString());
				out.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	static void sortBySchoolById3(ArrayList <Student> students){
		final int NUM_SCHOOLS=7;
		ArrayList<Student>[] buckets= (ArrayList<Student>[]) new ArrayList[NUM_SCHOOLS];
		
		for (int i=0;i<NUM_SCHOOLS;i++){ // initialize 	7 Buckets for each school
			buckets[i]=new ArrayList<Student>();
			}
		
		for (int i = 0 ; i <students.size() ; i++){    //loop through all students array to get the bucket index
			int index =schoolToIndex(students.get(i).getSchool());
			buckets[index].add(students.get(i));       //put students into buckets according to  schoolToIndex
		}	
		
		students.clear(); //clear students array
		
		/*for (int i=0;i<NUM_SCHOOLS;i++){
		
		Collections.sort( buckets[i],Student.Schoolid());  //sort each Buckets array according to id
		}*/
		for (ArrayList <Student> bucket:buckets)  //return all buckets to  students ArrayList
			
			students.addAll(bucket);
		
	}

	

	
	/**
	 *      Use this function in your bucket sort
	 *
	 * Return the bucket index for each school (schools in alphabetical order)
	 * 
	 * "UCB", "UCD", "UCI", "UCLA", "UCM", "UCSD", "UCSF"
	 *   0		1	   2	  3	      4      5        6
	 * 
	 * @param school
	 * @return the bucket index
	 */
	private static int schoolToIndex(String school) {
		switch (school) {
		case "UCB":
			return 0;
		case "UCD":
			return 1;
		case "UCI":
			return 2;
		case "UCLA":
			return 3;
		case "UCM":
			return 4;
		case "UCSD":
			return 5;
		case "UCSF":
			return 6;
		default:
			System.err.println("Unknown school " + school);
			return -1;
		}
	}
	
	
	
	
	private static ArrayList<Student> readFromFile(String filename) {
		// TODO Auto-generated method stub
		
			ArrayList<Student> students = new ArrayList<Student>();
			try (Scanner in = new Scanner(new File(filename))) {
				//returns true if and only if this scanner has another line of input
				while (in.hasNextLine()) {
					String[] fields = in.nextLine().split(",");
					students.add(new Student(Integer.parseInt(fields[1]), fields[0], fields[2]));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return students;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//If you print any object, java compiler internally invokes the toString() method on the object. 
//So overriding the toString() method, returns the desired output,
		
		
		ArrayList<Student> students1 = readFromFile("st.txt");
		ArrayList<Student> student2=(ArrayList<Student>) students1.clone();
		ArrayList <Student> student3=(ArrayList<Student>) students1.clone();
		
	    Collections.sort(students1,Schoolid());
		
		sortBySchoolById1(students1);
		for(int i=0;i<students1.size();i++){
			System.out.println(students1.get(i));
			
		}
		
		
		Collections.sort(students1,Schoolid());
		
		Collections.sort(students1,Schoolid());
		//System.out.println(students1);
		for (Student s : students1) {
			//System.out.println(s.toString());		
		}	
		sortBySchoolById3(student3);
     	writeToFile(student3, "studentsSorted.txt");
	}

 }




class SortbySchool implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
 
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return  (o2.getSchool().compareTo(o1.getSchool()));	
	} 
	
}