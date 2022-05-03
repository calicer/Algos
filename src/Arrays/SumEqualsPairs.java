package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumEqualsPairs {

    public static void main(String[] args) {
        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);

        //pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
    }

    public static void pairs_value(int[] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if (arr[i] + arr[j] == sum){
                    map.put(arr[i],arr[j]);
                }
            }
        }

        System.out.println(map);
    }
}
