package com.task;  
import com.util.Utility;
import com.exception.InputNullException;

public class StringBuilderOperation
{
   public StringBuilder add(StringBuilder input1,String input2) throws InputNullException
   {
	   Utility.checkNull(input2);
	   input1.append(input2);
	   return input1;
   }
   public StringBuilder add(StringBuilder input1,String[] input2,char input3) throws InputNullException
   {
	   String str=String.valueOf(input3);
	   Utility.checkNull(str);
	   Utility.checkNull(input2);
	   int length=input2.length-1;
	   for(int i=0;i<length;i++)
	   {
		   input1.append(input2[i]).append(str);
	   }
       return input1.append(input2[length]);	   
   }
   public StringBuilder insert(StringBuilder input1,String input2,char input3) throws InputNullException
   {
	   Utility.checkNull(input2);
	   int offset =-1;
	   String str=String.valueOf(input3);
	   for(int i=0;i<Utility.getLength(input1);i++)
	   {
		   if(input1.charAt(i)==input3)
		   {
			   offset = i;
			   break;
		   }
	   }
	   if(offset!=-1)
	   {
		  return input1.insert(offset+1,input2+str);
	   }
	   else{
		  return input1;
	   }
   }
   public StringBuilder delete(StringBuilder input1,int input2,char input3) throws InputNullException
   {
	   Utility.boundaryCheck(input2);
	   String str=input1.toString();
	   String[]arr=str.split(String.valueOf(input3));
	   str=arr[input2-1];
	   int index = input1.toString().indexOf(str);
	   if(input2==arr.length){
		  return input1.delete(index-1,index+str.length());
	   }
	   else{
	     return input1.delete(index,index+str.length()+1);
	   }
   }
   public StringBuilder replace(StringBuilder input1,char input2,char input3,int input4) throws InputNullException
   {
	   int []arr=new int[input4-1];
	   for(int i=0,j=0;i<input1.length();i++)
	   {
		   if(input1.charAt(i)==input2)
		   {
			 arr[j]=i;
             j++;			 
		   }
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		  input1.setCharAt(arr[i],input3);
	   }   
	   return input1;
   }
   public StringBuilder reverse(StringBuilder input1) throws InputNullException
   {
	   return input1.reverse();
   }
   public StringBuilder delete(StringBuilder input1,int input2,int input3) throws InputNullException
   {
	   Utility.boundaryCheck(input2);
	   Utility.boundaryCheck(input3);
	   return input1.delete(input2,input3);
   }
   public StringBuilder replace(StringBuilder input1,int input2,int input3,String input4) throws InputNullException
   {
	   Utility.boundaryCheck(input2);
	   Utility.boundaryCheck(input3);
	   Utility.checkNull(input4);
	   return input1.replace(input2,input3,input4);
   }
   public int find(StringBuilder input1,char input2,String input3) throws InputNullException
   {
	   int index=-1;
	   if(input3.equalsIgnoreCase("first"))
	   {   
		   for(int i=0;i<input1.length();i++)
		   {
			   if(input1.charAt(i)==input2)
			   {
				   index=i;
				   break;
			   }
		   }
	   }
	   else if(input3.equalsIgnoreCase("last")){
		   for(int i=0;i<input1.length();i++)
		   {
			   if(input1.charAt(i)==input2)
			   {
				   index=i;
			   }
		   }
	   }
		   return index;	      
   }
   
}