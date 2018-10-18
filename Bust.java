package com.qa.blackjack;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Bust {
	
	@Test
	public void testy6() {
		BlackJack b = new BlackJack();
		assertEquals("player wins", 10, b.play(10, 30));
	}
	
	@Test
	public void testy11() {
		BlackJack b = new BlackJack();
		assertEquals("dealer wins", 10, b.play(30, 10));
	}
	
	@Test
	public void testy12() {
		BlackJack b = new BlackJack();
		assertEquals("both bust", 0, b.play(30, 30));
	}
}
