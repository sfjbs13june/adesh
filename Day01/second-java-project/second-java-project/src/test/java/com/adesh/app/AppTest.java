package com.adesh.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     **/

    @Test

    public void testSayHi() {
        String expectedResult = "Hi from greeting";
        Greeting greeting = new Greeting();
        String result = greeting.SayHi();
        Assert.assertEquals(expectedResult, result);
    }

    public void testSayWelcome() {
        String expectedResult = "Welcome from greeting";
        Greeting greeting = new Greeting();
        String result = greeting.SayWelcome();
        Assert.assertEquals(expectedResult, result);
    }

    public void testSayHello() {
        String expectedResult = "Hello from greeting";
        Greeting greeting = new Greeting();
        String result = greeting.SayHello();
        Assert.assertEquals(expectedResult, result);
    }

    public void testSayBye() {
        String expectedResult = "Bye from greeting";
        Greeting greeting = new Greeting();
        String result = greeting.SayBye();
        Assert.assertEquals(expectedResult, result);
    }

}

//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }

