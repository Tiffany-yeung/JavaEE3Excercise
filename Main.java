package com.qa.domain;

import java.util.Scanner;
import com.google.gson.*;

public class Main {

	private static Scanner userInput;

	public static void main(String[] args) {

		userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstNameInput = userInput.next();
		System.out.println("Please enter your last name:");
		String lastNameInput = userInput.next();
		System.out.println("Please enter your account number:");
		int accountNoInput = userInput.nextInt();
		
		Service service = new Service();
		Account Tiffany = new Account(firstNameInput, lastNameInput, accountNoInput);
		service.addAccount(Tiffany);
		System.out.println("The key number to your new account is: " + (Service.keyNumber-1));
		
		System.out.println("Please enter the key number to view data:");
		int keyNumberInput = userInput.nextInt();

		service.getAccount(keyNumberInput);
		
		System.out.println("");
		System.out.println("GSON:");
		Gson gson = new Gson();
		String json = gson.toJson(service.getBankData());
		System.out.println(json);
	}
}
