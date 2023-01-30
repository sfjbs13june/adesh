package com.adesh.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationControllerTest {

    @Test
    public void addTest(){
        OperationController operationController=new OperationController();
        long result=operationController.add(5,6);
        Assertions.assertEquals(result,11);
    }

    @Test
    public void subTest(){
        OperationController operationController=new OperationController();
        long result=operationController.sub(11,6);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void mulTest(){
        OperationController operationController=new OperationController();
        long result=operationController.mul(3,6);
        Assertions.assertEquals(result,18);
    }

}
