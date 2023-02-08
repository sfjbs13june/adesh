package com.adesh.app;

import org.springframework.stereotype.Component;

@Component
public class MyclassB {


    public String getResult(){
        return "hello";
    }

    public String getMyString(String data){
        return "hello"+data;
    }

    public int getClassCRestult(MyClassC myClassC){
        return  myClassC.getMyAge(20);
    }

    public void NoreturnData(String data){
        System.out.println(data);

    }

}
