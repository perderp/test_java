public class Main {
    public  int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    protected static int factorial(int a) {
        if(a == 1 || a == 0) return 1;
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 25;

        Main obj = new Main();

        int result = obj.addNumbers(num1 , num2);
        System.out.println("SUM : " + result);

        int x = 5;
        // to access a method without using an object or obj. Use static keyword
        System.out.println("factorial : " + obj.factorial(x));
    }
}