package MethodOverriding;

public class Animal {
    protected String type = "Animal";
    protected void displayInfo(){
        System.out.println("I am an Animal");
    }
    Animal(){
        System.out.println("I am an Animal");
    }

    Animal(String type){
        System.out.println("Type : " + type);
    }
}
