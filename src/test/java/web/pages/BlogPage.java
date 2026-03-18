package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {

    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessar() {
        driver.get("https://blogdoagi.com.br/");
    }

    public void buscar(String termo) {
        String urlBusca = "https://blogdoagi.com.br/?s=" + termo;
        driver.get(urlBusca);
    }

    public int quantidadeResultados() {
        return driver.findElements(By.cssSelector("article")).size();
    }
}
