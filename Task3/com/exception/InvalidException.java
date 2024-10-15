package com.exception;


public class InvalidException extends Exception
{
      public InvalidException(){
                System.out.println("Entered input is invalid");
       }

      public InvalidException(String message){
                super(message);
       }
      
      
}