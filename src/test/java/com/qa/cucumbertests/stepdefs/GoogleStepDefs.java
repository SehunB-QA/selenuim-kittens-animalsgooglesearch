/*
 * package com.qa.cucumbertests.stepdefs;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Dimension; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; public class GoogleStepDefs {
 * 
 * private WebDriver driver = null;
 * 
 * @Given("the user can access {string}") public void the_user_can_go_to(String
 * string) { //System.setProperty("webdriver.chrome.driver",
 * "src/test/resources/chromedriver.exe"); driver = new
 * ChromeDriver(ChromeOptionsClass.chromeCfg());
 * //driver.manage().window().setSize(new Dimension(1366,768));
 * driver.get("http://google.com/");
 * 
 * }
 * 
 * @When("the user searches Kittens in the search bar") public void
 * the_user_searches_kittens_in_the_search_bar() { WebElement searchBar =
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
 * searchBar.click(); searchBar.sendKeys("Kittens");
 * 
 * WebElement searchButton = driver.findElement(By.xpath(
 * "/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
 * searchButton.click();
 * 
 * }
 * 
 * @When("the user clicks on the images link") public void
 * the_user_clicks_on_the_images_link() { WebElement imageLink =
 * driver.findElement(By.xpath(
 * "/html/body/div[7]/div[2]/div[4]/div/div[1]/div/div[1]/div/div[2]/a"));
 * imageLink.click();
 * 
 * }
 * 
 * @Then("the user should be shown images of kittens") public void
 * the_user_should_be_shown_images_of_kittens() { String pageTitle =
 * driver.getTitle(); assertEquals("Kittens - Google Search", pageTitle);
 * driver.close(); }
 * 
 * 
 * 
 * public void cleanUp() {
 * 
 * }
 * 
 * 
 * }
 */