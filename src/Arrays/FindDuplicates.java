package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,3,5,3,2,6,7,2,1};

        List li = new ArrayList();

        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    li.add(arr[i]);
                }
            }
        }

        System.out.println(li);
    }
}
