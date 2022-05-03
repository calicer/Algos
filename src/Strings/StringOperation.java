package Strings;

import java.util.*;

public class StringOperation {
    
    public static String operation(String input){

        String str = "";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<input.length(); i++){
            if (map.containsKey(input.charAt(i))){
                int count = map.get(input.charAt(i));
                count = count+1;
                map.put(input.charAt(i), count++);
            } else if(!map.containsKey(input.charAt(i))){
                int count = 1;
                map.put(input.charAt(i),count);
            }
        }

        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> characterIntegerEntry, Map.Entry<Character, Integer> t1) {
                return t1.getValue().compareTo(characterIntegerEntry.getValue());
            }
        });

        for (Map.Entry<Character,Integer> entry : list){
            Character c = entry.getKey();
            str = str.concat(c.toString());
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println( operation("thisistest"));
    }
}
