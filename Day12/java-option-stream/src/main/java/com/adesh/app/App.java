package com.adesh.app;

import java.util.Optional;

public class App {
    public static void main(String[] args){
        OptionsApp optionsApp = new OptionsApp();
        Optional<Cat> result = optionsApp.getCat("c1");

//        if(result.isPresent()){
//            Cat cat = result.get();
//            System.out.println(cat);
//        }

        optionsApp.getCat("c3").ifPresent(cat -> System.out.println(cat));
    }
}
