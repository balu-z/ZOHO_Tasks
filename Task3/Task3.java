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
     int n=length(test);
      for(int i=0;i<n;i++)
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

  public String lastCharacters(String test,int noOfChar) throws Exception
  {   
        int n=length(test);
        if(noOfChar <=n){
          return test.substring(test.length()-noOfChar);
         }
        else{
           throw new Exception();
         }
         
}

 public String firstChar(String test,int noOfChar )
  {
      return test.substring(0,noOfChar);
   
 }

  public String replaceFirstChar(String test,int noOfChar,String rep) throws Exception
  {
         if(noOfChar==length(rep)&&length(test)>=length(rep)){
             String replace =test.substring(0,noOfChar);
           return test.replaceFirst(replace,rep);
         }
        else{
               throw new Exception();
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
     char[]ar=test.toCharArray(); 
     char []ar1=new char[ar.length];
     
     for(int i=ar.length-1,j=0;i>=0;i--,j++)
     {
            ar1[j]=ar[i];
     }
     
      return String.valueOf(ar1);
  }
   
  public String lineWithMultipleStrings(String test)
  {
          return test;
  }

  public void lineWithMultipleStringsAndConcatenate(String[] test)
  {
         
  }

   public String[] split(String test)
   {
      return test.split(" ");
   }

  public String mergedString(String sym,String ...test)
  { 
     String result="";
      for(int i=0;i<test.length;i++)
      {
         if(i!=test.length-1)
            result.concat(test[i]+sym);  
       }
       result.concat(test[test.length-1]);
      return result;
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