package NewArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,12,11,10,9,4,6,7,8};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        List<Integer> li = new ArrayList(Arrays.asList(arr));

        List<int[]> list = Arrays.asList(arr);

        for (int i = 0; i<arr.length; i++){
            if (arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            if (min1 < arr[i] && min2 > arr[i]){
                min2 = arr[i];
            }
        }
        System.out.println(min2);
    }
}
