package Abstract;
/*
The major use of abstract classes and methods is to achieve abstraction in Java.
Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.

A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake,
the motorbike will stop. However, the working of the brake is kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently
for different motorbikes, however, what brake does will be the same.
 */

abstract class Animal{
    abstract void makeSound();

    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark Bark");
    }
}

class Main02{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}