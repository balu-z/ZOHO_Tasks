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

public  char charAt(String test,int check) throws CustomException
{
     
      return test.charAt(check);
}

public  int charOccurence(String test,char c) throws CustomException
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

  public int greatestPosition(String test,String check) throws CustomException
  {
         checkNull(test);
      return test.lastIndexOf(check);
   }

  public String lastCharacters(String test,int noOfChar) throws CustomException
  {   

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

     if(noOfChar<=length(test)){
           return test.substring(0,noOfChar);
     }
    else{
            throw new CustomException("Please check the input");
     }
   
 }

  public String replaceFirstChar(String test,int noOfChar,String rep) throws CustomException
  {

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
      int i=ar.length-1,j=0;
      while(i>j)
       {
            char temp =ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
           i--;
           j++;
       }
    
     
      return String.valueOf(ar);
  }
   
  public String lineWithMultipleStrings(String test) throws CustomException
  {
            checkNull(test);
          return test;
  }

  public String lineWithMultipleStringsAndConcatenate(String[] test) 
  {
 
       return String.join("", test);
  }

   public String[] split(String test) throws CustomException
   {
             checkNull(test);
      return test.split(" ");
   }

  public String mergedString(String sym,String []test) throws CustomException
  { 
            checkNull(sym);
           return String.join(sym,test);
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
             return test.trim();
   }
      public void checkNull(String test) throws CustomException
    {
         if(test.trim().isEmpty()&&test.equals(null)){
                   throw new CustomException("Entered String is null or empty");
         }
  
   }
     
}
