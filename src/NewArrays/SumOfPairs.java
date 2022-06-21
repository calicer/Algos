package NewArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfPairs {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, -5, 11, 5, 20};
        int sum = 15;

        Map<Integer, ArrayList<Integer>> map =  new HashMap<>();
        int ref = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == sum){
                    ref = ref+1;
                    List<Integer> li = new ArrayList<Integer>();
                    li.add(arr[i]);
                    li.add(arr[j]);
                    map.put(ref, (ArrayList<Integer>) li);
                }
            }
        }
        System.out.println(map);
    }
}
