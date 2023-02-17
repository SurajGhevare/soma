package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicExp1 {
	public void LaunchAUT()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium data\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SadbasicExp1 obj=new SadbasicExp1();
		obj.LaunchAUT();
	}

}
