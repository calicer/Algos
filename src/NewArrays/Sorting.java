package NewArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        String[] arr = {"ABC", "C", "X", "A", "B", "AB", "WXYZ", "QWE"};


        List<String> s = Arrays.asList(arr).stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo).reversed()).collect(Collectors.toList());


        Integer[] arr1 = {1,1,4,46,7,3,4,2,22,11};

        List<Integer> list = Arrays.asList(arr1).stream().sorted().collect(Collectors.toList());

        System.out.println(list);

        System.out.println(s);
    }
}
