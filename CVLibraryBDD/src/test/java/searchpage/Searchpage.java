package searchpage;

import driverfactory.Driverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Searchpage extends Driverfactory {

    private By cookies= By.xpath("//button[@id='save']/span/div");

   private  By jobtitle= By.xpath("//input[@maxlength='400']");

   private  By location= By.cssSelector("[placeholder='Location']");

  private  By distance= By.xpath("//select[@id='mob-distance']");

  private  By findjobs= By.cssSelector("input[type='submit']");

  private By text= By.cssSelector("[class='search-header__title']");


  public void setCookies(){
      driver.switchTo().frame("gdpr-consent-notice");
      driver.findElement(cookies).click();}
  public  void setJobtitle(String name){driver.findElement(jobtitle).sendKeys(name);}
    public void setLocation(String name){driver.findElement(location).sendKeys(name);}

    public void setDistance(){

      WebElement dis=driver.findElement(distance);
      Select sel= new Select(dis);
        sel.selectByIndex(5);}
    public void setFindjobs(){driver.findElement(findjobs).click();}

    public String settext(){return driver.findElement(text).getText();}

      public String geturl(){return driver.getCurrentUrl();}

  }


