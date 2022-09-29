/*
  1.	Create a list of elements as shown below into the LinkedList and name it as languages.
 

C
C++
Java
Kotlin
Python
Perl
Ruby

Display the created list.

Remove an element at index 5 and display the list

Remove ‘Kotlin’ and display the list

Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

Remove all the elements from the list and display the list.

*/
package testCollection.exercise;

import java.util.LinkedList;
import java.util.List;

public class LinklistLanguage {

	public static void main(String[] args) {
		List<String> Lnames = new LinkedList<>();
			Lnames.add("C");
			Lnames.add("C++");
			Lnames.add("Java");
			Lnames.add("Kotlin");
			Lnames.add("Python");
			Lnames.add("Pearl");
			Lnames.add("Ruby");
			
			System.out.println("\n");
			System.out.println("LIST OF PROGRAMING LANGUAGE ");
			System.out.println("******************************************************");
	//<!---displaying elements in linked list.		
			System.out.println("LinkedList content: " + Lnames);
			
			System.out.println("******************************************************");
	//<!---removing an element from linked list whose index value is 5.
			Lnames.remove(5);
			System.out.println("LinkedList content: " + Lnames);

			System.out.println("******************************************************");
	//<!---removing  element Kotlin from the list.
			Lnames.remove("Kotlin");
			System.out.println("LinkedList content: " + Lnames);
			
			System.out.println("******************************************************");
	//<!---removing  element Kotlin from the list.
			List<String> ScriptL = new LinkedList<>();
			ScriptL.add("Python");
			ScriptL.add("Ruby");
			ScriptL.add("Pearl");
			Lnames.removeAll(ScriptL);
			System.out.println(Lnames);
			
			System.out.println("******************************************************");
	//<!---removing all the elements from the list.
			Lnames.removeAll(Lnames);
			System.out.println("LinkedList content: " + Lnames);
			
			System.out.println("******************************************************");
	
	}

}
