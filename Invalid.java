package com.qa.blackjack;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Invalid {

	@Test
	public void testy1() {
		BlackJack b = new BlackJack();
		assertEquals("both invalid", 0, b.play(-10, -10));
	}
	
	@Test
	public void testy2() {
		BlackJack b = new BlackJack();
		assertEquals("player invalid", 0, b.play(-10, 10));
	}
	
	@Test
	public void testy3() {
		BlackJack b = new BlackJack();
		assertEquals("player invalid", 0, b.play(-10, 30));
	}
	
	@Test
	public void testy4() {
		BlackJack b = new BlackJack();
		assertEquals("both invalid", 0, b.play(-10, 50));
	}
	
	@Test
	public void testy5() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(10, -10));
	}
	
	@Test
	public void testy7() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(10, 50));
	}
	
	@Test
	public void testy10() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(30, -10));
	}
	
	@Test
	public void testy13() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(30, 50));
	}
	
	@Test
	public void testy14() {
		BlackJack b = new BlackJack();
		assertEquals("both invalid", 0, b.play(50, -10));
	}
	
	@Test
	public void testy15() {
		BlackJack b = new BlackJack();
		assertEquals("player invalid", 0, b.play(50, 10));
	}
	
	@Test
	public void testy16() {
		BlackJack b = new BlackJack();
		assertEquals("player invalid", 0, b.play(50, 30));
	}
	
	@Test
	public void testy17() {
		BlackJack b = new BlackJack();
		assertEquals("both invalid", 0, b.play(50, 50));
	}
	
}
