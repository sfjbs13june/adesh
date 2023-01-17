package com.adesh.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreetingControllerTest {
    GreetingController helloController=new GreetingController();
    @Test
    public void testSayGreet(){
        String expectedResult="greet from app";
        String result=helloController.SayGreet();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayWelcome(){
        String expectedResult="welcome from app";
        String result=helloController.SayWelcome();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayHi(){
        String expectedResult="hi from app";
        String result=helloController.SayHi();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayThanks(){
        String expectedResult="thanks from app";
        String result=helloController.SayThanks();
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void testrequesGreet(){
        String expectedResult = "greet from Request Mapping";
        String result=helloController.requestGreet();

    }

    @Test
    public void testrequesWelcome(){
        String expectedResult = "welcome from Request Mapping";
        String result=helloController.requestWelcome();

    }

    @Test
    public void testrequesHi(){
        String expectedResult = "hi from Request Mapping";
        String result=helloController.requestHi();

    }

    @Test
    public void testrequesThanks(){
        String expectedResult = "thanks from Request Mapping";
        String result=helloController.requestThanks();

    }
}
