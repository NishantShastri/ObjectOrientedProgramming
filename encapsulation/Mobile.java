package encapsulation;

public class Mobile {
	
	private String Username;
	private String Password;
	
	public String getUsername() {
		return Username;
	}
	
	public void setUsername (String Username) {
		this.Username = Username;
	}
	
	public String getPassword () {
		return Password;
	}
	
	public void setPassword (String Password) {
		if (Password.length() >= 8) {
			this.Password = Password;
			System.out.println("Valid User");
		}
		else {
			System.out.println("Enter password greater than 8 charecter");
		}
	}
	
}
