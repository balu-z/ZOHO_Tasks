package task;
import java.util.*;

public class Task3
{
 

 public  int  length(String test)
 {
      return test.length();
  }

public  char[] toCharArray(String test)
{
      return test.toCharArray();
}

public  char penUltimateChar (String test)
{
      return test.charAt(test.length()-2);
}

public  int charOccurence(String test,char c)
{
     int count=0;
      for(int i=0;i<test.length();i++)
      {
             if(test.charAt(i)==c)
                   count++;
      }
      return count;
 }

  public int greatestPosition(String test,char c)
  {
       String cha =String.valueOf(c);
      return test.lastIndexOf(cha);
   }

  public String last5Char(String test)
  { 
  try{
      return test.substring(test.length()-5);
   }
  catch(Exception e)
  {
      return "Your String is Less than Five Characters.....";
  }
}

 public String first3Char(String test)
  {
   
    try{
      return test.substring(0,3);
    }
   catch(Exception e)
   {
      return "Your String is Less than Three Characters.....";
   }
 }

  public String replaceFirst3Char(String test)
  {
    try{
           String replace =test.substring(0,3);
           return test.replaceFirst(replace,"XYZ");
    }
   catch(Exception e)
   {
      return "Your String is Less than Three Characters.....";
   }

  }

 public boolean startsWith(String test,String check)
  {
      return test.startsWith(check);
  }

public boolean endsWith(String test,String check)
  {
      return test.endsWith(check);
  }

public String toUppercase(String test)
  {
      return test.toUpperCase();
  }

public String toLowercase(String test)
  {
      return test.toLowerCase();
  }

public String stringReverse(String test)
  {
     String reverse="";
     for(int i=test.length()-1;i>=0;i--)
     {
           reverse+=test.charAt(i)+"";
      }
      return reverse;
  }
   
  public String lineWithMultipleStrings(String test)
  {
          return test;
  }

  public void lineWithMultipleStringsAndConcatenate(String[] test)
  {
        for(String str:test)
            System.out.print(str);
  }

   public String[] split(String test)
   {
      return test.split(" ");
   }

  public void mergedString(String ...test)
  {
      for(int i=0;i<test.length;i++)
      {
         if(i!=test.length-1)
            System.out.print(test[i]+"-");
            
       }
       System.out.print(test[test.length-1]);
      
  }

  public boolean equals(String test,String s)
  {
     return test.equals(s);
  }

  public boolean equalsIgnoreCase(String test,String s)
  {
     return test.equalsIgnoreCase(s);
  }
  
  public String removeSpace(String test)
  {
    
         if(test.charAt(0)==' '&& test.charAt(test.length()-1)==' ')
              return test.substring(1,test.length()-1);

         if(test.charAt(0)==' ')
              return test.substring(1);
    
         if(test.charAt(test.length()-1)==' ')
            return test.substring(0,test.length()-1);
   
     return test;
   }
}