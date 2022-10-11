package JavaArray;

import java.util.Arrays;

public class JavaArrayTest {
    public static void main (String[] args){
        JavaArray javaTest = new JavaArray();
        int[] array = {1,2,3,10,1,2,10,5,10,3,10,11,3,4,7,4,7,8,8,12,3,2};
        System.out.printf("Mean : %.2f", javaTest.mean(array));
        System.out.println();
        Arrays.sort(array);
        System.out.printf("Meadian : %.2f", javaTest.median(array));
        System.out.println();
        System.out.print("Mode :  "+javaTest.mode(array));
        System.out.println();
        System.out.printf("Binary Search :  %.0f" , javaTest.binarySearch(array, 20));
    }

}
