package NewArrays;

import java.util.Arrays;

public class InsertAt {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int[] arr1 = new int[arr.length+1];

        int num = 5;
        int i = 4;

        for (int j = 0; j<arr.length; j++){
            if (j<i){
                arr1[j] = arr[j];
            }
            if (j == i){
                int temp = arr[j];
                arr1[j] = num;
            }
            if (j>i){
                arr1[j] = arr[j-1];
            }

        }
        System.out.println(Arrays.toString(arr1));
    }
}
