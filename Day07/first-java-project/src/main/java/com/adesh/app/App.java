package com.adesh.app;

public class App
{
    public static void main( String[] args )
    {
        Greeting greeting = new Greeting();

        String result= greeting.SayHi();
        System.out.println(result);

        String welcome= greeting.sayWelcome();
        System.out.println(welcome);

        String Hello= greeting.sayHello();
        System.out.println(Hello);

        String sayBye= greeting.sayBye();
        System.out.println(sayBye);


    }
    public double getDiv(int a,int b){
        return a/b;
    }

    public double getThrowException(int a,int b) throws MyDataException {
        if(b==0){
            throw new MyDataException("b should not be null");
        }
        return a/b;
    }
}