package com.testng;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import gherkin.formatter.Reporter;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Basic {

	@Test(priority = 1, groups = "stat")
	private static void book() {
    System.out.println("BOOK");
	}
    

	@Test(timeOut = 2000,groups = {"stat","animal"})
	private static void apple() throws InterruptedException {
    System.out.println("APPLE");
	}
	
	@Test(priority = -1, groups = "animal")
	private static void dog() {
    System.out.println("DOG");
	}
	
	@Test(groups = "animal",timeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
	private static void cat() throws InterruptedException {
	Thread.sleep(3000);
    System.out.println("CAT");
	}
	
	@Test(groups = "stat")
	private static void pen() {
    System.out.println("PEN");
	}
}
