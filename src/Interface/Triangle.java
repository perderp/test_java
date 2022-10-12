package Interface;
import java.lang.Math;

interface Polygon03{
    void getArea();

    default void getPerimeter(int ...sides){
        int perimeter = 0;
        for(int side: sides){
            perimeter += side;
        }

        System.out.println("Perimeter : " + perimeter);
    }
}

class Triangle implements Polygon03{
    private int a, b, c;
    private double s, area;
    //Initializing sides of the triangle
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    //Calculate the area of a triangle
    public void getArea(){
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area : " + area);
    }
}

class  Main03{
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);
        t1.getArea();
        t1.getPerimeter(2, 3, 4);
    }
}
/*
    In the above program, we have created an interface named Polygon. It includes a default method getPerimeter() and an abstract method getArea().
    We can calculate the perimeter of all polygons in the same manner so we implemented the body of getPerimeter() in Polygon.
    Now, all polygons that implement Polygon can use getPerimeter() to calculate perimeter.
    However, the rule for calculating the area is different for different polygons. Hence, getArea() is included without implementation.
    Any class that implements Polygon must provide an implementation of getArea().
 */
