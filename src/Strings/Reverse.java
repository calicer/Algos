package Strings;

public class Reverse {

    public static void main(String[] args) {
        String s = "The sky is blue";

        String[]arr = s.split(" ");
        String rev = "";

        for (int i = arr.length-1; i>=0; i--){
            rev = rev + arr[i] + " ";
        }

        System.out.println(rev);
    }
}
