package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utilities;
import org.openqa.selenium.By;

public class ComputerPage extends Utilities {

    By desktopCategory=By.xpath("//img[@alt='Picture for category Desktops']");
    public void clickOnDesktopCategory(){
        clickOnElement(desktopCategory);
    }

}
