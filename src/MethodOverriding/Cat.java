package MethodOverriding;

public class Cat extends Animal {
    Cat(){
        super("Animales");
        System.out.println("I am a Cat");
    }
}
class Main02{
    public static void main(String[] args) {
        Cat c1 = new Cat();

    }
}
