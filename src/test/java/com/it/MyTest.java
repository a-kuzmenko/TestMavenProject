package com.it;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MyTest {
   public String url;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"https://mvnrepository.com/"},
                {"https://www.seleniumhq.org/"},
                {"https://github.com/github"}});
    }

    public MyTest(String url) {
        this.url = url;
    }

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        System.out.println("-------test1-------");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Assert.assertEquals(url, driver.getCurrentUrl());

        Thread.sleep(5000);
        driver.quit();
    }


}
