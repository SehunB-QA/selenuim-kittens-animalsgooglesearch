package com.qa.cucumbertests.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnimalsSearchStepDefs {
	
	private static RemoteWebDriver driver;
    

	@Given("the user can access {string}")
	public void the_user_can_access(String string) {
		 driver = SelenuimWebDriver.getDriver();
			driver.manage().window().setSize(new Dimension(1366,768));
		    driver.get("http://" + string);
		}
	

	@When("the user types the term  {string} in the search bar")
	public void the_user_types_the_term_in_the_search_bar(String string) {
		 WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		   searchBar.click();
		   searchBar.sendKeys(string);
		   
		   WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
		   searchButton.click();
	}

	@When("the user clicks on the google images link")
	public void the_user_clicks_on_the_google_images_link() {
		   WebElement imageLink = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[4]/div/div[1]/div/div[1]/div/div[2]/a"));
		   imageLink.click();
	}

	@Then("the user should see images of {string}.")
	public void the_user_should_see_images_of(String string) {
		  String pageTitle = driver.getTitle();
		    assertEquals(string + " - Google Search", pageTitle);
	}
	}

