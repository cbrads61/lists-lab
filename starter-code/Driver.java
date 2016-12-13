package ListLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
	
	private static String[] firstNames = {"Josh", "John", "Jason", "Dave", "Mike", "Dan", "Gary", "Frank", "Joe",
			"Eric", "Bob", "Kyle", "Bill", "Shane", "Andrew", "Jim", "Doug", "Chris", "Katie", 
			"Kayla", "Sarah", "Elizabeth", "Stef", "Mary", "Jane", "Kelly", "Jessica", "Beth",
			"Carla", "Becky", "Linda", "Ruth", "Sandra", "Amy", "Claire", "Donna"};
	
	private static String[] lastNames = {"Smith", "Davis", "Jones", "Taylor", "Manning", "Jennings", "Williams",
			"Parker", "Elliot", "Patrick", "Johnson", "Davidson", "O'Connor", "Fritz", "Green",
			"Gold", "Foley", "Freeman", "Willis", "Grant"};

	public static void main(String[] args) {
		List<Student> studentArrayList = new ArrayList<>();
		MyLinkedList<Student> studentLinkedList = new MyLinkedList<>();
		
		generateStudents(20, studentArrayList);
		generateStudents(20, studentLinkedList);
		
		//Determine which data structure is fastest for each
		//operation. Complete the action
		
		//Delete the first, if any, Student with the last name of "Smith"
		//cheeky answer sorry if its weird to read :)
			//if ("Smith" is last || towards the end of the list){
			//		ArrayList is quicker because it can locate the later indexes quicker than a LinkedList;
			//}else{
			//		LinkedList is quicker because it doesn't have to shift every item after it removes 1

		System.out.println("LinkedList size before: " + studentLinkedList.size);

		for (int i = 0; i < studentLinkedList.getSize(); i++){
			Student student = studentLinkedList.get(i);
			if (student.getLastName().equals("Smith")){
				studentLinkedList.remove(i);
			}
		}

		System.out.println("LinkedList size after: " + studentLinkedList.size);
		
		//Change the name of the 3rd entry to "Joe Montana"
		//ArrayList would be faster because it can locate faster and changing data isnt much of difference between the 2

		String oldFirstName = studentArrayList.get(2).getFirstName();
		String oldLastName = studentArrayList.get(2).getLastName();
		System.out.println("3rd Student name before; " + oldFirstName + " " + oldLastName);

		studentArrayList.get(2).setFirstName("Joe");
		studentArrayList.get(2).setLastName("Montana");

		String newFirstName = studentArrayList.get(2).getFirstName();
		String newLastName = studentArrayList.get(2).getLastName();
		System.out.println("3rd Student name after: " + newFirstName + " " + newLastName);
		
		//Remove the 10th element
		//LinkedList would be faster because it wouldn't have to shift Students 11-20 down an index

		System.out.println("10th Student before: " + studentLinkedList.get(9).getFirstName);

		studentLinkedList.remove(9);

		System.out.println("10th Student before: " + studentLinkedList.get(9).getFirstName);
	}
	
	//To generate the ArrayList
	private static void generateStudents(int numberOfStudents, List<Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));	
		}
	}

	//To fill the custom LinkedList
	private static void generateStudents(int numberOfStudents, MyLinkedList<Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));	
		}
	}
}
