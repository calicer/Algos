package NewArrays;

import java.util.Arrays;

public class SortStringArrya {

    public static void main(String[] args) {

        String[] arr = {"a","v", "n","d", "t"};

        for (int i = 0; i< arr.length-1; i++){
            if(arr[i].compareTo(arr[i+1])<0){
                String temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
