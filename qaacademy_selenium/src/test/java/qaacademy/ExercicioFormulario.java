package qaacademy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioFormulario {
    @Test
    public void abrirNavegador(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");
    }
}
