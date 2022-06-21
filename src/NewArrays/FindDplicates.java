package NewArrays;

import java.util.HashMap;
import java.util.Map;

public class FindDplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,1,1,3,1,3,2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0; i< arr.length; i++){
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            } else{
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> es: map.entrySet()){
            if(es.getValue() >1){
                System.out.println(es);
            }
        }
    }
}
