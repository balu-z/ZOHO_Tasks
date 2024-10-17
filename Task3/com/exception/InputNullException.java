package com.exception;


public class InputNullException extends Exception
{
      public InputNullException(){
                System.out.println("Entered input is invalid");
       }

      public InputNullException(String message){
                super(message);
       }
      
      
}