package com.exception.test;

/**
 * Created by lijingen on 2016/12/22.
 */
public class TestException {
    public static void main(String[] args) {
        try{

            TestExceptionChain testExceptionChain=new TestExceptionChain();
            testExceptionChain.printException();
        }
        catch(MyException2 e)
        {
            e.printStackTrace();
        }

    }
}
