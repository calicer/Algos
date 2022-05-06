package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDupsStreams {
    public static void main(String[] args) {

//        int[] arr = {1,1,2,3,4,5,5,6,6,7,7};
//
//
//        List<Integer> list = Arrays.asList(1,1,2,3,4,5,5,6,6,7,7);
//
//        List<Integer> du = list.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(du);


        int[] arr = {1,2,3,4,5};

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer sum = list.stream().reduce(0,(x,y) -> x+y);
        System.out.println(sum);

        int i = list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();

        System.out.println(i);
    }

}
