package runner;

import java.io.*;
import com.task.Task3;
import com.exception.InputNullException;
import java.util.*;
import com.util.Utility;

public class RunnerTask3 
{
           BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
          Scanner in =new Scanner(System.in);
   public static void main (String [] args) throws IOException  
   {
        String input="";
        char ch=' ';
        int num=0;
       String input1="";
      
        RunnerTask3 scan =new RunnerTask3();
        Task3 ex1 =new Task3();
        
        boolean flag =true;

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

        while(flag)
        { 
           System.out.println("Enter a choice between 1- 21: ");
           int choice =scan.in.nextInt();
      try{ 
           switch(choice )
            {

                  case 1 :
                                        input=null;
                                       System.out.println("length of a string  "+Utility.getLength(input));
                                        break;
                  case 2:
                                      input=  stringSinInp();
                                       System.out.println("Character array of a String " +Arrays.toString(ex1.toCharArray(input)));
                                       break;   
                  case 3:
                                      input=  stringSinInp(); 
                                      System.out.println("Enter a index Position :");
                                       num=scan.in.nextInt();
                                       System.out.println("The '"+num+"'th character of the string '"+ex1.charAtSpecifiedIndex(input,num)+"'");
                                       break;    
                   case 4:
                                      input=  stringSinInp();
                                       ch=charInp();
                                      System.out.println("'"+ch+"' Character occured "+ex1.charOccurence(input,ch)+" times");
                                       break; 
                   case 5:
                                      input= stringSinInp();
                                       System.out.println("Enter a  another string to find greatest position");
                                       input1 =scan.reader.readLine();
                                      System.out.println("Greatest position of a characters  "+ex1.greatestPosition(input,input1));
                                       break;   
                   case 6:
                            
                                      input =stringSinInp();
                                       num= numInp(); 
                                       System.out.println("Last "+num+" character of a string "+ex1.lastCharacters(input,num));
                                       break; 

                     
                   case 7:
                                      input =stringSinInp();
                                       num= numInp();
                                      System.out.println("First "+ num +" character of a string "+ex1.firstChar(input,num));
                                       break;  
                    case 8:
                                
                                      input =stringSinInp();
                                       System.out.println("Enter a another string ");
                                       input1 =scan.reader.readLine();
                                       num= numInp();
                                       System.out.println("replaced string "+ex1.replaceFirstChar(input,num,input1));
                                       break;                                    
                                      
                   case 9:
                                      input =stringSinInp();
                                       System.out.println("Enter a another string ");
                                       input1 =scan.reader.readLine();
                                       System.out.println("Is string starts with '"+input1+"' -  "+ex1.isStartsWith(input,input1));
                                       break; 
                   case 10:
                                      input =stringSinInp();
                                       System.out.println("Enter a another string ");
                                       input1 =scan.reader.readLine();
                                       System.out.println("Is string ends with '"+input1+"' -  "+ex1.isEndsWith(input,input1));
                                       break; 
                   case 11:
                                        input =stringSinInp();
                                       System.out.println("String in a lowercase  "+ex1.toLowercase(input));
                                       break; 
                   case 12:
                                      input =stringSinInp();
                                       System.out.println("String in a uppercase  "+ex1.toUppercase(input));
                                       break; 
                   case 13:
                                      input =stringSinInp();
                                       System.out.println("Reversed String  "+ex1.stringReverse(input));
                                       break; 
                   case 14:
                                      input =stringMultiInp();
                                       System.out.println("Line with Multiple String   "+ex1.lineWithMultipleStrings(input));
                                       break; 
                   case 15:
                                      input =stringMultiInp();
                                       System.out.println("Enter a where to concatenate a string ");
                                       input1 =scan.reader.readLine();          
                                       System.out.println("Enter a replacedString to concatenate  ");
                                      String input2 =scan.reader.readLine();                            
                                       System.out.println("Line with Multiple String and concatenated into  Single string without space - "+ex1.lineWithMultipleStringsAndConcatenate(input,input1,input2));
                                       break; 
                   case 16:
                                      input =stringMultiInp();
                                       System.out.println("Enter a symbol to split a string ");
                                       input1 =scan.reader.readLine();
                                       System.out.println("Line with Multiple String converted to String array   "+Arrays.toString(ex1.toSplit(input,input1)));
                                       break; 
                   case 17:
                                      System.out.print("Enter a number of inputs :");
                                      int numOfInput=scan.in.nextInt();
                                       System.out.println("Enter a symbol to merge string ");
                                       input1 =scan.reader.readLine();
                                      String[] arr3=new String[numOfInput];
                                      for(int i=0;i<numOfInput;i++){
                                             System.out.println("Enter a String"+(i+1));
                                              input =scan.reader.readLine();
                                              arr3[i]=input; 
                                      }
                                        System.out.println("merged Multiple String with symbols  "+ex1.toMergeString(input1,arr3));                                       
                                       break; 
                   case 18:
                                      input =stringSinInp();
                                       System.out.println("Enter a another string ");
                                       input1 =scan.reader.readLine();
                                       System.out.println(" Is two string are equal (case senstive) -  "+ex1.isEquals(input,input1));
                                       break; 
                   case 19:
                                      input =stringSinInp();
                                       System.out.println("Enter a another string ");
                                       input1 =scan.reader.readLine();
                                       System.out.println(" Is two string are equal (case in senstive) -  "+ex1.isEquals(input,input1));
                                       break; 
                   case 20:
                                      input =stringMultiInp();
                                       System.out.println("Space removed  (start and end or both) string ="+ex1.toRemoveSpace(input));
                                       break; 
                   case 21:       
                                     flag=false;
                                      break;
                    default : 
                                     System.out.println(" Wrong choice please choose a mentioned one ");
                                      break;
                               }   
                          }
                         catch(InputNullException e){
                                   e.printStackTrace();
                                   break;
                          }
                         catch(Exception e){
                                  e.printStackTrace();
                                  break;
                       } 
                  }
        }

    public static String  stringSinInp()  
    {   
        RunnerTask3 scan =new RunnerTask3();
         System.out.println("Enter a String");
          String input=scan.in.next();
           return input;
     }
    public static String  stringMultiInp()  throws IOException
    {
        RunnerTask3 scan =new RunnerTask3();
        System.out.println("Enter a Line with Multiple String");
         String  input=scan.reader.readLine();
           return input;
     }
    public static int  numInp()
    {
        RunnerTask3 scan =new RunnerTask3();
          System.out.println("Enter a number of characters");
          int numIn=scan.in.nextInt();
           return numIn;
     }
    public static char charInp()
    {  
        RunnerTask3 scan =new RunnerTask3();
          System.out.println("Enter a character");
          char ch=scan.in.next().charAt(0);
           return ch;
     }
}
