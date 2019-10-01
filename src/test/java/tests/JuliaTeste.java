package tests;

import com.sun.jna.platform.unix.X11;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuliaTeste {
    @Test

    public void EstimarFap() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rodri\\IdeaProjects\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://ww2.soc.com.br/fap/");

        navegador.findElement(By.name("nomeEmpresa")).sendKeys("julia");
        navegador.findElement(By.name("fap")).sendKeys("12");
        //teste commit
        navegador.findElement(By.xpath("//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[2]/b")).click();
        Thread.sleep(5000);
        navegador.findElement(By.xpath("//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[3]/div/ul/li[2]")).click();

        navegador.findElement(By.id("projecao")).sendKeys("350000");
        navegador.findElement(By.id("estimar")).click();
    }

    @Test
    public void Busca() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodri\\IdeaProjects\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://ww2.soc.com.br/blog/");

        navegador.findElement(By.xpath("//*[@id=\"blog\"]/div/div[1]/div/form/input[3]")).sendKeys("certificação");
        navegador.findElement(By.className("lupa-form")).click();
    }
}
/*package tests;

        import static org.junit.Assert.*;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class FAPTest {
    @Test
    public void testEstimarFAP() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jribeirb\\drivers\\chromedriver_win32\\chromedriver.exe");
        navegador.findElement(By.xpath("//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[2]/b")).click();
        Thread.sleep(5000);
        navegador.findElement(By.xpath("//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[3]/div/ul/li[2]")).click();
        //Thread.sleep(5000);
        //navegador.findElement(By.xpath("//*[@id=\"projecao\"]")).sendKeys("350000");
        navegador.findElement(By.id("projecao")).sendKeys("350000");


        //navegador.findElement(new By.ByXPath("//*[@id=\"rat\"]")).sendKeys("2");
        /*By driver = null;
        Select selectRat = new Select(driver.findElement((SearchContext) By.name("rat")));
        selectRat.selectByVisibleText("2");
        //navegador.findElement(By.className("selectric-wrapper selectric-wpcf7-form-control selectric-wpcf7-select selectric-wpcf7-validates-as-required selectric-form-control selectric-open").findElement(By.name("rat")).sendKeys("2"));
        //*[@id="rat"]*/
        /*assertEquals(1, 1);
    }
}*/