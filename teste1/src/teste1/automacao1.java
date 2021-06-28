package teste1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automacao1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iniciando webdriver
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32 (1)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		//adicionando temporizador
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//abrindo o site
                driver.get("https://opentdb.com");		
		
        	//encontrando o botao browse
		WebElement caixabrowse = driver.findElement(By.className("fa-bars"));
		caixabrowse.click();
		
		//pesquisando o tema desejado
		WebElement caixabusca = driver.findElement(By.id("query"));
		caixabusca.sendKeys("Science: Computers");
		
		//clicando no botao de busca
		WebElement botaobusca = driver.findElement(By.className("btn-default"));
		botaobusca.click();		
		
		//pegando a mensagem de erro
		WebElement alerta = driver.findElement(By.className("alert-danger"));
		String resultado = alerta.getText();
		
		//imprimindo mensagem de erro
		System.out.println(resultado);		

	}

}
