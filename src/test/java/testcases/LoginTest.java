package testcases;

import static java.time.temporal.ChronoUnit.SECONDS;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
//@DefaultUrl("https://accounts.google.com")
public class LoginTest extends PageObject {

    @Managed(driver = "chrome")
    WebDriver driver;

    @FindBy(name = "q")
    WebElement googleSearch;

    @Title("Executing Login Test")
    @Test
    public void doLogin() {
	open();
	System.out.println(getTitle());

//		System.out.println(getImplicitWaitTimeout());
//		System.out.println(getWaitForTimeout());
//		System.out.println(getImplicitWaitTimeout());
	setImplicitTimeout(1, SECONDS);

	System.out.println(getWaitForTimeout());
	System.out.println(getImplicitWaitTimeout());
	find(By.id("identifierId")).sendKeys("phamphannhatkhanh7520");
	// waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(10);
	find(By.xpath("//span[@class='VfPpkd-vQzf8d']//parent::button")).click();

    }

}
