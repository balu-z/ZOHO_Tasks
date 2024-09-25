package task;
import java.util.*;
import exception.CustomException;

public class Task3
{
 public  int  length(String test) throws CustomException
 { 
      checkNull(test);
      return test.length();
  }

public  char[] toCharArray(String test) throws CustomException
{
       checkNull(test);
      return test.toCharArray();
}

public  char penUltimateChar (String test) throws CustomException
{
       checkNull(test);
      return test.charAt(test.length()-2);
}

public  int charOccurence(String test,char c) throws CustomException
{
     checkNull(test,c);
     int count=0;
     int n=length(test);
      for(int i=0;i<n;i++)
      {
             if(test.charAt(i)==c)
                   count++;
      }
      return count;
 }

  public int greatestPosition(String test,char c) throws CustomException
  {
         checkNull(test,c);
       String cha =String.valueOf(c);
      return test.lastIndexOf(cha);
   }

  public String lastCharacters(String test,int noOfChar) throws CustomException
  {   
         checkNull(test);
        int n=length(test);
        if(noOfChar <=n){
          return test.substring(test.length()-noOfChar);
         }
        else{
           throw new CustomException("Please check the input");
         }
         
}

 public String firstChar(String test,int noOfChar ) throws CustomException
  { 
            checkNull(test);
     if(noOfChar<=length(test)){
           return test.substring(0,noOfChar);
     }
    else{
            throw new CustomException("Please check the input");
     }
   
 }

  public String replaceFirstChar(String test,int noOfChar,String rep) throws CustomException
  {
            checkNull(test);
            checkNull(rep);
         if(noOfChar==length(rep)&&length(test)>=length(rep)){
             String replace =test.substring(0,noOfChar);
           return test.replaceFirst(replace,rep);
         }
        else{
               throw new CustomException("Please check the input");
         }
           
   
  }

 public boolean startsWith(String test,String check)  throws CustomException
  {
            checkNull(test);
            checkNull(check);
      return test.startsWith(check);
  }

public boolean endsWith(String test,String check)  throws CustomException
  {
            checkNull(test);
            checkNull(check);
      return test.endsWith(check);
  }

public String toUppercase(String test) throws CustomException
  {
            checkNull(test);
      return test.toUpperCase();
  }

public String toLowercase(String test) throws CustomException
  {
            checkNull(test);
      return test.toLowerCase();
  }

public String stringReverse(String test) throws CustomException
  {
            checkNull(test);
     char[]ar=test.toCharArray(); 
     char []ar1=new char[ar.length];
     
     for(int i=ar.length-1,j=0;i>=0;i--,j++)
     {
            ar1[j]=ar[i];
     }
     
      return String.valueOf(ar1);
  }
   
  public String lineWithMultipleStrings(String test) throws CustomException
  {
            checkNull(test);
          return test;
  }

  public String lineWithMultipleStringsAndConcatenate(String[] test) throws CustomException
  {
          String result="";
      for(int i=0;i<test.length;i++)
      {
           result=result.concat(test[i]);  
       }
       return result;
  }

   public String[] split(String test) throws CustomException
   {
             checkNull(test);
      return test.split(" ");
   }

  public String mergedString(String sym,String []test) throws CustomException
  { 
            checkNull(sym);
     String result="";
      for(int i=0;i<test.length;i++)
      {
         if(i!=test.length-1)
         {
             result=result.concat(test[i]);
             result=result.concat(sym);
          }
     }
           result=result.concat(test[test.length-1]);     
              return result;
}
  public boolean equals(String test,String s) throws CustomException
  {
            checkNull(test);
            checkNull(s);
     return test.equals(s);
  }

  public boolean equalsIgnoreCase(String test,String s) throws CustomException
  {
            checkNull(test);
            checkNull(s);
     return test.equalsIgnoreCase(s);
  }
  
  public String removeSpace(String test) throws CustomException
  {
             checkNull(test);
         if(test.charAt(0)==' '&& test.charAt(test.length()-1)==' ')
              return test.substring(1,test.length()-1);

         if(test.charAt(0)==' ')
              return test.substring(1);
    
         if(test.charAt(test.length()-1)==' ')
            return test.substring(0,test.length()-1);
   
     return test;
   }
      public void checkNull(String test) throws CustomException
    {
         if(test.equals(null))
         {
            throw new CustomException("Please check the input");
         }
    
   }
     public void checkNull(String test,char ch) throws CustomException
    {
         if(test.equals(null)&&ch=='')
         {
            throw new CustomException("Please check the input");
         }
    
   }
}
