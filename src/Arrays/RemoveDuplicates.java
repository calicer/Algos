package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,5,5,6,6,7,7};

        int [] temp = new int[arr.length];

        int j = 0;

        List l = new LinkedList();


        for (int i = 0; i< arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[arr.length-1];


        for(int i = 0; i<j; i++){
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(temp));


    }
}
