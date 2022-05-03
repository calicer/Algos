package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] rev = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            rev[arr.length - i -1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
