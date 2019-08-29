package test;

import java.util.Locale;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import page.BasePage;
import driver.OpenBrowser;

public class SubmitForm {
private WebDriver navegador;
	
	@Before
	public void setUp() {
		navegador = OpenBrowser.openChrome();
	}
	@Test
	public void preencherFormularioDesafioQa()  {
		Faker faker = new Faker(new Locale("pt-BR"));
		
		BasePage submit = new BasePage(navegador);
			submit.name(faker.name().fullName());
			submit.email(faker.internet().emailAddress());
			submit.cityState(faker.address().cityName());
			submit.message(faker.lorem().paragraph());
			submit.clickSubmit();
			
		
	  assertEquals("Sua resposta foi registrada.", submit.capturarTextSubmit() );
	}
	@After
	public void tearDown() {
		navegador.quit();
	}	

}
