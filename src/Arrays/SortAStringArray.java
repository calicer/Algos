package Arrays;

import java.util.Arrays;

public class SortAStringArray {

    public static void main(String[] args) {
        String[] arr = {"v","z","s","e","g","a","b"};

        String [] arr2 = new String[arr.length];

        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                if (arr[i].compareTo(arr[j]) < 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
