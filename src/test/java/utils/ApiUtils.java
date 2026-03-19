package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Response getWithRetry(String url) {

        int tentativas = 3;

        for (int i = 0; i < tentativas; i++) {

            Response response = given().get(url);

            if (response.getStatusCode() == 200) {
                return response;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        throw new RuntimeException("API instável após retries: " + url);
    }
}