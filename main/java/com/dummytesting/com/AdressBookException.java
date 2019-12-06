package com.dummytesting.com;

public class AdressBookException extends Exception {
    public enum ExceptionType{
        NO_SUCHFILE,NO_FILEFOUND ;
    }
    public ExceptionType type;

    public AdressBookException(String message, ExceptionType type) {
        super(message);
        this.type= type;
    }
    public AdressBookException(ExceptionType type, Throwable cause) {
        super(cause);
        this.type= type;
    }
}
