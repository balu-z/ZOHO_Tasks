package com.runner;
import com.util.Utility;
import com.task.StringBuilderOperation;
import com.exception.InputNullException;
import java.util.Scanner;

public class RunnerSB
{
     Scanner in =new Scanner(System.in);
	 StringBuilderOperation task = new StringBuilderOperation();
  public static void main(String[]args)
  {
	 RunnerSB run =new RunnerSB();
     run.operations();
  }
  public void operations()
  {
     boolean flag = true;
	 while(flag)
	 {
		printInfo();
	    System.out.println("Enter your choice");
	    int choice =in.nextInt();
		try{
				switch(choice)
				{
					case 1 :
							operation1();
							break;
					case 2:
                            operation2();
                            break;	
                    case 3:
                            operation3();
                            break;
				    case 4:
                            operation4();
                            break;
		            case 5:
                            operation5();
                            break;
					case 6:
                            operation6();
                            break;
					case 7:
                            operation7();
                            break;
					case 8:
                            operation8();
                            break;
					case 9:
                            operation9();
                            break;
					case 10:
                            operation10();
                            break;		
                    case 11:
                            flag =false;
                            break;							
					default :
							System.out.println(" Wrong choice please choose a above mentioned one ");
							break;
				
				}
		   }
		   catch(InputNullException e)
		   {
			   e.printStackTrace();
		   }
	 }
  }
  public void printInfo()
  {
	  System.out.println("1.Create a StringBuilder Without a string and Print Length then add a string & print (length & final String) ");
	  System.out.println("2.Create a StringBuilder With a string and Print Length then add a strings & print (length & final String)  ");
	  System.out.println("3.Create a StringBuilder With 2 strings and space in between,Print Length then insert a string in between & print (length & final String)");
	  System.out.println("4.Create a StringBuilder With  strings and space in between,Print Length then delete a string & print (length & final String)");
	  System.out.println("5.Create a StringBuilder With  strings and space in between,Print Length then replace a symbol & print (length & final String)");
	  System.out.println("6.Create a StringBuilder With  strings and space in between,Print Length then reverse a string & print (length & final String)");
	  System.out.println("7.Create a StringBuilder With  strings and space in between,Print Length then delete characters between indexices & print (length & final String)");
	  System.out.println("8.Create a StringBuilder With  strings and space in between,Print Length then replace characters between indexices & print (length & final String)");
	  System.out.println("9.Create a StringBuilder With  strings and symbol in between,Print Length then find first index of the symbol");
	  System.out.println("10.Create a StringBuilder With  strings and symbol in between,Print Length then find last index of the symbol");
	  System.out.println("11.To Exit");
  }
  public StringBuilder createSb()
  {
     StringBuilder sb =new StringBuilder();
	 return sb;
  }
  public StringBuilder createSb(String str) throws InputNullException
  {
     Utility.checkNull(str);
     StringBuilder sb = new StringBuilder(str);
	 return sb;
  }
  public void operation1() throws InputNullException
  {
     try{
		  StringBuilder sb =createSb();
		  System.out.println("StringBuilder is created ");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a String");
		  String input1=in.next();
		  sb=task.add(sb,input1);
		  System.out.println("String added successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation2() throws InputNullException
  {
     try{
		  System.out.println("Enter a String to create a Stringbuider");
		  String input =in.next();
		  StringBuilder sb= createSb(input);
		  System.out.println("Stringbuilder is created");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  sb=sb.append(String.valueOf(ch));
		  sb=task.add(sb,input1,ch);
		  System.out.println("Strings are added successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation3() throws InputNullException
  {
     try{
		  String[] input1=new String[2];
		  for(int i=0;i<2;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  System.out.println("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  System.out.println("Strings are added successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a another String to insert ");
		  String input2=in.next(); 
		  sb=task.insert(sb,input2,ch);
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation4() throws InputNullException
  {
     try{
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  System.out.println("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  System.out.println("Strings are added successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter which string to delete ");
		  num=in.nextInt();
		  sb=task.delete(sb,num,ch);
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation5() throws InputNullException
  {
     try{
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  System.out.println("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  System.out.println("Strings are added successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a symbol to replace "+ch);
		  char ch1 =in.next().charAt(0);
		  sb=task.replace(sb,ch,ch1,num);
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation6() throws InputNullException
  {
     try{
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  System.out.println("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  System.out.println("Strings are reversed successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  sb=task.reverse(sb);
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation7() throws InputNullException
  {
     try{
		  System.out.println("Enter a String with minimum 10 character");
		  String input1=in.next();
		  while(input1.length()<10){
			  System.out.println("Enter a String with minimum 10 character");
		      input1=in.next();
		  }
		  StringBuilder sb =createSb(input1);
		  System.out.println("Stringbuilder is created with a String ");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a from index");
		  int fromIndex =in.nextInt();
		  System.out.println("Enter a to index");
		  int toIndex =in.nextInt();
		  sb=task.delete(sb,fromIndex,toIndex);
		  System.out.println("deleted successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation8() throws InputNullException
  {
     try{
		  System.out.println("Enter a String with minimum 10 character");
		  String input1=in.next();
		  while(input1.length()<10){
			  System.out.println("Enter a String with minimum 10 character");
		      input1=in.next();
		  }
		  StringBuilder sb =createSb(input1);
		  System.out.println("Stringbuilder is created with a String ");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Enter a from index");
		  int fromIndex =in.nextInt();
		  System.out.println("Enter a to index");
		  int toIndex =in.nextInt();
		  System.out.println("Enter a string to replace");
		  input1 =in.next();
		  sb=task.replace(sb,fromIndex,toIndex,input1);
		  System.out.println("replaced successfully");
		  System.out.println("Length of StringBuilder :"+Utility.getLength(sb));
		  System.out.println("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation9() throws InputNullException
  {
     try{
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  sb=task.add(sb,input1,ch);
		  System.out.println("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  System.out.println("Length of the StringBuilder "+Utility.getLength(sb));
		  int index=task.find(sb,ch,"first");
		  if(index!=-1){
		      System.out.println("first Index of "+ch+" in a String builder "+index);
		  }
		  else{
			  System.out.println(ch+" is not found");
		  }
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation10() throws InputNullException
  {
     try{
		  System.out.println("Enter a Number of Strings to add ");
		  int num=in.nextInt();
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
			 System.out.println("Enter a String "+(i+1));
		     input1[i]=in.next(); 
		  }
		  System.out.println("Enter a symbol to separate a string in stringbuilder ");
		  char ch =in.next().charAt(0);
		  StringBuilder sb =createSb();
		  sb=task.add(sb,input1,ch);
		  System.out.println("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  System.out.println("Length of the StringBuilder "+Utility.getLength(sb));
		  int index=task.find(sb,ch,"last");
		  if(index!=-1){
		      System.out.println("last Index of "+ch+" in a String builder "+index);
		  }
		  else{
			  System.out.println(ch+" is not found");
		  }
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  
}