package com.util;
import com.exception.InvalidException;
   
public class Utility
{
     public void checkNull(String input) throws InvalidException
    {
         if(input==null)
         {
                   throw new InvalidException("Entered String is null or empty");
         }
   }
   public void boundaryCheck(int num) throws InvalidException
   {  
       if(num<0)
       {
            throw new InvalidException("Please check the input");
       }        
    }
  public void boundaryCheck(int noOfChar,int len) throws InvalidException
   {        
       if(noOfChar>len||noOfChar<=0|| len<=0)
       {
            throw new InvalidException("Please check the input");
       }        
    }     
  public void checkNull(String []arr) throws InvalidException
  {
     if(arr.length==0)
      {
              throw new InvalidException("Need a string array");
      }
  }


}


