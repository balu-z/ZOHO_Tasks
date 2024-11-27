package com.zoho.stringbuilder.runner;
import com.zoho.util.Utility;
import com.zoho.stringbuilder.task.StringBuilderTask;
import com.zoho.exception.CustomTaskException;
import java.util.Scanner;

public class RunnerSB
{
     Scanner in =new Scanner(System.in);
	 StringBuilderTask task = new StringBuilderTask();
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
							toCreateSbWithoutString();
							break;
					case 2:
                            toCreateSbWithStringAndSeparator();
                            break;	
                    case 3:
                            toCreateSbAndInsertingString();
                            break;
				    case 4:
                            toCreateSbAndDeleteString();
                            break;
		            case 5:
                            toCreateSbAndReplaceSeparator();
                            break;
					case 6:
                            toCreateSbAndReverseString();
                            break;
					case 7:
                            toCreateSbAndDeleteCharacters();
                            break;
					case 8:
                            toCreateSbAndReplaceCharacters();
                            break;
					case 9:
                            toCreateSbAndFindFirstSeparator();
                            break;
					case 10:
                            toCreateSbAndFindLastSeparator();
                            break;		
                    case 11:
                            flag =false;
                            break;							
					default :
							output(" Wrong choice please choose a above mentioned one ");
							break;
				
				}
		   }
		   catch(CustomTaskException e)
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
	  output("5.Create a StringBuilder With  strings and space in between,Print Length then replace a separator & print (length & final String)");
	  output("6.Create a StringBuilder With  strings and space in between,Print Length then reverse a string & print (length & final String)");
	  output("7.Create a StringBuilder With  strings and space in between,Print Length then delete characters between indexices & print (length & final String)");
	  output("8.Create a StringBuilder With  strings and space in between,Print Length then replace characters between indexices & print (length & final String)");
	  output("9.Create a StringBuilder With  strings and separator in between,Print Length then find first index of the separator");
	  output("10.Create a StringBuilder With  strings and separator in between,Print Length then find last index of the separator");
	  output("11.To Exit");
  }
  
  public void toCreateSbWithoutString() throws CustomTaskException
  {
     try{
		  StringBuilder sb =task.createSb();
		  output("StringBuilder is created ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  sb=task.add(sb,input1); 
		  output("Strings added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbWithStringAndSeparator() throws CustomTaskException
  {
     try{
		  String input =inp("Enter a String to create a Stringbuider");
		  StringBuilder sb= task.createSb(input);
		  output("Stringbuilder is created");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  sb=sb.append(ch);
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndInsertingString() throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  String input2=inp("Enter a another String to insert "); 
		  int where=numInp("Enter where to insert ,Example like after this String");
		  sb=task.insert(sb,input2,where,ch);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndDeleteString() throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  num=numInp("Enter which string to delete");
	      sb=task.delete(sb,input1[num-1]);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndReplaceSeparator() throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
		  output("Stringbuilder is created with 2 Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are added successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  String ch1 =inp("Enter a separator to replace "+ch);
		  sb=task.replace(sb,ch,ch1);
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndReverseString() throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
		  output("Stringbuilder is created with "+num+" Strings with "+ch+" in between");
		  sb=task.add(sb,input1,ch);
		  output("Strings are reversed successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  sb=task.reverse(sb);
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndDeleteCharacters() throws CustomTaskException
  {
     try{
		  String input1=inp("Enter a String with minimum 10 character");
		  while(input1.length()<10){
		      input1=inp("Enter a String with minimum 10 character");
		  }
		  StringBuilder sb =task.createSb(input1);
		  output("Stringbuilder is created with a String ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int fromIndex =numInp("Enter from index");
		  int toIndex =numInp("Enter to index");
		  sb=task.delete(sb,fromIndex,toIndex);
		  output("deleted successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndReplaceCharacters() throws CustomTaskException
  {
     try{
		  String input1=inp("Enter a String with minimum 10 character");
		  while(input1.length()<10){
		      input1=inp("Enter a String with minimum 10 character");
		  }
		  StringBuilder sb =task.createSb(input1);
		  output("Stringbuilder is created with a String ");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  int fromIndex =numInp("Enter from index");
		  int toIndex =numInp("Enter to index");
		  input1 =inp("Enter a string to replace");
		  sb=task.replace(sb,fromIndex,toIndex,input1);
		  output("replaced successfully");
		  output("Length of StringBuilder :"+Utility.getLength(sb));
		  output("Output of Final String :"+Utility.getStringInBuilder(sb));
		}
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndFindFirstSeparator() throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
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
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  public void toCreateSbAndFindLastSeparator () throws CustomTaskException
  {
     try{
		  int num=numInp("Enter a Number of Strings to add");
		  String[] input1=new String[num];
		  for(int i=0;i<num;i++)
		  {
		     input1[i]=inp("Enter a String "+(i+1)); 
		  }
		  String ch =inp("Enter a separator to separate a string in a stringbuilder");
		  StringBuilder sb =task.createSb();
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
		catch(CustomTaskException e)
		{
		    throw new CustomTaskException("Exception thrown");
		}    
  }
  
}