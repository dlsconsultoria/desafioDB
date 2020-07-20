package desafioDB;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


import org.junit.Test;


public class desafioDBTest {
	
	@Test
	public void deveRetornarSucesso() {
		given()
		.when()
			.get("http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart")
		.then()
			.statusCode(200)
		;
	}
	
	@Test
	public void deveRetornarNotFound() {
		given()
		.when()
			.get("http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart/1")
		.then()
			.statusCode(404)
		;
	}
	
	@Test
	public void deveVerificarListaNome() {
			given()
			.when()
				.get("http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart")
			.then()
				.body("sku[0]", is("demo_2"))
				.body("sku[1]", is("demo_1"))
				.body("sku[2]", is("demo_7"))
			;
		}
	
	@Test
	public void deveVerificarListaCores() {
			given()
			.when()
				.get("http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart")
			.then()
				.body("color[0]", is("Black"))
				.body("color[1]", is("Orange"))
				.body("color[2]", is("Yellow"))
			;
		}

}
