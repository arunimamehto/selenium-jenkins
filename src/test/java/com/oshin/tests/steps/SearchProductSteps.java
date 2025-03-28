package com.oshin.tests.steps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.oshin.tests.base.BaseTest;

public class SearchProductSteps extends BaseTest {
	
	@Test(priority = 1)
	public void openAmazon() {
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
		System.out.println("Step 1 : Open Amazon");
	}
	
	@Test(priority =2)
	public void searchProduct() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        System.out.println("Step 2: Search for a Laptop");
	}
	
	@Test(priority=3)
	public void verifySearchResults() {
		 Assert.assertTrue(driver.getPageSource().contains("results"));
	        System.out.println("Step 3: Verify search results");
	}

}
