package com.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogOutTestNG {
	/*
	 * @BeforeSuite public static void getSuite() {
	 * 
	 * System.out.println("this is my suite"); }
	 * 
	 * @BeforeMethod public static void getMethod() {
	 * 
	 * System.out.println("this is my  method"); }
	 * 
	 * @Test public static void getTest() {
	 * 
	 * System.out.println("this is my test"); }
	 * 
	 * @BeforeClass public void getClas() {
	 * 
	 * System.out.println("this is my class"); }
	 * 
	 * 
	 */
	
	
	
	  @Test(priority=2, groups = "smoke" ) 
	  @Parameters("name")
	  public static void getLogin(String name) {
	  
	  System.out.println("this is my login method"); 
	  System.out.println(name);
	  }
	  
	  @Test(priority=1 , groups = {"smoke", "functional" }) 
	  public static void getSignUp() {
	 
	  System.out.println("this is my signup  method"); 
	  }
	  
	  @Test(priority=3, groups={"functional", "regression"})
	  
	  public static void getLogOut() {
	  
	  System.out.println("this is my logout method"); }
	 
}
