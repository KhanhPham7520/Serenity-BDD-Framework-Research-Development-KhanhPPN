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
public class HandlingLinks extends PageObject {

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
    public void WebElementTest() throws Exception {
	open();

	// find(By.id("searchLanguage")).getSelectOptions();

	WebElementFacade section = $("//div[@class='other-project-text']");

	WebElementFacade dropdown = find(By.id("searchLanguage"));

	// List<WebElementFacade> links = findAll(By.tagName("option"));
	List<WebElementFacade> links = section.thenFindAll(By.tagName("option"));

	System.out.println(links.get(7).getText());

	for (WebElementFacade link : links) {
	    System.out.println("Link text is : " + link.getText() + "---Printing---" + link.getAttribute("lang"));
	}

	System.out.println("Total Count of Link : " + links.size());

    }
}
