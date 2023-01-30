package com.adesh.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{


    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHi();
        Assert.assertEquals(expectedResult,result);
    }


    public void testSayWelcome(){
        String expectedResult= "welcome from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayWelcome();
        Assert.assertEquals(expectedResult,result);
    }

    public void testsayHello(){
        String expectedResult= "hello from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayHello();
        Assert.assertEquals(expectedResult,result);
    }

    public void testsayBye(){
        String expectedResult= "bye from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayBye();
        Assert.assertEquals(expectedResult,result);
    }
}