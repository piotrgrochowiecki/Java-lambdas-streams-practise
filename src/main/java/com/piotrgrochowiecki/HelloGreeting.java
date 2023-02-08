package com.piotrgrochowiecki;

public class HelloGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
