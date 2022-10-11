public class Rectangle {
    private int length;
    private int width;

    public static int getArea(int length, int width){
        return length * width;
    }

    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(getArea(5, 5));
        // Accessing Main Class
        System.out.println(obj.factorial(5));
    }
}
