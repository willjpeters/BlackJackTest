package com.qa.blackjack;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Normal {
	
	@Test
	public void testy8() {
		BlackJack b = new BlackJack();
		assertEquals("player wins", 20, b.play(20, 10));
	}
	
	@Test
	public void testy9() {
		BlackJack b = new BlackJack();
		assertEquals("dealer wins", 20, b.play(10, 20));
	}
}