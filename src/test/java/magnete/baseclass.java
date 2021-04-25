package magnete;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseclass {
	LibGenerics l= new LibGenerics();
	@BeforeMethod
	private void start() {
		String url = "https://live.demoguru99.com/";
		WebDriver d = l.browserLaunch();
		l.launchURL(url);
public class baseclass {
	LibGenerics l= new LibGenerics();
	@BeforeMethod
	private void start() {
		String url = "https://live.demoguru99.com/";
		WebDriver d = l.browserLaunch();
		l.launchURL(url);
	}
	@Test
	private void Testcase1() {
		l.titleofpage();
		l.mobilemenu();
		l.mmhead();
		l.ddnsortby();
		l.verifysort();
		}
	
	@Test 
	private void Testcase2() throws InterruptedException {
		l.mobilemenu();
		l.SonyXperiaprice();
		l.Sonyclick();
		l.addtocompare();
		l.sonyread();
		l.mobilemenu();
		l.iphoneclick();
		l.addtocompare();
		l.mobilemenu();
		l.samclick();
		l.addtocompare();
		l.mobilemenu();
		l.switchchildwindow();
		}
	@Test 
	private void Testcase3() {
		l.mobilemenu();
		l.addtocart();
		l.itemcount();
		l.updatecrt();
		l.VerifyErrormsg();
		l.emptycart();
		l.cartemtyver();
		}
	@Test 
	private void Testcase4() throws InterruptedException {
		l.mobilemenu();
		l.Sonyclick();
		l.addtocompare();
		l.mobilemenu();
		l.iphoneclick();
		l.addtocompare();
		l.mobilemenu();
		l.btncompre();
		l.switchchildwindow();
		}
	@Test 
	private void Testcase5() {
		l.Accout();
		l.newaccount();
		l.checkinfonewuser();
		l.AddwhishlistlgTVshare();
		}
	@Test 
	private void Testcase6() {
		l.myacclink();
		l.checkout();
		l.billinginfo();
	}
	@Test
	private void Testcase7() {
		l.pdfverify();
	}
	
	@AfterMethod
	private void stop() {
		l.quit();
	}
}
