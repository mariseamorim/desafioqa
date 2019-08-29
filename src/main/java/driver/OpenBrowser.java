package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static WebDriver openChrome()
    {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Navegando para pagina Google Forms
		navegador.get("https://docs.google.com/forms/d/e/1FAIpQLScQ7Ej_21M73p2Qf1SaRQt8LgUKGMmPcJt35K8odJKEXzCSMA/viewform?vc=0&c=0&w=1");
		return navegador;
    	
    }

}
