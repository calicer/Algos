package NewArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {122,2,1,9,5,7,33,22};

        List<Integer> li = new ArrayList(Arrays.asList(arr));
        List<Integer> li1 = new ArrayList(Arrays.asList(arr1));

        li.retainAll(li1);
        System.out.println(li);

        for (int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr1.length; j++){
                if (arr[i] == arr1[j]){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}
