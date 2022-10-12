package Polymorphism;
/*
    Polymorphism is an important concept of object-oriented programming. It simply means more than one form.
    That is, the same entity (method or operator or object) can perform different operations in different scenarios.

    *WHY POLYMORPHISM*

    Polymorphism allows us to create consistent code. In the previous example, we can also create different methods: renderSquare() and renderCircle() to render Square and Circle, respectively.
    This will work perfectly. However, for every shape, we need to create different methods. It will make our code inconsistent.
    To solve this, polymorphism in Java allows us to create a single method render() that will behave differently for different shapes.

    We can achieve polymorphism in Java using the following ways:

    1.) Method Overriding
    2.) Method Overloading
    3.) Operator Overloading
 */
class Polygon {
    public void render(){
        System.out.println("Rendering Polygon...");
    }
}
class Square extends Polygon{
    public void render(){
        System.out.println("Rendering Square...");
    }

}

class Circle extends Polygon{
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class Main {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.render();

        Circle c1 = new Circle();
        c1.render();
    }
}

/*
    In the above example, we have created a superclass: Polygon and two subclasses: Square and Circle. Notice the use of the render() method.
    The main purpose of the render() method is to render the shape. However, the process of rendering a square is different than the process of rendering a circle.
    Hence, the render() method behaves differently in different classes. Or, we can say render() is polymorphic.
 */