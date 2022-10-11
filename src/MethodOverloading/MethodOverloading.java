package MethodOverloading;

public class MethodOverloading {
    private static void display(int a ){
        System.out.println("Arguments of a : " + a);
    }
    private static void display(int a, int b){
        System.out.println("Arguments of a " + a + " and b " + b);
    }

    private String formatNumber (int value) {
        return String.format("%d", value);
    }
    private String formatNumber (double value){
        return String.format("%.3f", value);
    }
    private String formatNumber (String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    /*
    !! IMPORTANT POINTS !!
    *Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
    *Method overloading is achieved by either:
        -changing the number of arguments.
        -or changing the data type of arguments.
    *It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
     */

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.formatNumber(250));
        System.out.println(obj.formatNumber(90.993));
        System.out.println(obj.formatNumber("520"));
        display(1);
        display(1, 2);
    }
}
