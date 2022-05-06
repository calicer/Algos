package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr = {1,3,5,3,6,7,2,1,21};
        int[] arr2 = {12,5,7,70,11};

        Set<Integer> li = new HashSet<>();


        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if (arr[i] == arr2[j]){
                    li.add(arr[i]);
                }
            }
        }

        System.out.println(li);
    }
}
