package com.runner;

import java.io.*;
import com.task.StringMethods;
import com.exception.InputNullException;
import java.util.*;
import com.util.Utility;

public class RunnerTask3
{
          BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
          StringMethods ex1 =new StringMethods();
          Scanner in =new Scanner(System.in);
          String input="";
          char ch=' ';
          int num=0;
          String input1="";
          int input2=0;
    public static void main (String [] args) throws IOException
    {
       RunnerTask3 scan =new RunnerTask3();
       scan.getInput();
    }
    public  String  stringSinInp()
    {
         System.out.println("Enter a String");
          String input=in.next();
           return input;
    }
    public  String  stringMultiInp()  throws IOException
    {
        System.out.println("Enter a Line with Multiple String");
         String  input=reader.readLine();
           return input;
    }
    public  int  numInp()
    {
          System.out.println("Enter a number of characters");
          int numIn=in.nextInt();
           return numIn;
     }
    public  char charInp()
    {
          System.out.println("Enter a character");
          char ch=in.next().charAt(0);
           return ch;
     }
     public void getInput()throws IOException
     {
        boolean flag =true;
        printInfo();
        while(flag)
        {
           System.out.println("Enter a choice between 1- 21: ");
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
                                         flag=false;
                                          break;
                        default :
                                         System.out.println(" Wrong choice please choose a above mentioned one ");
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
     }
     public void printInfo()
     {
        System.out.println("1. to check length");
        System.out.println("2. to convert character array");
        System.out.println("3. to find char in specified index");
        System.out.println("4. to find number of occurence of a character");
        System.out.println("5. to find greatest position of a characters");
        System.out.println("6. to find last  characters of a string");
        System.out.println("7. to find first  characters of a string");
        System.out.println("8. to replace a string with new string");
        System.out.println("9. to check whether a string starts with another string or not");
        System.out.println("10. to check whether a string ends with another string or not");
        System.out.println("11. to convert all letters in a string to lowercase");
        System.out.println("12. to convert all letters in a string to uppercase");
        System.out.println("13. to reverse a string");
        System.out.println("14. to accept a line with multiple strings");
        System.out.println("15. to accept a line with multiple strings and concatenate each individual string into a single string without space");
        System.out.println("16. to accept a line with multiple strings and enclose each string into a string array");
        System.out.println("17. to accept multiple strings & merge each string with '-' in between");
        System.out.println("18. to check whether two strings are equal case sensitive");
        System.out.println("19. to check whether two strings are equal case in sensitive");
        System.out.println("20. to accept a string with a space at the end & beginning or both and to output a proper string with no space");
        System.out.println("21.Exit");
     }
     public void getLen()throws InputNullException
     {
         try{
             System.out.print("Enter a String:");
             input =null;
             System.out.println("length of a string  "+Utility.getLength(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void stringInCharArray()throws InputNullException
     {
         try{
             System.out.print("Enter a String:");
             input =in.next();
             System.out.println("Character array of a string "+Arrays.toString(ex1.toCharArray(input)));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
      public void charOccur()throws InputNullException
     {
         try{
                    input=stringSinInp();
                    ch=charInp();
                    System.out.println("'"+ch+"' Character occured "+ex1.charOccurence(input,ch)+" times");
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void greatestPosition()throws InputNullException
     {
         try{
                    input= stringSinInp();
                    System.out.println("Enter a  another string to find greatest position");
                    input1 =reader.readLine();
                    System.out.println("Greatest position of a characters  "+ex1.greatestPosition(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void lastCharacter()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    num= numInp();
                    System.out.println("Last "+num+" character of a string "+ex1.lastCharacters(input,num));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void firstChar()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    num= numInp();
                    System.out.println("First "+ num +" character of a string "+ex1.firstChar(input,num));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void replaceCharacters()throws InputNullException
     {
         try{
                        input =stringSinInp();
                        System.out.println("Enter a another string ");
                        input1 =reader.readLine();
                        num= numInp();
                        System.out.println("Enter a specified index to replace ");
                        input2 =in.nextInt();
                        System.out.println("replaced string "+ex1.replaceChar(input,num,input1,input2));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void startingChar()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    System.out.println("Enter a another string ");
                    input1 =reader.readLine();
                    System.out.println("Is string starts with '"+input1+"' -  "+ex1.isStartsWith(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void endingChar()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    System.out.println("Enter a another string ");
                    input1 =reader.readLine();
                    System.out.println("Is string ends with '"+input1+"' -  "+ex1.isEndsWith(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void convLower()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    System.out.println("String in a lowercase  "+ex1.toLowercase(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void convUpper()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    System.out.println("String in a lowercase  "+ex1.toUppercase(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void reverseString()throws InputNullException
     {
         try{
                   input =stringSinInp();
                   System.out.println("Reversed String  "+ex1.stringReverse(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void multipleStrings()throws InputNullException
     {
         try{
                    input =stringMultiInp();
                    System.out.println("Line with Multiple String   "+ex1.lineWithMultipleStrings(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void concat()throws InputNullException
     {
         try{
                    input =stringMultiInp();
                    System.out.println("Enter a where to concatenate a string ");
                    input1 =reader.readLine();
                    System.out.println("Enter a replacedString to concatenate  ");
                    String input2 =reader.readLine();
                    System.out.println("Line with Multiple String and concatenated into  Single string without space - "+ex1.lineWithMultipleStringsAndConcatenate(input,input1,input2));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void stringArray()throws InputNullException
     {
         try{
                    input =stringMultiInp();
                    System.out.println("Enter a symbol to split a string ");
                    input1 =reader.readLine();
                    System.out.println("Line with Multiple String converted to String array   "+Arrays.toString(ex1.toSplit(input,input1)));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void mergeString()throws InputNullException
     {
         try{
                System.out.print("Enter a number of inputs :");
                int numOfInput=in.nextInt();
                System.out.println("Enter a symbol to merge string ");
                input1 =reader.readLine();
                String[] arr3=new String[numOfInput];
                for(int i=0;i<numOfInput;i++){
                     System.out.println("Enter a String"+(i+1));
                     input =reader.readLine();
                     arr3[i]=input;
                }
                System.out.println("merged Multiple String with symbols  "+ex1.toMergeString(input1,arr3));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void equalSen()throws InputNullException
     {
         try{
                    input =stringSinInp();
                    System.out.println("Enter a another string ");
                    input1 =reader.readLine();
                    System.out.println(" Is two string are equal (case senstive) -  "+ex1.isEquals(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void equalInSen()throws InputNullException
     {
         try{
                   input =stringSinInp();
                   System.out.println("Enter a another string ");
                    input1 =reader.readLine();
                    System.out.println(" Is two string are equal (case in senstive) -  "+ex1.isEquals(input,input1));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }public void charFound()throws InputNullException
     {
         try{
                    input=  stringSinInp();
                    System.out.println("Enter a index Position :");
                     num=in.nextInt();
                     System.out.println("The '"+num+"'th character of the string '"+ex1.charAtSpecifiedIndex(input,num)+"'");
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }
     public void remSpace()throws InputNullException
     {
         try{
                    input=  stringMultiInp();
                     System.out.println("Space removed String "+ex1.toRemoveSpace(input));
         }
         catch(Exception e)
         {
             throw new InputNullException("Error Occured in input",e);
         }
     }

}
