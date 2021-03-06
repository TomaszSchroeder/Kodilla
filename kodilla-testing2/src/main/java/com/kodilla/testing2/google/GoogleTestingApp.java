package com.kodilla.testing2.google;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    //niestety metody opisane w rozdziale 31.2 nie działają u mnie, więc musiałem zrobić to inaczej.
    // Poza tym Chrome nie chce współpracować, działa za to pod Firefoxem
    //public static final String SEARCHFIELD = "searchbox";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
