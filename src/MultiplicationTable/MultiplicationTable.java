package MultiplicationTable;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int x;
        Scanner newObj = new Scanner(System.in);
        x = newObj.nextInt();
        for(int i = 0 ; i <= x ; i ++){
            System.out.println();
            for(int j = 0; j <= x; j++){
                System.out.print(i*j + " ");
            }
        }
    }
}
