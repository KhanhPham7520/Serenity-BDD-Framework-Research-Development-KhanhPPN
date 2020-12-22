package exercises_testcases;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Handling_Link_Dropdown extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void checkListNumberItem() {

	open();

	WebElementFacade values = $("//select[@id='job1']");

	List<WebElementFacade> multipleDropdownItems = values.thenFindAll(By.tagName("option"));

	for (WebElementFacade items : multipleDropdownItems) {
	    System.out.println(items.getText());
	}

	System.out.println("Item name : " + multipleDropdownItems.size());
    }
}
