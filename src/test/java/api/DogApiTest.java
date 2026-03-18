
package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DogApiTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://dog.ceo/api";
    }

    @Test
    public void listarRacas() {
        given()
        .when().get("/breeds/list/all")
        .then().statusCode(200)
        .body("message", not(empty()));
    }

    @Test
    public void imagensPorRaca() {
        given()
        .when().get("/breed/hound/images")
        .then().statusCode(200)
        .body("message", not(empty()));
    }

    @Test
    public void imagemAleatoria() {
        given()
        .when().get("/breeds/image/random")
        .then().statusCode(200)
        .body("message", containsString("http"));
    }
}
