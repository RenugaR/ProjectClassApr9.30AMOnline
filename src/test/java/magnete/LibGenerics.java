package magnete;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LibGenerics {
	
static WebDriver driver,driver1;
	
	public WebDriver browserLaunch() {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\dmin\\eclipse-workspace\\magnete\\driver\\geckodriver.exe");

	driver = new FirefoxDriver();
	driver.manage().window().maximize();

	return driver;

}
	
		
	public void launchURL(String url) {
		
		driver.get(url);
		}
	
	
	public void titleofpage() {
		String q = driver.findElement(By.xpath("//*[contains(text(),'This is demo site')]")).getText();
		System.out.println(q);
	}
	
	public void mobilemenu() {
		WebElement mm = driver.findElement(By.xpath("//*[@id=\'nav\']/ol/li[1]/a"));
		mm.click();
	}
	
		public void mmhead() {
		String q1 = driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1")).getText();
		System.out.println(q1);
	}
	
	public void ddnsortby() {
		WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));  
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByVisibleText("Name");
	}
	
	public void verifysort() {
		String sortElement = driver.findElement(By.xpath("//li[1]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "IPhone");
		System.out.println(sortElement);
		sortElement = driver.findElement(By.xpath("//li[2]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "Samsung Galaxy");
		System.out.println(sortElement);
		sortElement = driver.findElement(By.xpath("//li[3]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "Xperia");
		System.out.println(sortElement);
	}
	
	public void SonyXperiaprice() {
		String q2 = driver.findElement(By.xpath("//*[@id='product-price-1']/span")).getText();
		System.out.println(q2);
	}
	
	public void Sonyclick() {
		WebElement sclq = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a"));
		sclq.click();
	}
	
	public void iphoneclick() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a")).click();
	}
	
	public void samclick() {
		driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a")).click();
	}
	public void sonyread() {
		String q3 = driver.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div[1]/span")).getText();
		System.out.println(q3);
	}
	
	public void addtocompare() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/ul[1]/li[2]/a")).click();
		
	}
	
	public void addtocompareiphone() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/ul[1]/li[2]/a")).click();
	}
	
	public void btncompre() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/div[2]/div/button")).click();
	}
	public void switchchildwindow() throws InterruptedException {
		String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);
        Set<String> winHandles = driver.getWindowHandles();
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle)){
            driver.switchTo().window(handle);
            Thread.sleep(1000);
            System.out.println("Title of the new window: " +   driver.getTitle());
        driver.manage().window().maximize();
		driver.close();
            }
        }
	}
	
	public void parentswitch() {
		String url = "https://live.demoguru99.com/";
		driver.switchTo().window(url);
	}
	
	public void addtocart() {
		driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")).click();
	}
	
	public void itemcount() {
		WebElement ttt = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input"));
		ttt.sendKeys("000");
	}
	
	public void updatecrt() {
		driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
	}
	
	public void VerifyErrormsg() {
		String errmsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[2]/p")).getText();
		Assert.assertEquals(errmsg, "* The maximum quantity allowed for purchase is 500.");
	}
	
	public void emptycart() {
		driver.findElement(By.xpath("//*[@id='empty_cart_button']")).click();
	}
	
	public void cartemtyver() {
		String errmsg1 = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		Assert.assertEquals(errmsg1, "SHOPPING CART IS EMPTY");
	}
	
	public void Accout() {

		driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")).click();
		
	}
	
	public void newaccount() {

		driver.findElement(By.id("firstname")).sendKeys("RAMYA");
		driver.findElement(By.id("lastname")).sendKeys("S");
		driver.findElement(By.id("email_address")).sendKeys("1255@4231.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirmation")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
	}
	
	public void checkinfonewuser() {
		String newusr = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")).getText();
		Assert.assertEquals(newusr, "Thank you for registering with Main Website Store.");
		System.out.println(newusr);
		}
	
	
	public void AddwhishlistlgTVshare() {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/nav/ol/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]/span/span")).click();
		driver.findElement(By.id("email_address")).sendKeys("sramyaarun172@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button/span/span")).click();
		String wls = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText();
		Assert.assertEquals(wls, "Your Wishlist has been shared.");
		System.out.println(wls);
	}
	
	public void myacclink() {
		//Account link
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[1]/a")).click();
		//LOGIN 	
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[2]/div[1]/ul/li[1]/div/input")).sendKeys("venarunxp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("send2")).click();
		//MY WISHLIST
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")).click();
		//ADD to cart
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr/td[5]/div/button/span/span")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")).click();
	}
	
	public void checkout() {
		//1 billing info
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/ul/li[2]/div/ul/li[3]/div/input")).sendKeys("gstreet");
		driver.findElement(By.id("billing:city")).sendKeys("NEWYORK");
		driver.findElement(By.id("billing:region_id")).sendKeys("New York");
		driver.findElement(By.id("billing:postcode")).sendKeys("542896");
		driver.findElement(By.id("billing:country_id")).sendKeys("United States");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button/span/span")).click();
		//Estimate
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/form[1]/div/button/span/span")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/form[2]/dl/dd/ul/li/label")).click();
		
		String qqq = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/table/tbody/tr[2]/td[1]")).getText();
		Assert.assertEquals(qqq , "SHIPPING & HANDLING (FLAT RATE - FIXED)");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/form[2]/div/button")).click();
	
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span")).click();
	
	}
	
	public void billinginfo() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button/span/span")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/form/div/dl/dt[2]/label")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")).click();
		//placeorder
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button")).click();
		String qsw = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/p[1]/a")).getText();
		String sww = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		Assert.assertEquals(sww, "YOUR ORDER HAS BEEN RECEIVED");
		System.out.println(qsw);
	}
	
	public void pdfverify() {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[2]/div[1]/ul/li[1]/div/input")).sendKeys("venarunxp@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[2]/div[1]/ul/li[2]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/span/a[1]")).click();
		String penver = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/h1")).getText();
		Assert.assertEquals(penver, "ORDER #100013525 - PENDING");
		System.out.println(penver);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")).click();
	}
	public void quit() {
		
		driver.quit();

		}

}