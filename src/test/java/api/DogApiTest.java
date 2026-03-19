package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.ApiUtils;

import static org.junit.jupiter.api.Assertions.*;

public class DogApiTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://dog.ceo/api";
    }

    @Test
    public void listarRacas() {

        Response response = ApiUtils.getWithRetry(
                RestAssured.baseURI + "/breeds/list/all"
        );

        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getMap("message").isEmpty());
    }

    @Test
    public void imagensPorRaca() {

        Response response = ApiUtils.getWithRetry(
                RestAssured.baseURI + "/breed/hound/images"
        );

        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getList("message").isEmpty());
    }

    @Test
    public void imagemAleatoria() {

        Response response = ApiUtils.getWithRetry(
                RestAssured.baseURI + "/breeds/image/random"
        );

        assertEquals(200, response.getStatusCode());
        assertTrue(response.jsonPath().getString("message").contains("http"));
    }
}