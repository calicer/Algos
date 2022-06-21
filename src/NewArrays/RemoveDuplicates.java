package NewArrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int[] temp = new int[arr.length];

//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i< arr.length; i++){
//            set.add(arr[i]);
//        }
//        System.out.println(set);
//
//        List<Integer> li = new ArrayList(Arrays.asList(arr));
//        li.stream().distinct().collect(Collectors.toList());
        int j = 0;
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
