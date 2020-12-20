package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject {

	@Managed(driver = "chrome")
	WebDriver driver;

	@Title("Executing Login Test")
	@Test
	public void doLogin() throws Exception {
		open();
		find(By.id("identifierId")).sendKeys("phamphannhatkhanh7520@gmail.com");
		find(By.xpath(
				"//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']"))
						.click();
		//find(By.id("")).click();

	}

}
