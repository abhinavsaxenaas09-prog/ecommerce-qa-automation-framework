package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiSmokeTest {

    @Test(groups = "smoke")
    public void getUserApiSmokeTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("email", containsString("@"));
    }
}
