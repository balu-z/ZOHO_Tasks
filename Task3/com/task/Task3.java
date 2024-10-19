package com.task;
import com.exception.InputNullException;
import com.util.Utility;

public class Task3
{
public  char[] toCharArray(String input) throws InputNullException
{
     try{
               Utility.checkNull(input);
               return input.toCharArray();
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
}
public  char charAtSpecifiedIndex(String input,int index) throws InputNullException
{
  try{
        Utility.checkNull(input);
        Utility.boundaryCheck(index);
        return input.charAt(index);
    }
  catch(NullPointerException e)
  {
            throw new InputNullException("Error occured in  input :",e);
   }
  catch(Exception e)
  {
            throw new InputNullException("Error occured in  integer input :",e);
   }
}
public  int charOccurence(String input,char ch) throws InputNullException
{
 try{
            int count=0;
            int n=Utility.getLength(input);
             for(int i=0;i<n;i++)
             {
                    if(input.charAt(i)==ch)
                    {
                          count++;
                     }
             }
             return count;
   }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
 }

  public int greatestPosition(String input1,String input2) throws InputNullException
  {
     try{
           Utility.checkNull(input1);
           return input1.lastIndexOf(input2);
        }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
   }

 public String lastCharacters(String input,int noOfChar) throws InputNullException
 {   
    try{
         int n=Utility.getLength(input);
         Utility.boundaryCheck(noOfChar,n);
         return input.substring(n-noOfChar);       
      }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
      catch(Exception e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }
 public String firstChar(String input,int noOfChar ) throws InputNullException
  { 
     try{
            Utility.boundaryCheck(noOfChar,Utility.getLength(input));
            return input.substring(0,noOfChar);  
       }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
      catch(Exception e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
 }
  public String replaceFirstChar(String input,int noOfChar,String repl) throws InputNullException
  {
     try{
           Utility.checkNull(input);
           Utility.checkNull(repl);
           Utility.boundaryCheck(noOfChar);
           String replace =input.substring(0,noOfChar);
           return input.replaceFirst(replace,repl);
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
      catch(Exception e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }
 public boolean isStartsWith(String input1,String input2)  throws InputNullException
  {
      try{
            Utility.checkNull(input1);
            Utility.checkNull(input2);
            return input1.startsWith(input2);
          }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }

public boolean isEndsWith(String input1,String input2)  throws InputNullException
  {
      try{
            Utility.checkNull(input1);
            Utility.checkNull(input2);
            return input1.endsWith(input2);
        }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }

public String toUppercase(String input) throws InputNullException
  {
   try{
            Utility.checkNull(input);
            return input.toUpperCase();
    }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
      }
  }

public String toLowercase(String input) throws InputNullException
  { 
     try{
            Utility.checkNull(input);
            return input.toLowerCase();
     }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
      }
  }

public String stringReverse(String input) throws InputNullException
  {
    try{
             Utility.checkNull(input);
            char[]arr=input.toCharArray(); 
             int i =arr.length-1,j=0;
             while(i>j)
              {
                    arr[i]=(char)((arr[i]+arr[j])-(arr[j]=arr[i]));
                    i--;
                    j++;
              }
             return String.valueOf(arr);
      }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }
   
  public String lineWithMultipleStrings(String input) throws InputNullException
  {
      try{
           Utility.checkNull(input);
           return input;
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }

  public String lineWithMultipleStringsAndConcatenate(String input,String replaceWhat,String replaceWord) throws InputNullException
  {
     try{
             Utility.checkNull(input);
             Utility. checkNull(replaceWord);
             Utility.checkNull(replaceWhat);
             return input.replace(replaceWhat,replaceWord);
       }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }

   public String[] toSplit(String input,String whereToSplit) throws InputNullException
   {
       try{
             Utility.checkNull(input);
             Utility.checkNull(whereToSplit);
             return input.split(whereToSplit);
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
   }

  public String toMergeString(String input,String []str) throws InputNullException
  { 
        try{
                   Utility.checkNull(input); 
                   Utility.checkNull(str);
                   return String.join(input,str);
          }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
}
  public boolean isEquals(String input1,String input2) throws InputNullException
  {
      try{
            Utility. checkNull(input1);
            Utility.checkNull(input2);
            return input1.equals(input2);
        }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }

  public boolean isEqualsIgnoreCase(String input1,String input2) throws InputNullException
  {
     try{
            Utility.checkNull(input1);
            Utility.checkNull(input2);
            return input1.equalsIgnoreCase(input2);
        }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
  }  
  public String toRemoveSpace(String input) throws InputNullException
  {
       try{
           Utility.checkNull(input);
             return input.trim();
         }
      catch(NullPointerException e)
      {
            throw new InputNullException("Error occured in  input :",e);
       }
   }     
}
