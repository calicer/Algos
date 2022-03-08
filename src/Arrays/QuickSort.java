package Arrays;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {65,33,2,32,13,4,1,0};

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] =temp;
                i = -1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
