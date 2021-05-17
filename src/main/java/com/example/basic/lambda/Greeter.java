package com.example.basic.lambda;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        //MyLambda myLambda = () -> System.out.println("Hello world");
        //MyAdd addFunction = (int a, int b) -> a+b;
        Greeter greeter = new Greeter();
        Greeting greeting = () -> System.out.println("Hello world");
        //greeting.perform();
        greeter.greet(greeting);
    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int x, int y);
}
