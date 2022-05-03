package Arrays;

import java.util.Arrays;

public class RemoveElement {


    public static void main(String[] args) {

        int[] arr = {1,3,5,3,6,7,2,1};
        int n = 7;

        for (int i = n; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        if (n == arr.length-1){
            arr[n] = -1;
        }

        System.out.println(Arrays.toString(arr));

    }



}
