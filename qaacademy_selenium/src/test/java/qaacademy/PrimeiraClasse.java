package qaacademy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    @Test
    public void testeAberturaNavegador(){
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.qaacademy.com.br/");
    }
}
