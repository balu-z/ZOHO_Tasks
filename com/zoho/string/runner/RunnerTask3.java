package com.zoho.string.runner;
import com.zoho.util.Utility;
import com.zoho.string.task.StringTask;
import com.zoho.exception.InputNullException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
 



public class RunnerTask3
{
          StringTask ex1 =new StringTask();
          Scanner in =new Scanner(System.in);
          String input="";
          char ch=' ';
          int num=0;
          String input1="";
          int input2=0;
    public static void main (String [] args) throws IOException
    {
       RunnerTask3 scan =new RunnerTask3();
       scan.doOperations();
    }
	public void output(String out){
		System.out.println(out);
	}
    public  String  inp(String message)
    {
          output(message);
          String input=in.next();
           return input;
    }
    public  String  lineInp(String message)  throws IOException
    {
         output(message);
		 in.nextLine();
         String  input=in.nextLine();
          return input;
    }
    public  int  numInp(String message)
    {
          output(message);
          int numIn=in.nextInt();
           return numIn;
     }
    public  char charInp(String message)
    {
          output(message);
          char ch=in.next().charAt(0);
           return ch;
     }
     public void doOperations()throws IOException
     {
        boolean flag =true;
        methodsInfo();
        while(flag)
        {
           output("Enter a choice between 1- 22: ");
           int choice =in.nextInt();
          try{
               switch(choice )
                {
                      case 1 :
                                            getLen();
                                            break;
                      case 2:
                                          stringInCharArray();
                                           break;
                      case 3:
                                          charFound();
                                           break;
                       case 4:
                                          charOccur();
                                           break;
                       case 5:
                                          greatestPosition();
                                           break;
                       case 6:
                                          lastCharacter();
                                           break;

                       case 7:
                                          firstChar();
                                           break;
                        case 8:
                                           replaceCharacters();
                                           break;
                       case 9:
                                          startingChar();
                                           break;
                       case 10:
                                          endingChar();
                                           break;
                       case 11:
                                           convLower();
                                           break;
                       case 12:
                                           convUpper();
                                           break;
                       case 13:
                                          reverseString();
                                           break;
                       case 14:
                                          multipleStrings();
                                           break;
                       case 15:
                                          concat();
                                           break;
                       case 16:
                                          stringArray();
                                           break;
                       case 17:
                                        mergeString();
                                           break;
                       case 18:
                                          equalSen();
                                           break;
                       case 19:
                                          equalInSen();
                                           break;
                       case 20:
                                          remSpace();
                                           break;
					   case 21:
                                          replaceMiddleChar();
                                           break;
                       case 22:
                                         flag=false;
                                          break;
                        default :
                                         output(" Wrong choice please choose a above mentioned one ");
                                          break;
                                   }
                              }
                             catch(InputNullException e){
                                       e.printStackTrace();
                                       break;
                              }
                              catch(Exception e)
                              {
                                  e.printStackTrace();
                                  break;
                              }
                      }
					  in.close();
     }
     public void methodsInfo()
     {
        output("1. to check length");
        output("2. to convert character array");
        output("3. to find char in specified index");
        output("4. to find number of occurence of a character");
        output("5. to find greatest position of a characters");
        output("6. to find last  characters of a string");
        output("7. to find first  characters of a string");
        output("8. to replace a string with new string at front and end");
        output("9. to check whether a string starts with another string or not");
        output("10. to check whether a string ends with another string or not");
        output("11. to convert all letters in a string to lowercase");
        output("12. to convert all letters in a string to uppercase");
        output("13. to reverse a string");
        output("14. to accept a line with multiple strings");
        output("15. to accept a line with multiple strings and concatenate each individual string into a single string without space");
        output("16. to accept a line with multiple strings and enclose each string into a string array");
        output("17. to accept multiple strings & merge each string with '-' in between");
        output("18. to check whether two strings are equal case sensitive");
        output("19. to check whether two strings are equal case in sensitive");
        output("20. to accept a string with a space at the end & beginning or both and to output a proper string with no space");
		output("21. to replace a string with new string at middle");
        output("22.Exit");
     }
     public void getLen()throws InputNullException
     {
         try{
             input =inp("Enter a String:");
             output("length of a string  "+Utility.getLength(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void stringInCharArray()throws InputNullException
     {
         try{
             input =null;
             output("Character array of a string "+Arrays.toString(ex1.toCharArray(input)));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
      public void charOccur()throws InputNullException
     {
         try{
                    input=inp("Enter a String:");
                    ch=charInp("Enter a character to find ");
                    output("'"+ch+"' Character occured "+ex1.charOccurence(input,ch)+" times");
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void greatestPosition()throws InputNullException
     {
         try{
                    input= inp("Enter a String:");
                    input1 =inp("Enter a another string ");
                    output("Greatest position of a characters  "+ex1.greatestPosition(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void lastCharacter()throws InputNullException
     {
         try{
                    input =inp("Enter a String:");;
                    num= numInp("Enter a number of characters ");
                    output("Last "+num+" character of a string "+ex1.lastCharacters(input,num));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void firstChar() throws InputNullException
     {
         try{
                    input =inp("Enter a String:");;
                    num= numInp("Enter a number of characters ");
                    output("First "+ num +" character of a string "+ex1.firstChar(input,num));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void replaceCharacters()throws  InputNullException
     {
         try{
                        input =inp("Enter a String:");
                        input1 =inp("Enter a another String:");
                        int input3 =numInp("Enter a where to replace , start(1) or end(0) ");
                        num=numInp("Enter a num of Characters ");
                        output("replaced string "+ex1.replaceChar(input,input1,num,input3));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
	 }
		 public void replaceMiddleChar() throws InputNullException
     {
         try{
                        input =inp("Enter a String:");
                        input1 =inp("Enter a another String:");						
                        num=numInp("Enter a num of Characters ");
                        input2 =numInp("Enter a index where to replace");
                        output("replaced string "+ex1.replaceMiddleChar(input,input1,num,input2));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void startingChar() throws InputNullException
     {
         try{
                    input =inp("Enter a String:");
                    input1 =inp("Enter a String to check :");
                    output("Is string starts with '"+input1+"' -  "+ex1.isStartsWith(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void endingChar() throws InputNullException
     {
         try{
                    input =inp("Enter a String:");
                    input1 =inp("Enter a String to check:");
                    output("Is string ends with '"+input1+"' -  "+ex1.isEndsWith(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void convLower() throws InputNullException
     {
         try{
                    input =inp("Enter a String:");
                    output("String in a lowercase  "+ex1.toLowercase(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void convUpper() throws InputNullException
     {
         try{
                    input =inp("Enter a String:");
                    output("String in a Uppercase  "+ex1.toUppercase(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void reverseString() throws InputNullException
     {
         try{
                   input =inp("Enter a String:");
                   output("Reversed String  "+ex1.stringReverse(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void multipleStrings() throws InputNullException
     {
         try{
                    input =lineInp("Enter a String:");
                    output("Line with Multiple String   "+ex1.lineWithMultipleStrings(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void concat() throws InputNullException
     {
         try{
                    input =lineInp("Enter a String:");
                    input1 =inp("Enter a where to concatenate a string ");
                    String input3 =inp("Enter a replacedString to concatenate  ");
                    output("Line with Multiple String and concatenated into  Single string without space - "+ex1.lineWithMultipleStringsAndConcatenate(input,input1,input3));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void stringArray() throws InputNullException
     {
         try{
                    input =lineInp("Enter a String:");
                    input1 =inp("Enter a symbol to split a string ");
                    output("Line with Multiple String converted to String array   "+Arrays.toString(ex1.toSplit(input,input1)));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void mergeString() throws InputNullException
     {
         try{
                int numOfInput=numInp("Enter a number of inputs");
                input1 =inp("Enter a symbol to merge string ");
                String[] arr3=new String[numOfInput];
                for(int i=0;i<numOfInput;i++){
				input =inp("Enter a String"+(i+1));
                     arr3[i]=input;
                }
                output("merged Multiple String with symbols  "+ex1.toMergeString(input1,arr3));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void equalSen() throws InputNullException
     {
         try{
                    input =inp("Enter a String");
                    input1 =inp("Enter a another string ");
                    output(" Is two string are equal (case senstive) -  "+ex1.isEquals(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void equalInSen() throws InputNullException
     {
         try{
                   input =inp("Enter a string ");
                   input1 =lineInp("Enter a another string ");
                   output(" Is two string are equal (case in senstive) -  "+ex1.isEquals(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void charFound() throws InputNullException
     {
         try{
                    input= inp("Enter a string ");
                    num=numInp("Enter a index Position :");
                    output("The '"+num+"'th character of the string '"+ex1.charAtSpecifiedIndex(input,num)+"'");
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void remSpace() throws InputNullException
     {
         try{
                    input=lineInp("Enter a string :");
                    output("Space removed String "+ex1.toRemoveSpace(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }

}
