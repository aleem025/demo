package com.valsatech.bdd.libraries;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class AccessibilityDriver {

	// http://localhost:8080/RESTfulExample/json/product/get
	public static String run508OnPage(String pagecontent,String pagetitle) {

	  try {
		  RestAssured.baseURI = "http://accessbot.io/v1/scanHtmlContent";
		  String myjson = "{\"body\":\""+pagecontent+"\"}";
		  
		  Response r = RestAssured.given().contentType("application/json").queryParam("access_token", "0628d946d3e1f90446eaa6b0dc4c2e992422bc61ccc4f73ef84c6edbc607f3ff").queryParam("url", pagetitle).body(myjson).when().post("");
		  //demo@mosiac.io/mosiac
		  String body = r.getBody().asString();
		  return body;
		
	  } catch (Exception e) {

		e.printStackTrace();

	  }
	return null;

	}

}