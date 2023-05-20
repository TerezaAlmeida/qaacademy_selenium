package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosOnlineBotao = "//*[@id='comp-k7g9c7sd2label']";
    String cursosPresenciaisBotao = "comp-k7g9c7sd1label";
    String contatoBotao = "comp-k7g9c7sd3label";
    String nomeCampo = "input_comp-k37gdip8";

    @Test
    public void testeAberturaNavegador() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");
        
        Thread.sleep(6000);
        driver.findElement(By.id(contatoBotao)).click();
        driver.findElement(By.id(nomeCampo)).sendKeys("Teste");
    }
}
