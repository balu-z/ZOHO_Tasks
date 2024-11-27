package com.zoho.exception;


public class CustomTaskException extends Exception
{
      public CustomTaskException(){
                System.out.println("Entered input is invalid");
       }
      public CustomTaskException(String message){
                super(message);
       }
      public CustomTaskException(Throwable cause){
                super(cause);
       }
      public CustomTaskException(String message,Throwable cause){
                super(message,cause);
       }
      
      
}
