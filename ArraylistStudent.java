/*
 * 2.	Create an ArrayList object students, and store the following students in that list.

Student
	studentcode
	studentname
	age
	state

Student Code	Student Name	Age	State
AF0216223	Aryan Raj		21	Andra Pradhesh
AF0216224	Bivor Kumar		22	Andra Pradhesh
AF0216227	SUSHMITA KUMARI	23	Madhya Pradesh
AF0216231	Ragiv Zafar		24	Maharashtra
AF0216232	RAHUL MAHTO		25	Orissa
AF0216234	Nainsi Kumari	19	Gujarath
AF0216236	MD ALI			26	Madhya Pradesh
AF0216238	ABHISHEK KUMAR	22	Andra Pradhesh
AF0216240	AFROZ ANSARI	21	Maharashtra
AF0216259	RITIK RAJ		20	Orissa
AF0216263	Anant Kumar		25	Andra Pradhesh
AF0216305	BABU KUMAR		24	Gujarath
AF0216307	NIKITA KUMARI	23	Madhya Pradesh
AF0216353	PRANAV PANDEY	22	Orissa
AF0216964	Radheshyam Kumar	21	Maharashtra
AF0216973	Ankur Utpal		19	Gujarath
AF0217607	Banty Mishra	18	Madhya Pradesh
AF0217615	RIYA KUMARI		20	Karnataka
AF0217791	Priyadarshani Kumari	21	Maharashtra
AF0223373	Chanchal Thakur	22	Orissa
AF0221549	SATENDRA KUMAR	23	Maharashtra
AF0216212	Pappi Verma		24	
AF0216244	Ramkrishna Kushwah	25	Andra Pradhesh
AF0216245	Yogita Tamoliya	26	Orissa

Find the students aged over 20

Find students from the state Andhra Pradhesh

Sort students by their age.

	Sort students by state and student name.
*/
package testCollection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistStudent {
	
	public static void main (String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
	
		al.add (new Student("AF0216223",	"Aryan Raj				",	21,	"Andra Pradhesh"));
		al.add (new Student("AF0216224",	"Bivor Kumar			",	22,	"Andra Pradhesh"));
		al.add (new Student("AF0216227",	"SUSHMITA KUMARI		",	23,	"Madhya Pradesh"));
		al.add (new Student("AF0216231",	"Ragiv Zafar			",	24,	"Maharashtra"));
		al.add (new Student("AF0216232",	"RAHUL MAHTO			",	25,	"Orissa"));
		al.add (new Student("AF0216234",	"Nainsi Kumari			",	19,	"Gujarath"));
		al.add (new Student("AF0216236",	"MD ALI					",	26,	"Madhya Pradesh"));
		al.add (new Student("AF0216238",	"ABHISHEK KUMAR			",	22,	"Andra Pradhesh"));
		al.add (new Student("AF0216240",	"AFROZ ANSARI			",	21,	"Maharashtra"));
		al.add (new Student("AF0216259",	"RITIK RAJ				",	20,	"Orissa"));
		al.add (new Student("AF0216263",	"Anant Kumar			",	25,	"Andra Pradhesh"));
		al.add (new Student("AF0216305",	"BABU KUMAR				",	24,	"Gujarath"));
		al.add (new Student("AF0216307",	"NIKITA KUMARI			",	23,	"Madhya Pradesh"));
		al.add (new Student("AF0216353",	"PRANAV PANDEY			",	22,	"Orissa"));
		al.add (new Student("AF0216964",	"Radheshyam Kumar		",	21,	"Maharashtra"));
		al.add (new Student("AF0216973",	"Ankur Utpal			",	19,	"Gujarath"));
		al.add (new Student("AF0217607",	"Banty Mishra			",	18,	"Madhya Pradesh"));
		al.add (new Student("AF0217615",	"RIYA KUMARI			",	20,	"Madhya Pradesh"));
		al.add (new Student("AF0217791",	"Priyadarshani Kumari	",	21,	"Maharashtra"));
		al.add (new Student("AF0223373",	"Chanchal Thakur		",	22,	"Orissa"));
		al.add (new Student("AF0221549",	"SATENDRA KUMAR			",	23,	"Maharashtra"));
		al.add (new Student("AF0216212",	"Pappi Verma			",	24,	""));
		al.add (new Student("AF0216244",	"Ramkrishna Kushwah		",	25,	"Andra Pradhesh"));
		al.add (new Student("AF0216245",	"Yogita Tamoliya		",	26,	"Orissa"));
		
		System.out.println("**************************************************************");
		System.out.println("        		  WELCOME TO JAVA WORLD                   ");
		System.out.println("**************************************************************");
		System.out.println("              			Student Table                ");
		System.out.println("**************************************************************");
	// <!---Printing list of students.--->
		/*
			for(Student stud:al) {
				System.out.println(stud);		
			}
		 */
		System.out.println("***************************************************************");
	//<!---Printing list of students whose age is above 20.--->

			for(Student stud: al) {
				if(stud.getAge()>20)
					System.out.println(stud);    
				}
		System.out.println("***************************************************************");
	//<!---Shorting students who were from Andhra Pradesh.--->

			for(Student stud : al) {
				if(stud.getState()=="Andra Pradhesh")
					System.out.println(stud);
			}
		System.out.println("***************************************************************");
	//<!---Shorting students according to their age.--->
		  
		  Collections.sort(al, new AgeComprator());  
		  
		  Iterator<Student> itr2=al.iterator();  
			
		  while(itr2.hasNext()){  
			  Student stud=itr2.next();  
			  System.out.println(stud);  
		  } 
		System.out.println("***************************************************************");
	//<!---Shorting students according to their State.--->
		  
		  Collections.sort(al, new StateComprator());  
		  
		  Iterator<Student> itr3=al.iterator();  
			
		  while(itr3.hasNext()){  
			  Student stud=itr3.next();  
			  System.out.println(stud);  
		  } 
		System.out.println("***************************************************************");
	//<!---Shorting students according to their Name.--->
		  
		  Collections.sort(al, new NameComprator());  
		  
		  Iterator<Student> itr4=al.iterator();  
			
		  while(itr4.hasNext()){  
			  Student stud=itr4.next();  
			  System.out.println(stud);  
		  } 
		System.out.println("***************************************************************");
	}
}