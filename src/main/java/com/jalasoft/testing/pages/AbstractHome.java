package com.jalasoft.testing.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Carlos Gonzales on 5/16/2016.
 */
public abstract class AbstractHome extends AbstractBasePage {

    @FindBy(name = "new")
    protected WebElement newButton;

    abstract public AbstractBasePage clickNewButton();

}
