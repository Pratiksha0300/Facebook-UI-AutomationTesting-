package com.generic;


import java.util.Locale;
import java.util.Random;
import com.github.javafaker.Faker;


public class Utilities 
{  
	private Pojo objPojo;
	private Faker objFaker ;
	public Utilities(Pojo pojo)
	{
		 this.objPojo=pojo;
		 objFaker = new Faker(new Locale("en-IND"));
	}
	
	public String getrandomString(int n)
	 {
	 
	  String randomStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "abcdefghijklmnopqrstuvxyz";
	 
	  StringBuilder sb = new StringBuilder(n);
	 
	  for (int i = 0; i < n; i++)
	  {
	  int index= (int)(randomStr.length()* Math.random());
	  sb.append(randomStr .charAt(index));
	  }
//		 String randomstr=objFaker.name().firstName();
	  return sb.toString();
//		return randomstr;
	  
	 
	 }  
	
	public String getrandomCityUsingFaker()
	{
		 String randomstr=objFaker.address().cityName();
		 return randomstr;
	}
	
	
	public String getPassword()
	{
		String strPassword="1234";
		return strPassword;
		
	}
	
	public String getRandommnumber(int n)
	 {
	 
	  String randomStr = "0123456789";
	 
	  StringBuilder sb = new StringBuilder(n);
	 
	  for (int i = 0; i < n; i++)
	  {
	  int index= (int)(randomStr.length()* Math.random());
	  sb.append(randomStr .charAt(index));
	  }
	 
	  return sb.toString();
	 } 
	
	public String getemail(int n)
	 {
//		 String randomStr = "0123456789"+ "abcdefghijklmnopqrstuvxyz";
//		 
//		  StringBuilder sb = new StringBuilder(n);
//		 
//		  for (int i = 0; i < n; i++)
//		  {
//		  int index= (int)(randomStr.length()* Math.random());
//		  sb.append(randomStr .charAt(index));
//		  }
		 
		  String randomstr=objFaker.name().firstName();
//		  return sb.toString()+"@gmail.com";
		  
		  return randomstr+"@gmail.com";
		 
	 }  
	
	public String getDate() 
	{
		 Random random1 = new Random(); 
		 int [] day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		 int randomday = day[random1.nextInt(day.length)]; 
		 
		 String [] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		 String randommonth = month[random1.nextInt(month.length)];  
		 
		 int min = 1905;  
		 int max = 2023; 
		 int randomyear = (int) (Math.random()*(max-min+1)+min);   
		 return randomday+"-"+randommonth+"-" +randomyear; 
		// return null; 
		 
//		Date date= objFaker.date().birthday(18, 100);
		
	} 
	
	public String gender()
	{
		String [] gender = {"Female","Male","Custom"};
    	
   	 Random random = new Random();  
        String randomgender = gender[random.nextInt(gender.length)];  
  
       
		return randomgender; 
        
	}
}
