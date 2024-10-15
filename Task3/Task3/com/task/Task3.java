package com.task;
import com.exception.InvalidException;
import com.util.Utility;

public class Task3
{
   Utility use=new Utility();
 public  int  getLength(String input) throws InvalidException
 { 
      use.checkNull(input);
      return input.length();
  }

public  char[] toCharArray(String input) throws InvalidException
{
       use.checkNull(input);
      return input.toCharArray();
}
public  char charAt(String input,int index) throws InvalidException
{
     use.checkNull(input);
     use.boundaryCheck(index);
      return input.charAt(index);
}
public  int charOccurence(String input,char ch) throws InvalidException
{
     int count=0;
     int n=getLength(input);
      for(int i=0;i<n;i++)
      {
             if(input.charAt(i)==ch)
             {
                   count++;
              }
      }
      return count;
 }

  public int greatestPosition(String input1,String input2) throws InvalidException
  {
         use.checkNull(input1);
      return input1.lastIndexOf(input2);
   }

  public String lastCharacters(String input,int noOfChar) throws InvalidException
  {   
        int n=getLength(input);
       use.boundaryCheck(noOfChar,n);
         return input.substring(n-noOfChar);       
}

 public String firstChar(String input,int noOfChar ) throws InvalidException
  { 
            use.boundaryCheck(noOfChar,getLength(input));
           return input.substring(0,noOfChar);  
 }
  public String replaceFirstChar(String input,int noOfChar,String repl) throws InvalidException
  {
           use.checkNull(input);
           use.checkNull(repl);
           use.boundaryCheck(noOfChar);
           String replace =input.substring(0,noOfChar);
           return input.replaceFirst(replace,repl);
  }
 public boolean isStartsWith(String input1,String input2)  throws InvalidException
  {
            use.checkNull(input1);
            use.checkNull(input2);
      return input1.startsWith(input2);
  }

public boolean isEndsWith(String input1,String input2)  throws InvalidException
  {
            use.checkNull(input1);
            use.checkNull(input2);
      return input1.endsWith(input2);
  }

public String toUppercase(String input) throws InvalidException
  {
            use.checkNull(input);
      return input.toUpperCase();
  }

public String toLowercase(String input) throws InvalidException
  {
            use.checkNull(input);
      return input.toLowerCase();
  }

public String stringReverse(String input) throws InvalidException
  {
      use.checkNull(input);
     char[]arr=input.toCharArray(); 
      int i=arr.length-1,j=0;
      while(i>j)
       {
           arr[i]=(char)((arr[i]+arr[j])-(arr[j]=arr[i]));    
             i--;
             j++;
       }     
      return String.valueOf(arr);
  }
   
  public String lineWithMultipleStrings(String input) throws InvalidException
  {
           use.checkNull(input);
          return input;
  }

  public String lineWithMultipleStringsAndConcatenate(String input,String replaceWhat,String replaceWord) throws InvalidException
  {
             use.checkNull(input);
            use. checkNull(replaceWord);
             use.checkNull(replaceWhat);
       return input.replace(replaceWhat,replaceWord);
  }

   public String[] toSplit(String input,String whereToSplit) throws InvalidException
   {
             use.checkNull(input);
             use.checkNull(whereToSplit);
              return input.split(whereToSplit);
   }

  public String toMergeString(String input,String []str) throws InvalidException
  { 
            use.checkNull(input); 
            if(str.length==0)
              {
                      return "String needed";
              }
           return String.join(input,str);
}
  public boolean isEquals(String input1,String input2) throws InvalidException
  {
           use. checkNull(input1);
            use.checkNull(input2);
          return input1.equals(input2);
  }

  public boolean isEqualsIgnoreCase(String input1,String input2) throws InvalidException
  {
            use.checkNull(input1);
            use.checkNull(input2);
     return input1.equalsIgnoreCase(input2);
  }  
  public String toRemoveSpace(String input) throws InvalidException
  {
           use.checkNull(input);
             return input.trim();
   }
     
}