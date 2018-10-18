package com.qa.blackjack;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class Parametisation
{
	
	BlackJack BlackJack = new BlackJack();
	
	@Parameters
	public static Collection <Object[]> data()
	{
	return Arrays.asList(new Object[][] {{0,-10,-10},{0,-10,50},{10,30,10},{0,50,50},{20,10,20}});
	}
	
	private int intPected;
	private int intPut1;
	private int intPut2;
	
	public Parametisation(int expected, int input1, int input2)
	{
		intPut1 = input1;
		intPut2 = input2;
		intPected = expected;
	}
	
	@Test
	public void test1() {
		assertEquals(intPected, BlackJack.play(intPut1, intPut2));
	}
	
}