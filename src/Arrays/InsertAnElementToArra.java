package Arrays;

import java.util.Arrays;

public class InsertAnElementToArra {


    public static void main(String[] args) {

        int[] arr = {1,3,5,3,6,7,2,1};
        int[] newAr = new int[arr.length+1];
        int n = 1;
        int num = 11;

        for (int i = 0; i<newAr.length; i++){
            if (i < n){
              newAr[i] = arr[i];
            } else if (i == n){
                newAr[i] = num;
            } else if ( i > n){
                newAr[i] = arr[i-1];
            }
        }

        System.out.println(Arrays.toString(newAr));


    }
}
