package Interface;

/*
    An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
 */

//interface Language{
//    // Language is an interface and it includes abstract methods below (getType, getVersion)
//    public void getType();
//
//    public void getVersion();
//}


interface Polygon{
    void getArea();

    default void getSides(){
        System.out.println("I can get the sides of the polygon");
    }
}

class Rectangle implements Polygon{
    public void getArea(){
        int length = 5;
        int breadth = 6;
        int area = length * breadth;
        System.out.println("The area of the rectangle is : " + area );
    }
}

class Square implements Polygon{
    public void getArea(){
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is : " + area);
    }
}

class Main{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea();

        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}