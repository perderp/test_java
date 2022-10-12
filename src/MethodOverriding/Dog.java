package MethodOverriding;

public class Dog extends Animal {
    // 2 Types of Method Overriding

    /*
       1.) The use of Override

        RULES OF OVERRIDE
        *Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
        *We cannot override the method declared as final and static.
        *We should always override abstract methods of the superclass


        2.) super Keyword
        *Can we access the method of the superclass after overriding?
        -Well, the answer is Yes. To access the method of the superclass from the subclass, we use the super keyword
     */
//    @Override
    public void displayInfo(){
        System.out.println("I am a Dog");
    }

    /*
        Access Specifier in Overriding

        class ANIMAL
           -> "protected" void displayInfo()
        class DOG extends ANIMAL
            public void displayInfo()

        class Main
            Dog d1= new Dog()
            d1.displayInfo() <- OUTPUT IS THE DOG Method

        In Java, abstract classes are created to be the superclass of other classes. And, if a class contains an abstract method, it is mandatory to override it.
     */
    public void printType(){
        // CANNOT ACCES SUPER TYPE WHEN THE SUPER CLASS IS PRIVATE
        System.out.println(super.type);
    }
}

class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}