package desafioDB;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class dbDesafio {

	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "http://5d9cc58566d00400145c9ed4.mockapi.io/shopping_cart");
		System.out.println(response.statusCode() == 200);
		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
		
		
	}

}
