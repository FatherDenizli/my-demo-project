package projectbaseclasses;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {


        @Test
        public void get01(){
            //Set the Url
            String url="https://restful-booker.herokuapp.com/booking/123";

            //Set the expected data

            //Send the request and get the response
            Response response=given().when().get(url);
            response.prettyPrint();



            //Do Assertion
            response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

            //How to print "Status Code" on console
            System.out.println("Status Code: "+response.statusCode());

            //How to print "Content Type" on console
            System.out.println("Content Type: "+response.contentType());

            //How to print "Status Line" on console
            System.out.println("Status Line: "+response.statusLine());

            //How to print "Header" on console
            System.out.println(response.getHeader("Connection"));

            System.out.println("===============");

            //How to print "Headers" on console
            System.out.println(response.getHeader("Via"));

            //How to print "Time" on console
            System.out.println(response.getTime());
        }


    }






















