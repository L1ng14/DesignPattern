package com.designPattern.DesignPrincipal.dependencyInversion;

public class negtive {

    static class Person {
        public void feed(Dog dog){
            dog.eat();
        }
    }

    static class Dog {
        public void eat() {
            System.out.println("主人喂我了。汪汪汪...");
        }
    }

    public static void main(String[] args) {
        Person person= new Person();
        Dog dog = new Dog();
        person.feed(dog);
    }
}
