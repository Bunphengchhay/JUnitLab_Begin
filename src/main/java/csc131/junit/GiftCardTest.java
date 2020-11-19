package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;
public class GiftCardTest {
	@Test
	public void getIssuingStore(){
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()",
		issuingStore, card.getIssuingStore());
		
		assertEquals("getIssingStore()", issuingStore, card.getIssuingStore());
		//assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void getBalance() {
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()",
		issuingStore, card.getIssuingStore());
		
		String say ="";
		String named = "";
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
		//assertEquals(named, say, "getIssuingStore()");
		
		
	}
	
	@Test
	public void deduct() {
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		String s = "Remaining Balance: " + String.format("%6.2f", 90.00);
		assertEquals("deduct(10.00)", s, card.deduct(10.0));
	}
	
}
