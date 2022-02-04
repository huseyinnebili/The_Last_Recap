package recap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Students_Set_Encapsulation {

	private String stdnt_Name;
	private int studentID;

	Students_Set_Encapsulation(String stdnt_Name, int studentID) {

		this.stdnt_Name = stdnt_Name;
		this.studentID = studentID;

	}

	public void display() {

		System.out.println("The student name is " + stdnt_Name + " and student ID is " + studentID + ".");
	}

	public static void main(String[] args) {

		Set<Students_Set_Encapsulation> students = new HashSet<>();

		students.add(new Students_Set_Encapsulation("Zlatan", 101));
		students.add(new Students_Set_Encapsulation("Tomas", 102));
		students.add(new Students_Set_Encapsulation("Joe", 103));
		students.add(new Students_Set_Encapsulation("Claria", 104));
		students.add(new Students_Set_Encapsulation("Ava", 105));

		Iterator<Students_Set_Encapsulation> it = students.iterator();

		while (it.hasNext()) {

			if (it.next().stdnt_Name.equalsIgnoreCase("Ava")) {

				it.remove();

			}
		}

		System.out.println("=======To call display() trough Enhanced for loop after removal one student=======");

		for (Students_Set_Encapsulation std : students) {

			std.display();

		}

		System.out.println("=======To call display() trough Iterator after removal one student=======");

		Iterator<Students_Set_Encapsulation> itt = students.iterator();

		while (itt.hasNext()) {

			itt.next().display();
		}

	}

}
