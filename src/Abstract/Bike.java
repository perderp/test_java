package Abstract;
/*
    *We use the abstract keyword to create abstract classes and methods.
    *An abstract method doesn't have any implementation (method body).
    *A class containing abstract methods should also be abstract.
    *We cannot create objects of an abstract class.
    *To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
    *A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
    *We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,
        -Animal.staticMethod();
 */

abstract class Motorbike{
    abstract void brake();
}

class SportsBike extends Motorbike{
    public void brake(){
        System.out.println("Sportsbike Brake");
    }

}

class MountainBike extends Motorbike{
    public void brake(){
        System.out.println("Mountainbike Brake");
    }
}

class Main03{
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}