package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ComparableSudent {

    public static void main(String[] args) {

        Student s = new Student("Vishal",4);
        Student s0 = new Student("Varun",2);
        Student s1 = new Student("Aman",2);
        Student s2 = new Student("Tarun",6);

        List<Student> li = new ArrayList<>();
        li.add(s);
        li.add(s0);

        li.add(s1);
        li.add(s2);

        //Collections.sort(li,(x,y) -> x.getName().compareTo(y.getName()));


        li.sort((x,y) -> x.getName().compareTo(y.getName()));

        for (Student i : li){
            System.out.println(i);
        }

        li.stream().filter(c->c.getName().startsWith("V")).forEach(System.out::println);

    }
}
