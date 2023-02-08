package com.piotrgrochowiecki;

public class Main {

    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World 2");
            }
        };

        greeting2.sayHello();

        }
    }
