package Misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        Levels l = Levels.INSTANCE;
        System.out.println(l.getValue());
        l.setValue(2);
        System.out.println(l.getValue());

        Map<String, Student> map = new HashMap<>();

        Student s = new Student("Vishal", 3);
        Student s1 = new Student("Aman", 4);
        Student s2 = new Student("Raman", 5);
        Student s3 = new Student("Daman", 1);
        Student s4 = new Student("Savan", 2);

        map.put("Vishal", s);
        map.put("Aman", s1);
        map.put("Raman", s2);
        map.put("Daman", s3);
        map.put("Savan", s4);



       List<String> slist =  map.entrySet().stream().filter(entry -> entry.getValue().getRollNo()>3).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(slist);
    }



}
