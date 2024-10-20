package com.util;
import com.exception.InputNullException;
   
public class Utility
{
    public static  int  getLength(String input) throws InputNullException
   { 
      try{
            checkNull(input);
            return input.length();
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
     }
     public static void checkNull(String input) throws NullPointerException
    {
         if(input==null)
         {
                   throw new NullPointerException("Entered String is null ");
         }
   }
   public static void boundaryCheck(int num) throws Exception
   {  
       if(num<0)
       {
            throw new Exception("Please check the input");
       }        
    }
  public  static void boundaryCheck(int noOfChar,int len) throws Exception
   {        
       if(noOfChar>len||noOfChar<=0|| len<=0)
       {
            throw new Exception("Please check the input");
       }        
    }     
  public static void checkNull(String []arr) throws NullPointerException
  {
     if(arr.length==0)
      {
              throw new NullPointerException("Need a string array");
      }
  }
}
