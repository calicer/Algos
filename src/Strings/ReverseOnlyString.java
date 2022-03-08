package Strings;

public class ReverseOnlyString {

    public static void main(String[] args) {
        String a = "Vishal";
        String rev = "";

        for (int i = a.length()-1; i>=0; i--){
            char x = a.charAt(i);
            String v = Character.toString(x);
           // System.out.println(v);
            rev = rev.concat(v);
        }
        System.out.println(rev);
    }
}
