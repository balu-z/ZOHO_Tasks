package com.zoho.stringbuilder.task;  
import com.zoho.util.Utility;
import com.zoho.exception.CustomTaskException;

public class StringBuilderTask
{
  public StringBuilder createSb()
  {
     return new StringBuilder();
  }
  public StringBuilder createSb(String str) throws CustomTaskException
  {
     Utility.checkNull(str);
     return new StringBuilder(str);
  }
  public StringBuilder add(StringBuilder sb,String []strArr) throws CustomTaskException
   {
	   Utility.checkNull(sb);
	   Utility.emptyArrayCheck(strArr);
	   for(int i=0;i<strArr.length;i++){
	      sb.append(strArr[i]);
	   }
	   return sb;
   }
   public StringBuilder add(StringBuilder sb,String str) throws CustomTaskException
   {
	   Utility.checkNull(sb);
	   Utility.checkNull(str);
	   sb.append(str);
	   return sb;
   }
   public StringBuilder add(StringBuilder sb,String[] strArr,String separator) throws CustomTaskException
   {
	   Utility.checkNull(sb);
	   Utility.checkNull(separator);
	   Utility.emptyArrayCheck(strArr);
	   int length=strArr.length-1;
	   for(int i=0;i<length;i++)
	   {
		   sb.append(strArr[i]).append(separator);
	   }
       return sb.append(strArr[length]);	   
   }
   public StringBuilder insert(StringBuilder sb,String str,int where,String separator) throws CustomTaskException
   {
	   int length=Utility.getLength(sb);
	   Utility.checkNull(str);
	   Utility.checkNull(separator);
	   int offset =-1,count=0;
	   for(int i=0;i<length;i++)
	   {
		   if(sb.charAt(i)==separator.charAt(0))
		   {
			   offset = i;
			   count++;
			   if(count==where){
				   break;
			   }
		   }
	   }
	   if(offset!=-1)
	   {
		  return sb.insert(offset+1,str+separator);
	   }
	   else{
		  return sb;
	   }
   }
   public StringBuilder delete(StringBuilder sb,String str) throws CustomTaskException
   {
	   Utility.checkNull(sb);
	   Utility.checkNull(str);
	   int length=Utility.getLength(str);
	   int index =sb.indexOf(str);
	   if(index!=0){
		  return sb.delete(index-1,index+length);
	   }
	   else{
	     return sb.delete(index,index+length+1);
	   }
   }
   public StringBuilder replace(StringBuilder sb,String prevSeparator,String newSeparator) throws CustomTaskException
   {
	   int length=Utility.getLength(sb);
	   Utility.checkNull(prevSeparator);
	   Utility.checkNull(newSeparator);
	   for(int i=0,j=0;i<length;i++)
	   {
		   if(sb.charAt(i)==prevSeparator.charAt(0))
		   {
			   sb.setCharAt(i,newSeparator.charAt(0)); 
		   }
	   }  
	   return sb;
   }
   public StringBuilder reverse(StringBuilder sb) throws CustomTaskException
   {
	   Utility.checkNull(sb);
	   return sb.reverse();
   }
   public StringBuilder delete(StringBuilder sb,int fromIndex,int toIndex) throws CustomTaskException
   {
	   int length =Utility.getLength(sb);
	   Utility.boundaryCheck(fromIndex,length);
	   Utility.boundaryCheck(toIndex,length);
	   return sb.delete(fromIndex,toIndex);
   }
   public StringBuilder replace(StringBuilder sb,int fromIndex,int toIndex,String str) throws CustomTaskException
   {
	   int length =Utility.getLength(sb);
	   Utility.boundaryCheck(fromIndex,length);
	   Utility.boundaryCheck(toIndex,length);
	   Utility.checkNull(str);
	   return sb.replace(fromIndex,toIndex,str);
   }
   public int find(StringBuilder sb,String separator,boolean which) throws CustomTaskException
   {
	   int length=Utility.getLength(sb); 
	   int index=-1;
	   Utility.checkNull(separator); 
		   for(int i=0;i<length;i++)
		   {
			   if(sb.charAt(i)==separator.charAt(0))
			   {
				   index=i;
				   if(which){
					   break;
			       }
		       }
		   }
		   return index;
   }
}