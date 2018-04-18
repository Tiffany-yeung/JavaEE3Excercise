package Maven2.Excercises;

public class Account {
    	
	private String firstName;
	private String lastName;
	private String accountNo;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public Account (String firstName, String lastName, String accountNo) {
		this.firstName = firstName;	//setters
		this.lastName = lastName;
		this.accountNo = accountNo;
	}
	
	public String toString() {
		return "First Name: " + firstName + ". Last Name: " + lastName 
				+ ". Account Number: " + accountNo;
	}
	
}
