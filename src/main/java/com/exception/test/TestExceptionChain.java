package com.exception.test;

public class TestExceptionChain {
    void firstThrow() throws Exception
    {
        throw new Exception("Root Exception");
        
    }
    void secondThrow() throws MyException1
    {
        try {
            firstThrow();
        } catch (Exception e) {
             //e.printStackTrace();
            throw new MyException1(e);
        }
    }
    void printException() throws MyException2{
        try {
            secondThrow();
        } catch (Exception e) {
            //e.printStackTrace();
            throw new MyException2(e);
        }

    }
}