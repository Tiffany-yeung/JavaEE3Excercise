package Maven2.Excercises;

import java.util.HashMap;

public class Service {
	
		static int keyNumber = 1;
        
		HashMap<Integer, Account> bankData = new HashMap<Integer, Account>();
		
		public String addAccount(String firstName, String lastName, String accountNo) {
			
			Account account = new Account(firstName, lastName, accountNo);
			bankData.put(keyNumber, account);
			keyNumber++;
			return firstName + " " + lastName + " " + accountNo;
		}
		
		public Account getAccount(int keyNumber) {
			System.out.println(bankData.get(keyNumber));
			//account.toString();
			return bankData.get(keyNumber);
		}
}