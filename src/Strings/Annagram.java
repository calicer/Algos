package Strings;

public class Annagram {

    public static void main(String[] args) {

        String a = "caat";
        String b = "act";
        boolean isAnagram = false;
        boolean isVisited[] = new boolean[b.length()];

        if(a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                isAnagram = false;
                char x = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    if (x == b.charAt(j) && !isVisited[j]) {
                        isVisited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }

        }
        if (isAnagram){
            System.out.println("Anagram");
        } else{
            System.out.println("Not anagram");
        }
    }
}
