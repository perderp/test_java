package Encapsulation;

/*
    Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.
    It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.
 */

class Area{
    // fields to calculate the area
    int length;
    int breadth;

    // constructor to initialize the value
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea(){
        int area = length * breadth;
        System.out.println("Area : " + area);
    }


}

class Main {
    public static void main(String[] args) {
        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
}

/*
    In the above example, we have created a class named Area. The main purpose of this class is to calculate the area.
    To calculate an area, we need two variables: length and breadth and a method: getArea(). Hence, we bundled these fields and methods inside a single class.
    Here, the fields and methods can be accessed from other classes as well. Hence, this is not data hiding.
    This is only encapsulation. We are just keeping similar codes together.

    Note: People often consider encapsulation as data hiding, but that's not entirely true.
    Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding. Encapsulation in itself is not data hiding.
 */