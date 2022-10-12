package Polymorphism;

class Pattern{

    // method w/o parameter
    public void display(){
        for(int i = 0 ; i < 10 ; i ++){
            System.out.print("*");
        }
    }

    // method w/ single parameter
    public void display(char symbol) {
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(symbol);
        }
    }
}

class Main02{
    public static void main(String[] args) {
        Pattern p1 = new Pattern();

        p1.display();
        System.out.println("\n");

        p1.display('$');

    }
}