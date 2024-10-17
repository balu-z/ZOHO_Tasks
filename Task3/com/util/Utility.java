package com.util;
import com.exception.InputNullException;
   
public class Utility
{
     public static void checkNull(String input) throws InputNullException
    {
         if(input==null)
         {
                   throw new InputNullException("Entered String is null or empty");
         }
   }
   public static void boundaryCheck(int num) throws InputNullException
   {  
       if(num<0)
       {
            throw new InputNullException("Please check the input");
       }        
    }
  public  static void boundaryCheck(int noOfChar,int len) throws InputNullException
   {        
       if(noOfChar>len||noOfChar<=0|| len<=0)
       {
            throw new InputNullException("Please check the input");
       }        
    }     
  public static void checkNull(String []arr) throws InputNullException
  {
     if(arr.length==0)
      {
              throw new InputNullException("Need a string array");
      }
  }


}


