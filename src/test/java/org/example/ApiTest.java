package org.example;

import TestData.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApiTest {

    Response response;
   private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;

    @BeforeClass
    public void setup()
    {
        RestAssured.baseURI="https://reqres.in/";
        requestSpecification= RestAssured.given().header("Content-Type", "application/json").log().all();
        responseSpecification = RestAssured.expect().statusCode(200).contentType("application/json")
                                .log().all();
    }

    @Test(priority = 0)
    public void validation() throws JsonProcessingException {
        response = requestSpecification.when().get("api/users?page=2");
        //response.then().spec(responseSpecification);
        /*System.out.println(response.getStatusCode());
        System.out.println(response.asString());
        System.out.println(response.jsonPath().get("data[0].id").toString());*/

        String res = response.asString();

        ObjectMapper mapper = new ObjectMapper();
        Data d = mapper.readValue(res,Data.class);
        System.out.println(d.page);
        System.out.println(d.data.get(2).getAvatar());
    }

  @Test(priority = 1)
  public void postDemo()
  {
      response.then().spec(responseSpecification);
  }

}
