package com.designPattern.DesignPrincipal.dependencyInversion;

public class postive {
    static class Person {
        public void feed(Animal animal){
            animal.eat();
        }
    }

    interface Animal{
        public void eat();
    }

    static class Dog implements Animal{
        public void eat() {
            System.out.println("我是狗狗，主人喂我了。汪汪汪...");
        }
    }

    static class Cat implements Animal{
        public void eat() {
            System.out.println("我是猫咪，主人也喂我了。（我为什么要说也？）喵喵喵...");
        }
    }

    public static void main(String[] args) {
        Person person= new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();
        person.feed(dog);
        person.feed(cat);
    }
}
