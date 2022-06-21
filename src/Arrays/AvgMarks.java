package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgMarks {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of students");
//        int n = sc.nextInt();
//
//        int[] marks = new int[n];
//        for(int i = 0; i<n; i++){
//            marks[i] = sc.nextInt();
//        }
//
//        int avg = 0;
//        int sum = 0;
//        for (int i = 0; i <n; i++){
//            sum = sum +marks[i];
//        }
//        avg = sum/marks.length;
//        System.out.println("avg = " + avg);

        Map<String, String> map = new HashMap<>();
        map.put("A", "AA");
        map.put("B", "BB");
        map.put("C", "CC");


//        for (Map.Entry<String, String> entry : map.entrySet()){
//            map.put("D", "111");
//        }



       List li =  map.entrySet().stream().filter(entry -> entry.getKey().equals("A")).collect(Collectors.toList());
        System.out.println(li);


    }
}
