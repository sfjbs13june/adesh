package com.adesh.app;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OperationControllerTest {
    @Test
    public void addTest(){
        OperationController operationController=new OperationController();
        long result = operationController.add(11,6);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void subTest(){
        OperationController operationController=new OperationController();
        long result = operationController.sub(11,6);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void mulTest(){
        OperationController operationController=new OperationController();
        long result = operationController.mul(11,6);
        Assertions.assertEquals(result,66);
    }
}
