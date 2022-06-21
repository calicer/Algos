package NewArrays;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public static void main(String[] args) {
        int arr[] = {10, 9, 14, 23, 15, 0, 9};

        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            boolean flag = false;
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){
                    flag = true;
                } else{
                    flag = false;
                    break;
                }
            }
            if (flag){
                li.add(arr[i]);
            }

        }
        System.out.println(li);
    }
}
