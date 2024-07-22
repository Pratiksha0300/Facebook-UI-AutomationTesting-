package com.generic;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpUtility 
{ 
	
	private Pojo objPojo;
	static String strurl="http://localhost:8080";
	
  public Response doPost(String jsonString)
  { 
	 
	  Response response=null;
	  try {
		   
		   RequestSpecification request= RestAssured.given();
		   request.contentType(ContentType.JSON);
		   request.baseUri(strurl+"/addPatient");
		   request.body(jsonString);
		   response = request.post();
		  return response;
	} catch (Exception e) {
		System.out.println("I got exception:"+ e.getMessage());
		 return response;
	}
 } 
  
  public Response doGet(String pId)
  { 
	  Response response=null;
	  try {
		   RequestSpecification request= RestAssured.given();
		   request.contentType(ContentType.JSON);
		   request.baseUri(strurl+"/getPatient/"+ pId);
		   response = request.get();
		   return response;
	} catch (Exception e) {
		System.out.println("I got exception:"+ e.getMessage());
		 return response;
	}
  }   
  
  public Response doUpdate(String jsonString,String pId)
  { 
	 
	  Response response=null;
	  try {
		   
		   RequestSpecification request= RestAssured.given();
		   request.contentType(ContentType.JSON);
		   request.baseUri(strurl+"/updatePatient/"+pId);
		   request.body(jsonString);
		   response = request.put();
		  return response;
	} catch (Exception e) {
		System.out.println("I got exception:"+ e.getMessage());
		 return response;
	}
 } 
  
 public Response doDelete(String jsonString)
	  { 
		  Response response=null;
		  try {
			   RequestSpecification request= RestAssured.given();
			   request.contentType(ContentType.JSON);
			   request.baseUri(strurl+"/deletePatient");
			   request.body(jsonString);
			   response = request.delete();
			   return response;
		} catch (Exception e) {
			System.out.println("I got exception:"+ e.getMessage());
			 return response;
		}
	  }
  
  public Response doRequest(String reqType,String jsonString,String pId)
  {
	  Response response=null;
	  if(reqType.toLowerCase().equals("post"))
	  {
		  response=this.doPost(jsonString);
		  return response;
	  } 
	  
	  else if(reqType.toLowerCase().equals("get"))
	  {
		 response=this.doGet(pId);
		  return response;  
	  } 
	  
	  
	  else if(reqType.toLowerCase().equals("put"))
	  {
		 response=this.doUpdate(jsonString,pId);
		  return response;  
	  } 
	 
	  
	  else if(reqType.toLowerCase().equals("delete"))
	  {
		 response=this.doDelete(pId);
		  return response;  
	  } 
	  return response;
	  
  }
  
}
