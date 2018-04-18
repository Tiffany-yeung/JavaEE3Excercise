package Maven2.Excercises;

import java.util.Scanner;

public class Main {

	private static Scanner userInput;

	public static void main(String[] args) {

		userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstNameInput = userInput.next();
		System.out.println("Please enter your last name:");
		String lastNameInput = userInput.next();
		System.out.println("Please enter your account number:");
		String accountNoInput = userInput.next();
		
		Service service = new Service();
		
		service.addAccount(firstNameInput, lastNameInput, accountNoInput);
		System.out.println("The key number to your new account is: " + (Service.keyNumber-1));
		
		
		System.out.println("Please enter the key number to view data:");
		int keyNumberInput = userInput.nextInt();

		service.getAccount(keyNumberInput);
	}
}
