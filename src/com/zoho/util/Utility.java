package com.zoho.util;
import com.zoho.exception.CustomTaskException;

public class Utility
{
    public static  int  getLength(String input) throws CustomTaskException
    {
            checkNull(input);
            return input.length();
    }
    public static void checkNull(String input) throws CustomTaskException
    {
         if(input==null)
         {
                   throw new CustomTaskException("Entered String is null ");
         }
    }
	public static void checkNull(StringBuilder input) throws CustomTaskException
    {
         if(input==null)
         {
                   throw new CustomTaskException("Entered String Builder is null ");
         }
    }
	public  static void boundaryCheck(int num) throws CustomTaskException
   {
       if(num<0)
       {
            throw new CustomTaskException("Please check the input");
       }
    }
  public  static void boundaryCheck(int noOfChar,int len) throws CustomTaskException
   {
       if(noOfChar>len||noOfChar<=0&&len<=0)
       {
            throw new CustomTaskException("Please check the input");
       }
    }
  public static void emptyArrayCheck(String []arr) throws CustomTaskException
  {
     if(arr.length==0)
      {
              throw new CustomTaskException("Need a string array");
      }
  }
  public static int getLength(StringBuilder input) throws CustomTaskException
   {
	   checkNull(input);
      return input.length();
   }
   public static String getStringInBuilder(StringBuilder input)
   {
	   return input.toString();
   }
}

