import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Al_sabonchi  Hasanain
 * @SMC_ID 1535916
 * 
 * CS 20B Programming Project 4
 *
 */


public class Project4    {
	


	/**
	 * Read students from file into a list
	 * 
	 * @param filename
	 * @return the list of students
	 */

	static ArrayList<Student> readFromFile(String filename) {
		ArrayList<Student> students = new ArrayList<Student>();
		try (Scanner in = new Scanner(new File(filename))) {
			while (in.hasNextLine()) {
				String[] fields = in.nextLine().split(",");
				students.add(new Student(Integer.parseInt(fields[1]), fields[0], fields[2]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return students;
	}

	/**
	 * Write the students to a file
	 * 
	 * @param students
	 * @param filename
	 */
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

	/**
	 * Sorts the students list by school. Same school students are sorted by ID.
	 * 
	 * Performs two stable sorts with different criteria. One sort and then another sort.
	 * 
	 * @param students
	 */
	
	static void sortBySchoolById1(ArrayList<Student> students) {
		
		Collections.sort( students, Student.GetSchool()); // to sort the specified list into ascending order by school
		Collections.sort( students, Student.Schoolid());  // to sort the same list into ascending order by ID
		

		
	}

	/**
	 * Sorts the students list by school. Same school students are sorted by ID.
	 * 
	 * Performs only one sort that uses a comparator that takes both criteria
	 * into account.
	 * 
	 * @param students
	 */
	static void sortBySchoolById2(ArrayList<Student> students) {
		
		
		Collections.sort( students, Student.SortAll()); //to sort the specified list into ascending order by school and By Id
		
	

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

	/**
	 * Sorts the students list by school. Same school students are sorted by ID.
	 * 
	 * Places all the students of the same school into an individual bucket and
	 * sorts each bucket separately.
	 * 
	 * @param students
	 * 
	 */
	static void sortBySchoolById3(ArrayList<Student> students) {
		final int NUM_SCHOOLS = 7;
		// an array of lists. Each element is a reference to a list.
		ArrayList<Student>[] buckets = (ArrayList<Student>[]) new ArrayList[NUM_SCHOOLS];
		
		
		
		for (int i=0;i<NUM_SCHOOLS;i++){ // initialize 	7 Buckets for each school
			
		buckets[i]=new ArrayList<Student>();
		
		}
		
		
		for (int i = 0 ; i <students.size() ; i++){    //loop through all students array to get the bucket index
			int index =schoolToIndex(students.get(i).getSchool());
			

			buckets[index].add(students.get(i));       //put students into buckets according to  schoolToIndex
		}
		
		
			students.clear(); //clear students array
			
			for (int i=0;i<NUM_SCHOOLS;i++){
			
			Collections.sort( buckets[i],Student.Schoolid());  //sort each Buckets array according to id
			}
			
			
			
			
			for (ArrayList <Student> bucket:buckets)  //return all buckets to  students ArrayList
				
				students.addAll(bucket);
			
			
		}
		
		
	public static void main(String[] args) {
		ArrayList<Student> students1 = readFromFile("students.txt");
		// make 2 other copies so we don't have to read the file again
		ArrayList<Student> students2 = (ArrayList<Student>) students1.clone();
		ArrayList<Student> students3 = (ArrayList<Student>) students1.clone();

		// let's time the three sorts for fun. Not really that accurate.
		long start, end;
		
		//start = System.currentTimeMillis();
         Stopwatch sw = new Stopwatch();
    	double x = sw.elapsedTime();
    	//System.out.println("Time: " + x);

		sortBySchoolById1(students1);
		//end = System.currentTimeMillis();
		//System.out.println("Two stable sorts took " + (end - start)
				//+ " milliseconds.");
		System.out.println("Two stable sorts took  : " + x);

		start = System.currentTimeMillis();
		sortBySchoolById2(students2);
		end = System.currentTimeMillis();
		System.out.println("One stable sort with a two criteria comparator took "
						+ (end - start) + " milliseconds.");

		start = System.currentTimeMillis();
		sortBySchoolById3(students3);
		end = System.currentTimeMillis();
		System.out.println("Bucket sort took " + (end - start)
				+ " milliseconds.");

		if (!(students1.equals(students2) && students2.equals(students3))) {
			System.out.println("Fix me: One or more sorts are incorrect.");
		}
		
		writeToFile(students3, "studentsSorted.txt");
	}
	}

	

	
	

	

