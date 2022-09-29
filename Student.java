package testCollection.exercise;

public class Student {
	private String code;
	private String name;
	private int age;
	private String state;
	
	public Student() {
		
	}
	
	public Student(String code, String name, int age, String state) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public  String getState() {
		return state;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	@Override
	public String toString() {
		return  code+"\t" +  name+"\t"  + age+"\t" +  state+"\t" ;
	}

}
