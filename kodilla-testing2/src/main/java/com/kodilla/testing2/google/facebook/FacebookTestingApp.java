package com.kodilla.testing2.google.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";
    public static final String XPATH_SELECT_DATE_OF_BIRTH = "//span[contains(@class, \"_5k_4\")]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_SELECT_DATE_OF_BIRTH)).isDisplayed());

        WebElement selectFbDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement selectFbMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement selectFbYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));

        Select selectDay = new Select(selectFbDay);
        Select selectMonth = new Select(selectFbMonth);
        Select selectYear = new Select(selectFbYear);

        selectDay.selectByValue("6");
        selectMonth.selectByValue("10");
        selectYear.selectByValue("2019");
    }
}
