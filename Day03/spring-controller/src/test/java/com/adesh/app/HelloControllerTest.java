package com.adesh.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {
   HelloController helloController=new HelloController();
    @Test
    public void testSayHello(){
        String expectedResult="Hello from app";
        String result=helloController.SayHello();
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testrequesHello(){
        String expectedResult = "Hello from Request mapping";
        String result=helloController.requestHello();

    }
}
