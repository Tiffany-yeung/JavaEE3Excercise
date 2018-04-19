package com.qa.test;
import static org.junit.Assert.*;
import org.junit.Test;

import com.google.gson.Gson;
import com.qa.domain.Account;
import com.qa.domain.Service;

public class MainTest {
	
		Service service = new Service();
		
	@Test
	public void addAccountTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		service.addAccount(Tiffany);
		Integer expected = 1;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	public void addTwoSameAccountNumbersTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		Account Rachel = new Account("Rachel", "O Connell", 001);
		service.addAccount(Tiffany);
		service.addAccount(Rachel);
		Integer expected = 1;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	public void addTwoDifferentAccountNumbersTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		Account Rachel = new Account("Rachel", "O Connell", 002);
		service.addAccount(Tiffany);
		service.addAccount(Rachel);
		Integer expected = 2;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	//System.out.println("GSON:");
	Gson gson = new Gson();
	String json = gson.toJson(service.getBankData());
	//System.out.println(json);
	
}
