package com.zoho.stringbuilder.runner;
import com.zoho.util.Utility;
import com.zoho.stringbuilder.task.StringBuilderOperation;
import com.zoho.exception.InputNullException;
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
  public void output(String message){
	  System.out.println(message);
  }
  public  String  inp(String message){
          output(message);
          String input=in.next();
          return input;
  }
  public  int  numInp(String message){
          output(message);
          int numIn=in.nextInt();
          return numIn;
  }
  public void operations()
  {
     boolean flag = true;
	 while(flag)
	 {
		printInfo();
	    int choice =numInp("Enter your choice");
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
							output(" Wrong choice please choose a above mentioned one ");
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
	  output("1.Create a StringBuilder Without a string and Print Length then add a string & print (length & final String) ");
	  output("2.Create a StringBuilder With a string and Print Length then add a strings & print (length & final String)  ");
	  output("3.Create a StringBuilder With 2 strings and space in between,Print Length then insert a string in between & print (length & final String)");
	  output("4.Create a StringBuilder With  strings and space in between,Print Length then delete a string & print (length & final String)");
	  output("5.Create a StringBuilder With  strings and space in between,Print Length then replace a symbol & print (length & final String)");
	  output("6.Create a StringBuilder With  strings and space in between,Print Length then reverse a string & print (length & final String)");
	  output("7.Create a StringBuilder With  strings and space in between,Print Length then delete characters between indexices & print (length & final String)");
	  output("8.Create a StringBuilder With  strings and space in between,Print Length then replace characters between indexices & print (length & final String)");
	  output("9.Create a StringBuilder With  strings and symbol in between,Print Length then find first index of the symbol");
	  output("10.Create a StringBuilder With  strings and symbol in between,Print Length then find last index of the symbol");
	  output("11.To Exit");
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
		  output("StringBuilder is created ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  String input1=inp("Enter a String");
		  sb=task.add(sb,input1);
		  output("String added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation2() throws InputNullException
  {
     try{
		  String input =inp("Enter a String to create a Stringbuider");
		  StringBuilder sb= createSb(input);
		  output("Stringbuilder is created");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  sb=sb.append(ch);
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
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
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  output("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  String input2=inp("Enter a another String to insert "); 
		  sb=task.insert(sb,input2,ch);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation4() throws InputNullException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  output("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  num=numInp("Enter which string to delete");
		  sb=task.delete(sb,num,ch);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation5() throws InputNullException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  output("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  String ch1 =inp("Enter a symbol to replace "+ch);
		  sb=task.replace(sb,ch,ch1,num);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation6() throws InputNullException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are reversed successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  sb=task.reverse(sb);
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation7() throws InputNullException
  {
     try{
		  String input1=inp("Enter a String with minimum 10 character");
		  while(input1.length()<10){
		      input1=inp("Enter a String with minimum 10 character");
		  }
		  StringBuilder sb =createSb(input1);
		  output("Stringbuilder is created with a String ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int fromIndex =numInp("Enter from index");
		  int toIndex =numInp("Enter to index");
		  sb=task.delete(sb,fromIndex,toIndex);
		  output("deleted successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation8() throws InputNullException
  {
     try{
		  String input1=inp("Enter a String with minimum 10 character");
		  while(input1.length()<10){
		      input1=inp("Enter a String with minimum 10 character");
		  }
		  StringBuilder sb =createSb(input1);
		  output("Stringbuilder is created with a String ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int fromIndex =numInp("Enter from index");
		  int toIndex =numInp("Enter to index");
		  input1 =inp("Enter a string to replace");
		  sb=task.replace(sb,fromIndex,toIndex,input1);
		  output("replaced successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final StringBuilder :"+Utility.getBuilder(sb));
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  public void operation9() throws InputNullException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  sb=task.add(sb,input1,ch);
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  output("Length of the StringBuilder "+Utility.getLength(sb));
		  int index=task.find(sb,ch,true);
		  if(index!=-1){
		      output("first Index of "+ch+" in a String builder is "+index);
		  }
		  else{
			  output(ch+" is not found");
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
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a symbol to separate a string in a stringbuilder");
		  StringBuilder sb =createSb();
		  sb=task.add(sb,input1,ch);
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  output("Length of the StringBuilder "+Utility.getLength(sb));
		  int index=task.find(sb,ch,false);
		  if(index!=-1){
		      output("last Index of "+ch+" in a String builder is "+index);
		  }
		  else{
			  output(ch+" is not found");
		  }
		}
		catch(InputNullException e)
		{
		    throw new InputNullException("Exception thrown");
		}    
  }
  
}