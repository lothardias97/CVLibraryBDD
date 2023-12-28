package driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Driverfactory {

  public static WebDriver driver;


  public void setupbrowser() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://www.cv-library.co.uk/");
      driver.manage().window().maximize();
  }

    public void teardown(){
      driver.close();

  }
  public Driverfactory(){
      PageFactory.initElements(driver,this);
  }
}
