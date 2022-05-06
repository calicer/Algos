package Strings;

import java.util.HashMap;
import java.util.Map;

public class Frequency {


    public static void main(String[] args) {

        String str = "aaahhcccddaah";
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++){
            int count = 1;
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    //count = count+1;
                    map.put(arr[i], ++count);
                    arr[j] = '0';
                }
            }
        }

        System.out.println(map);
    }
}
