package JavaArray;

public class JavaArray {

    //MEAN
    static double mean(int[] x){
        double sum = 0;
        for(int i = 0; i < x.length ; i++){
            sum += x[i];
        }
        return sum/x.length;
    }

    // ASCENDING
    static int[] ascending (int[] x ){
        for(int i = 0 ; i < x.length ; i++){
            for(int j = i + 1 ; j < x.length ; j++){
                if(x[i] < x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        return x;
    }
    //MEDIAN
    static double median(int[] x ){
        if(x.length%2 == 0)
            return (x[(x.length /2 ) - 1] + x[x.length/2])/2;
        else
            return x[(x.length - 1)/2];
    }
    //MODE
    static int mode(int[] x ){

        int max = 0;
        int count = 0;
        int[] obj = new int[x.length - 1];

        for(int i = 0 ; i < x.length ; i++){
            int item = x[i];
            if(obj[item] != 0){
                obj[item]++;
            }else{
                obj[item] = 1;
            }

            if(count < obj[item]){
                count = obj[item];
                max = item;
            }
        }

        return max;
    }

    static double binarySearch(int [] array, int target) {
        int left = 0, right = array.length -1;
        while(left <= right){
            double middle = Math.floor(left + right) / 2;
            if(array[(int) middle] > target){
                right -= 1;
            }else if(array[(int) middle] < target){
                left += 1;
            }else{
                return middle;
            }
        }

        return -1;
    }


}


