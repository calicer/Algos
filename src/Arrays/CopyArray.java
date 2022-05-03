package Arrays;

import java.util.Arrays;

public class CopyArray {


    public static void main(String[] args) {

        int[] arr = {1,3,5,3,6,7,2,1};
        int n = 1;

        int[] tempArr = new int[arr.length];
        for (int i =0; i<arr.length; i++){
            tempArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(tempArr));

    }
}
