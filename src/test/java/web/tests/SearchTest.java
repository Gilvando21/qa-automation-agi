package web.tests;

import base.BaseTest;
import web.pages.BlogPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest extends BaseTest {

    @Test
    public void buscaComResultado() {
        setup();

        BlogPage page = new BlogPage(driver);
        page.acessar();
        page.buscar("investimento");

        assertTrue(page.quantidadeResultados() > 0);
    }

    @Test
    public void buscaSemResultado() {
        setup();

        BlogPage page = new BlogPage(driver);
        page.acessar();
        page.buscar("termo_inexistente_xyz");

        assertEquals(0, page.quantidadeResultados());
    }
}