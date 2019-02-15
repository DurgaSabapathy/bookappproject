package com.chainsys.jdbc;

import java.util.InputMismatchException;

public class BookValidator {
public boolean validateBookBeforeInsert(String name,float price)throws Exception
{

	
	String regex = "^[a-zA-Z]+$";
	  if(name == null || name.equals("")&&!name.matches("[a-zA-Z]*"))
	       
	  {
		  return false;
		  
	  }
	    


if(price<0)
{
	return false;
}
	return true;
}

	

public void validateBookAfterInsert(String name)throws Exception
{

	if(name.equals(null))
	{
		System.out.println("enter value to the name");
	}

}
public void deleteValidator(int id)throws Exception
{

	
	if(id<0)
	{
		System.out.println("enter value to the id");
	}
	
}
}
