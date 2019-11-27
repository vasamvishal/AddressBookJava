package com.dummytesting;

public class MoodAnalysisExpection extends Exception {

    enum Exceptiontype{
        ENTERED_NULL,ENTERED_EMPTY,ENTERED_WRONGMETHOD,METHOD_INVOCATION_ISSUE,NO_SUCH_FIELD,ILLEGAL_ACCESS;
    }
    Exceptiontype  type;

    public MoodAnalysisExpection(Exceptiontype type,String message) {
        super(message);
        this.type=type;
    }
    public MoodAnalysisExpection(Exceptiontype type,Throwable cause) {
        super(cause);
        this.type=type;
    }
    public MoodAnalysisExpection(String message,Exceptiontype type,Throwable cause) {
        super(message,cause);
        this.type=type;
    }
}