package FlowControl;
import java.util.Scanner;
public class FlowControl {
    public static void main(String[] args) {
        //If...else
        int number = 10;
        String language = "Java";

        if(language != "Java"){
            System.out.println("Programming Language");
        }else if(language == "Java"){
            System.out.println("Ye");
        }

        if(number < 0){
            System.out.println("Number is less than 10");
        }else{
            System.out.println("Number is greater than 10");
        }

        //Switch Statement
        int number02 = 44;
        String size;

        switch (number02){

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }

        System.out.println("Size : " + size);
        //For Loop
        int number03 = 5;
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0 ; i < number03 ; i++){
            System.out.print( i + " Java is fun  ");
        }
//        for(int i = 0 ; i < vowel.length; i++){
//            System.out.println(vowel[i]);
//        }
        System.out.println();
        //For-each Loop
        int[] numbers = {1, 2, 3, 4, 5};


        for(int num : numbers){
            System.out.print(num + " ");
        }

        for(char item : vowel){
            System.out.print(" " + item );
        }
        System.out.println();
        //While loop
//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//        System.out.print("Enter a number : ");
//        int number04 = input.nextInt();
//        // To cancel it use a negative number
//        while(number04 >= 0){
//            sum += number04;
//
//            System.out.print("Enter a number : " );
//            number04 = input.nextInt();
//        }
//
//        System.out.println("Sum : " + sum);
//        input.close();

        // DO WHILE
        int ix = 1, nx = 5;
        do{
            System.out.print(ix);
            ix++;
        }while(ix <= nx);

        System.out.println();
        //Break Statement
        for(int i = 1 ; i <= 10 ; i++){
            if(i == 5) break;
            System.out.print(i + " ");
        }

        //Continue Statement
        System.out.println();
        for(int i = 1 ; i <= 10; i++){
            if(i > 4 && i < 9) continue;

            System.out.print(i + " ");
        }
    }
}
