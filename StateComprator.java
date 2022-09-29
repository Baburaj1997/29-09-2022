package testCollection.exercise;

import java.util.Comparator;

public class StateComprator implements Comparator<Student> {
	
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getState().compareTo(s2.getState());
			}

}
