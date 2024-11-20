package com.task;
import com.util.Utility;
import com.exception.InputNullException;

public class StringTask
{
    public  char[] toCharArray(String input) throws InputNullException
    {
                   Utility.checkNull(input);
                   return input.toCharArray();			
    }
    public  char charAtSpecifiedIndex(String input,int index) throws InputNullException
    {
            int length=Utility.getLength(input);
            Utility.boundaryCheck(index,length);
            return input.charAt(index);
    }
    public  int charOccurence(String input,char ch) throws InputNullException
    {
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

      public int greatestPosition(String input1,String input2) throws InputNullException
      {
               Utility.checkNull(input1);
               return input1.lastIndexOf(input2);
       }

     public String lastCharacters(String input,int noOfChar) throws InputNullException
     {
             int n=Utility.getLength(input);
             Utility.boundaryCheck(noOfChar,n);
             return input.substring(n-noOfChar);
      }
     public String firstChar(String input,int noOfChar ) throws InputNullException
      {
		        int length=Utility.getLength(input);
                Utility.boundaryCheck(noOfChar,length);
                return input.substring(0,noOfChar);
     }
      public String replaceChar(String input,String repl,int noOfChar,String choice ) throws InputNullException
      {
		                   String replace="",result="";
						   int inpLength=Utility.getLength(input);
						   int repLength=Utility.getLength(repl);
						   Utility.boundaryCheck(noOfChar,inpLength);
		  switch(choice){
			  case "start":
						   replace =input.substring(0,noOfChar);
						   result= input.replaceFirst(replace,repl);
						   break;
			  case "end":
						   replace =input.substring(inpLength-noOfChar,inpLength);
						   result= input.replaceFirst(replace,repl);
						   break;			  
		  }
		  return result;
      }
	  public String replaceMiddleChar(String input,String repl,int noOfChar,int index ) throws InputNullException
      {
		                   String replace="";
						   int inpLength=Utility.getLength(input);
						   int repLength=Utility.getLength(repl);
						   Utility.boundaryCheck(noOfChar,inpLength);
						   if(index+inpLength<inpLength){
							   replace =input.substring(index,index+inpLength);
							   return input.replaceFirst(replace,repl);
						   }
						   else{
							   replace =input.substring(index,inpLength);
							   return input.replaceFirst(replace,repl);
						   }						   
		  
      }
     public boolean isStartsWith(String input1,String input2) throws InputNullException
      {
                Utility.checkNull(input1);
                Utility.checkNull(input2);
                return input1.startsWith(input2);
      }

    public boolean isEndsWith(String input1,String input2) throws InputNullException
      {
                Utility.checkNull(input1);
                Utility.checkNull(input2);
                return input1.endsWith(input2);
      }

    public String toUppercase(String input) throws InputNullException
      {
                Utility.checkNull(input);
                return input.toUpperCase();
      }

    public String toLowercase(String input) throws InputNullException
      {
                Utility.checkNull(input);
                return input.toLowerCase();
      }

    public String stringReverse(String input) throws InputNullException
      {
                int length= Utility.getLength(input);
                char[]arr=input.toCharArray();
                 int i =length-1,j=0;
                 while(i>j)
                  {
                        arr[i]=(char)((arr[i]+arr[j])-(arr[j++]=arr[i--]));
                  }
                 return String.valueOf(arr);
      }

      public String lineWithMultipleStrings(String input) throws InputNullException
      {
               Utility.checkNull(input);
               return input;
      }

      public String lineWithMultipleStringsAndConcatenate(String input,String replaceWhat,String replaceWord) throws InputNullException
      {
                 Utility.checkNull(input);
                 Utility. checkNull(replaceWord);
                 Utility.checkNull(replaceWhat);
                 return input.replace(replaceWhat,replaceWord);
      }

       public String[] toSplit(String input,String whereToSplit) throws InputNullException
       {
                 Utility.checkNull(input);
                 Utility.checkNull(whereToSplit);
                 return input.split(whereToSplit);
       }

      public String toMergeString(String input,String []str)  throws InputNullException
      {
                       Utility.checkNull(input);
                       Utility.checkNull(str);
                       return String.join(input,str);
    }
      public boolean isEquals(String input1,String input2) throws InputNullException
      {
                Utility. checkNull(input1);
                Utility.checkNull(input2);
                return input1.equals(input2);
      }

      public boolean isEqualsIgnoreCase(String input1,String input2) throws InputNullException
      {
                Utility.checkNull(input1);
                Utility.checkNull(input2);
                return input1.equalsIgnoreCase(input2);
      }
      public String toRemoveSpace(String input) throws InputNullException
      {
               Utility.checkNull(input);
                 return input.trim();
    }
}
