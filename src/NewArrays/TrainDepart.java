package NewArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainDepart {

    public static void main(String[] args) {

        int[] arr = {1,4,6,3,8,3};
        int[] arr1 = {22,12,11,10,9,8};

        boolean[] visited = new boolean[arr.length];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i< arr.length; i++){
            int min = Integer.MAX_VALUE;
            int indexVisited = 0;
            for(int j = 0; j< arr.length; j++){
                List<Integer> li = new ArrayList<>();
                if(arr1[j]-arr[i] < min && !visited[j]){
                    min = arr1[j] - arr[i];
                    li.add(arr[i]);
                    li.add(arr1[j]);
                    map.put(i,li);
                    visited[indexVisited] = false;
                    indexVisited = j;
                }
                visited[indexVisited] = true;
            }

        }
        System.out.println(map);

    }
}
