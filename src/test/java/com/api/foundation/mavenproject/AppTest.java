package com.api.foundation.mavenproject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void postServiceTest() {
    	RestAssured.baseURI = "https://www.google.com";
    	Response response = RestAssured.get(baseURI);
    	System.out.println(response.getStatusCode());
    }
}
