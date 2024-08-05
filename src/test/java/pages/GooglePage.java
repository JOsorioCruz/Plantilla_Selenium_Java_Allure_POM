package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
    private SelenideElement searchBox = $(By.cssSelector("#APjFqb"));

    public GooglePage searchFor(String text) throws InterruptedException {
        searchBox.setValue(text).pressEnter();
        Thread.sleep(3000); // Esperar 3 segundos
        return page(GooglePage.class);
    }

    public void verificarContenido(String text) {
        $("h3").shouldHave(text(text));
    }
}
