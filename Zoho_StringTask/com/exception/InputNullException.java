package com.exception;


public class InputNullException extends Exception
{
      public InputNullException(){
                System.out.println("Entered input is invalid");
       }
      public InputNullException(String message){
                super(message);
       }
      public InputNullException(Throwable cause){
                super(cause);
       }
      public InputNullException(String message,Throwable cause){
                super(message,cause);
       }
      
      
}
