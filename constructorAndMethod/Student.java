package constructorAndMethod;

public class Student {
	
	String fname, lname, email;
	int age;
	long mobileNo;
	
	public Student (String fname, String lname, int age, long mobileNo, String email) {
		
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
		
	}
	
	public void display () {
		
		System.out.println("First name --> " + fname);
		System.out.println("Last name --> " + lname);
		System.out.println("Age --> " + age);
		System.out.println("Mobile No --> " + mobileNo);
		System.out.println("Email --> " + email);
	}

}
