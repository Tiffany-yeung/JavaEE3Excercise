package com.qa.domain;

import java.util.HashMap;

public class Service {
	
		static int keyNumber = 1;
        
		private HashMap<Integer, Account> bankData = new HashMap<Integer, Account>();
		
		public HashMap<Integer, Account> getBankData() {
			return bankData;
		}

		public void setBankData(HashMap<Integer, Account> bankData) {
			this.bankData = bankData;
		}

		public void addAccount(Account account) {
			
			if(bankData.containsKey(account.getAccountNo())) {
				System.out.println("Account already exists.");
			}
			else {
				bankData.put(keyNumber, account);
				keyNumber++;
			}
		}
		
		public Account getAccount(int keyNumber) {
			System.out.println(bankData.get(keyNumber));
			return bankData.get(keyNumber);
		}
}
