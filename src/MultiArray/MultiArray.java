package MultiArray;

public class MultiArray {
    int[][] data = new int[3][4];
    /*
              |   Col 1    |   Col 2    |   Col 3    |    Col 4   |
        Row 1 | data[0][0] | data[0][1] | data[0][2] | data[0][3] |
        Row 2 | data[1][0] | data[1][1] | data[1][2] | data[1][3] |
        Row 3 | data[2][0] | data[2][1] | data[2][2] | data[2][3] |
     */



    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
                {10, 11}
        };
        System.out.println("Length of row : " + a.length);

        for(int i = 0 ; i < a.length ; i++){
            System.out.println("i : " + i);
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.println("Array ["+ i  + "][" + j + "] : " + a[i][j]);
            }
        }

        int[][][] b = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };


        for(int i = 0 ; i < b.length ; i++){
            System.out.println( "1d array :  " + b[i].length);
            for(int j = 0 ; j < b[i].length ; j++){
                System.out.println( "2d array : " + b[i][j].length);
                for(int x = 0; x < b[i][j].length ; x++){
                    System.out.println( " 3d array :  " + b[i][j][x]);
                }
            }
        }
    }



}
