package com.itechart.pages;

import com.codeborne.selenide.Selenide;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class HomePage extends BasePage {
    private final By LOGO_LOCATOR = By.xpath("//*[contains(@class, 'slds-page-header')]//ancestor::lightning-primitive-icon/*[@data-key='home']");

    public HomePage open() {
        Selenide.open(baseUrl);
        return this;
    }

    @Override
    public boolean isPageOpened() {
        return $(LOGO_LOCATOR).isDisplayed();
    }
}


