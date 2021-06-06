package TestSolution;

import java.util.ArrayList;
import java.util.List;
//Find if there are duplicate
public class Student {
	private int id;
	private String name;
	private String school;

	Student(int id, String name, String school) {
		this.id = id;
		this.name = name;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	public String toString() {

		return "id:  " + id + "  name :" + name + "  School:   " + school;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add O(1),add(n,pos) O(n),remove O(n)
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(43901450, "Jamar Gosman", "UCB"));
		list.add(new Student(43901450, "Jamar Gosman", "UCB"));
		list.add(new Student(28152842, "Jonathan Prindle", "UCD"));
		list.add(new Student(65030459, "Jackson Meredith", "UCSF"));
		list.add(new Student(65030459, "Jackson Meredith", "UCSF"));
		

		//
		for (int i = 0; i < list.size(); i++) {            //O(n)
			// list.get(i);
			for (int j = 1; j < list.size(); j++) {       //O(n)
				if (list.get(i).equals(list.get(j))) 
				//if(list.contains(list.get(j)))
				{	
					list.remove(j);                       //O(n)
		      	}
	        	}
		  }

		for (Student lists : list) {
			System.out.println(lists);

		}

		// System.out.println(list);

	}

}
