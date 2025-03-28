package com.oshin.tests.scenarios;

import com.oshin.tests.steps.SearchProductSteps;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(SearchProductSteps.class)
public class SearchProductTestRunner {
	
	@Test
	public void runScenario() {
		System.out.println("Running Scenario: Search Product");
	}
}
