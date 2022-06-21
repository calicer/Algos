package NewArrays;

import java.util.Arrays;

public class AlternativeSort {

    public static void main(String[] args) {

        int[] arr = {10,11,13,12,56,12,443,23,122,100};

        for (int i =0; i< arr.length-1; i++){
            if (arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] temp = new int[arr.length];
        int small = 0;
        int largest = arr.length-1;
        boolean flag = true;

        for (int i =0; i< arr.length; i++){
            if(flag){
                temp[i] = arr[largest];
                largest--;
            } else{
                temp[i] = arr[small];
                small++;
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(temp));
    }
}
