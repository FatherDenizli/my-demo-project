package projectbaseclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {



        public static WebDriver driver ;

        @BeforeMethod

        public void launchDriver() {

            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-116\\chromedriver-win64\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().fullscreen();
        }

        @Test

        public void Test1()     {


            driver.get("https://www.amazon.ca/");

            System.out.println("Test 1 title is  "+driver.getTitle());

        }

        @Test

        public void Test2()  {


            driver.get("https://www.google.com/");
            System.out.println("Test 2 title is  "+driver.getTitle());

        }

        @Test

        public void Test3() {

            driver.get("https://www.techproeducation.com/");
            System.out.println("Test 2 title is  "+driver.getTitle());
        }

        @AfterMethod

        public void tearDown() {
            driver.close();
            //if test case fails then log defect in JIRA

        }

    }




