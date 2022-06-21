package NewArrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayZero {
    public static void main(String[] args) {
        int[] arr =  { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };

        List<Integer> list = new ArrayList<>();
        for (int i =0; i< arr.length; i++){
            int sum = 0;
            list.removeAll(list);
            for(int j = i; j< arr.length; j++){
                sum+=arr[j];
                list.add(arr[j]);
                if (sum == 0){
                    System.out.println(list);
                }
            }
        }
    }
}
