package Strings;

public class FirstNonRepeated {

    public static void main(String[] args) {

        String a = "abcdabcdeabcd";
        char c ;
        boolean flag = false;

        for(char x : a.toCharArray()){
            if (a.indexOf(x) == a.lastIndexOf(x)){
                System.out.println(x);
            }
        }

    }
}
