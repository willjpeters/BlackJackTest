package com.qa.blackjack;

import static org.junit.Assert.assertEquals;	
import org.junit.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		public class BlackjackTest {
	
		static int x = 1;
		
		//initialise ExtentReports with a file path 
		boolean replaceExisting = true;
			
	@BeforeClass
	public static void welcome()
	{
		System.out.println("Welcome to my Tests");
	}
	
	@Before
	public void setup()
	{
		System.out.println("Test " + x + "/17");
	}
	
	@Test
	public void testy1() {
		BlackJack b = new BlackJack();
		assertEquals("both invalid", 0, b.play(-10, -10));
	}
	
	@After
	public void teardown()
	{
		System.out.println("Test " + x + "/17 finished");
		x++;
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
	public void testy6() {
		BlackJack b = new BlackJack();
		assertEquals("player wins", 10, b.play(10, 30));
	}
	
	@Test
	public void testy7() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(10, 50));
	}
	
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
	
	@Test
	public void testy10() {
		BlackJack b = new BlackJack();
		assertEquals("dealer invalid", 0, b.play(30, -10));
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
	
	@AfterClass
	public static void end()
	{
		System.out.println("Test class complete");
	}
}