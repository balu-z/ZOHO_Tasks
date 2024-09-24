package runner;

import java.io.*;
import task.Task3;
import java.util.*;

public class RunnerTask3 
{

   public static void main (String [] args) throws IOException
   {
        String input ="";
        char ch=' ';
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        
        Scanner in =new Scanner(System.in);

        Task3 ex1 =new Task3();
        
        boolean flag =true;

        System.out.println("1. to check length");
        System.out.println("2. to convert character array");
        System.out.println("3. to find penUltimate character");
        System.out.println("4. to find number of occurence of a character");
        System.out.println("5. to find greatest position of a character");
        System.out.println("6. to find last 5 characters of a string");
        System.out.println("7. to find first 3 characters of a string");
        System.out.println("8. to convert  a string into character array");
        System.out.println("9. to check whether a string starts with 'ent' or not");
        System.out.println("10. to check whether a string ends with 'le' or not");
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
           int choice =in.nextInt();

           switch(choice )
            {
                  case 1 :
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                       System.out.println("length of a string  "+ex1.length(input));
                                        break;   
                  case 2:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Character array of a String " +Arrays.toString(ex1.toCharArray(input)));
                                       break;   
                  case 3:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Pen Ultimate character is "+ex1.penUltimateChar(input));
                                       break;    
                   case 4:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                      System.out.println("Enter a character  :");
                                      ch =in.next().charAt(0);
                                      System.out.println("Character occured "+ex1.charOccurence(input,ch)+" times");
                                       break; 
                   case 5:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                      System.out.println("Enter a character :");
                                      ch =in.next().charAt(0);
                                      System.out.println("Greatest position of a character  "+ex1.greatestPosition(input,ch));
                                       break;   
                   case 6:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Last 5 character of a string "+ex1.last5Char(input));
                                       break;   
                   case 7:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                      System.out.println("First 3 character of a string "+ex1.first3Char(input));
                                       break;  
                    case 8:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("replaced string "+ex1.replaceFirst3Char(input));
                                       break;    
                   case 9:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Is string starts with 'ent' -  "+ex1.startsWith(input,"ent"));
                                       break; 
                   case 10:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Is string ends with 'le' -  "+ex1.endsWith(input,"le"));
                                       break; 
                   case 11:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("String in a lowercase  "+ex1.toLowercase(input));
                                       break; 
                   case 12:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("String in a uppercase  "+ex1.toUppercase(input));
                                       break; 
                   case 13:
                                      System.out.print("Enter a String : ");
                                       input =in.next();
                                       System.out.println("Reversed String  "+ex1.stringReverse(input));
                                       break; 
                   case 14:
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                       System.out.println("Line with Multiple String   "+ex1.lineWithMultipleStrings(input));
                                       break; 
                   case 15:
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                      String[] arr=input.split("\\s*");
                                       System.out.println("Line with Multiple String and concatenated into  Single string without space ");
                                       ex1.lineWithMultipleStringsAndConcatenate(arr);
                                      System.out.println();
                                       break; 
                   case 16:
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                       System.out.println("Line with Multiple String converted to String array   "+Arrays.toString(ex1.split(input)));
                                       break; 
                   case 17:
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                      System.out.print("Enter a String : ");
                                        String input1 =reader.readLine();
                                      System.out.print("Enter a String : ");
                                     String  input2 =reader.readLine();
                                      System.out.print("Enter a String : ");
                                       String input3 =reader.readLine();
                                      System.out.print("Enter a String : ");
                                       String input4 =reader.readLine();
                                       System.out.println("Merged String with '-' symbol  ");
                                       ex1.mergedString(input,input1,input2,input3,input4);
                                      System.out.println();
                                       break; 
                   case 18:
                                      System.out.print("Enter a String 1 : ");
                                       input =reader.readLine();
                                      System.out.print("Enter a String 2 : ");
                                     input1 =reader.readLine();
                                       System.out.println(" Is two string are equal (case senstive) -  "+ex1.equals(input,input1));
                                       break; 
                   case 19:
                                      System.out.print("Enter a String 1 : ");
                                       input =reader.readLine();
                                      System.out.print("Enter a String 2 : ");
                                       input1 =reader.readLine();
                                       System.out.println(" Is two string are equal (case in senstive) -  "+ex1.equals(input,input1));
                                       break; 
                   case 20:
                                      System.out.print("Enter a String : ");
                                       input =reader.readLine();
                                       System.out.println("Space removed  (start and end or both) string  "+ex1.removeSpace(input));
                                       break; 
                   case 21:       
                                     flag=false;
                                      break;
                    default : 
                                     System.out.println(" Wrong choice please choose a mentioned one ");
                                      break;
                                        
                      }
              }

         }

}

      
