package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public BasePage name(String name) {
		navegador.findElement(By.name("entry.1643251653")).sendKeys(name);
		return this;
	}
	public BasePage email(String email) {
		navegador.findElement(By.name("entry.17350902")).sendKeys(email);
		return this;
	}
	
	public BasePage cityState(String city) {
		navegador.findElement(By.name("entry.975579715")).sendKeys(city);
		return this;
	}
	
	public BasePage message(String message) {
		navegador.findElement(By.name("entry.2005929968")).sendKeys(message);
		return this;
	}
	public BasePage clickSubmit() {
		navegador.findElement(By.xpath("//span[@class='quantumWizButtonPaperbuttonLabel exportLabel']")).click();
		
		return this;
	}
	
	public BasePage toFillForm(String name,String email,String city,String message) {
		   name(name);
		   email(email);
		   cityState(city);
		   message(message);
		   return new BasePage(navegador);
	   }
	public String capturarTextSubmit() {
		return navegador.findElement(By.xpath("//div[@class='freebirdFormviewerViewResponseConfirmationMessage']")).getText();
	}

}
