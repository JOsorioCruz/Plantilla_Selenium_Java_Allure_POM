package stepDefinition;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.Prod;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.GooglePage;

import static com.codeborne.selenide.Selenide.open;

public class BuscarStep {
    private GooglePage googlePage;

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.browser = "chrome";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        googlePage = open(Prod.urlProduccion(), GooglePage.class);
    }

    @Test
    @Description("Primera prueba exitosa usando las funcionalidades completas de Selenide")
    public void search() throws InterruptedException {
        googlePage.searchFor("Selenium WebDriver busqueda uno");
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Description("Segunda prueba exitosa usando las funcionalidades de adaptación del WebDriver con Selenide")
    public void searchDos() throws InterruptedException {
        WebDriver driver = WebDriverRunner.getWebDriver();
        googlePage.searchFor("Selenium WebDriver busqueda dos");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    @Description("Tercera prueba fallida usando las funcionalidades de Selenide")
    public void searchTres() throws InterruptedException {
        googlePage.searchFor("Busqueda fallida");
        googlePage.verificarContenido("xxxxxxxx");
        WebDriverRunner.closeWebDriver();
    }
}