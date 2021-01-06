package nl.hsac.fitnesse.fixture.slim.web;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShadowDomTest extends BrowserTest {

    private WebDriver driver = getSeleniumHelper().driver();
    private Shadow shadow = new Shadow(driver);

    public WebElement findElement(WebElement parent, String cssSelector) {
        return shadow.findElement(parent, cssSelector);
    }

    public List<WebElement> findElements(String cssSelector) {
        return shadow.findElements(cssSelector);
    }

    @Override
    public boolean click(String cssSelector) {
        WebElement element = shadow.findElement(cssSelector);
        return super.clickElement(element);
    }

    public WebElement getShadowElement(WebElement parent, String selector) {
        return shadow.getShadowElement(parent, selector);
    }

    public List<WebElement> getAllShadowElement(WebElement parent, String selector) {
        return shadow.getAllShadowElement(parent, selector);
    }

    public WebElement getParentElement(WebElement element) {
        return shadow.getParentElement(element);
    }

    public List<WebElement> getChildElements(WebElement parent) {
        return shadow.getChildElements(parent);
    }

    public List<WebElement> getSiblingElements(WebElement element) {
        return shadow.getSiblingElements(element);
    }

    public WebElement getSiblingElement(WebElement element, String selector) {
        return shadow.getSiblingElement(element, selector);
    }

    public WebElement getNextSiblingElement(WebElement element) {
        return shadow.getNextSiblingElement(element);
    }

    public WebElement getPreviousSiblingElement(WebElement element) {
        return shadow.getPreviousSiblingElement(element);
    }

    public boolean isVisible(WebElement element) {
        return shadow.isVisible(element);
    }

    public boolean isChecked(WebElement element) {
        return shadow.isChecked(element);
    }

    public boolean isDisabled(WebElement element) {
        return shadow.isDisabled(element);
    }

    public String getAttribute(WebElement element, String attribute) {
        return shadow.getAttribute(element, attribute);
    }

    public void selectCheckbox(WebElement parentElement, String label) {
        shadow.selectCheckbox(parentElement, label);
    }

    public void selectCheckbox(String label) {
        shadow.selectCheckbox(label);
    }

    public void selectRadio(WebElement parentElement, String label) {
        shadow.selectRadio(parentElement, label);
    }

    public void selectRadio(String label) {
        shadow.selectRadio(label);
    }

    public void selectDropdown(WebElement parentElement, String label) {
        shadow.selectDropdown(parentElement, label);
    }

    public void selectDropdown(String label) {
        shadow.selectDropdown(label);
    }

    public void scrollTo(WebElement element) {
        shadow.scrollTo(element);
    }
}
