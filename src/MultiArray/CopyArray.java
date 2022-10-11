package MultiArray;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] positiveNumbers = numbers; // Copy Array;

//        for(int i = 0; i < positiveNumbers.length ; i++) {
//            System.out.print( positiveNumbers[i] + ", ");
//        }
//
//        for(int i : positiveNumbers){
//            System.out.print(i + " ");
//        }



    /*
              |   Col 1    |   Col 2    |   Col 3    |    Col 4   |
        Row 1 | data[0][0] | data[0][1] | data[0][2] | data[0][3] |
        Row 2 | data[1][0] | data[1][1] | data[1][2] | data[1][3] |
        Row 3 | data[2][0] | data[2][1] | data[2][2] | data[2][3] |
     */
        int [][] source = {
                {1, 2, 3, 4,},
                {5, 6, 7 ,8},

        };
        int [][] destination = new int[source.length][];

        for(int i = 0 ; i < destination.length ; i++){
            destination[i] = new int[source[i].length];
            for(int j = 0 ; j < destination[i].length ; j ++){
                destination[i][j] = source[i][j];
            }
        }

//        System.out.print(Arrays.deepToString(destination));


        int[][] data = {
                {1, 2, 3, 4,},
                {5, 6},
                {11 , 12 , 13}
        };

        int [][] newData = new int[data.length][];

        for(int i = 0; i < data.length; i++){
            newData[i] = new int[data[i].length];
            System.arraycopy(data[i], 0, newData[i], 0, newData[i].length);
        }

        System.out.println(Arrays.deepToString(newData));


    }
}
