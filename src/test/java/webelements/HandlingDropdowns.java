package webelements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingDropdowns extends PageObject {

    @Managed()
    private WebDriver driver;

    /**
     * 
     * 
     * English - US English - UK
     * 
     * 
     **/

    @Test
    public void webElementTest() throws Exception {
	open();

	// find(By.id("searchLanguage")).getSelectOptions();
	List<WebElementFacade> values = findAll(By.tagName("option"));

	System.out.println(values.get(7).getText());

	for (WebElementFacade value : values) {
	    System.out.println(value.getAttribute("lang"));
	}

    }
}
