package Demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

	@Test
	void notEnoughFunds() {
		//Create an Object for the BankAccount class
		BankAccount account = new BankAccount(10);
		
		//Assetion for exception
	    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(11), 
	    		"Balance must be more than the amount tried to withdraw");
		
	System.out.println("Treid to withdraw the amount more than the funds");
	}
	
	@Test
	void enoughFunds() {
		BankAccount account = new BankAccount(400);
		
		// Assertion for no exceptions
	    assertDoesNotThrow(() -> account.withdraw(100));
	
	}
}

