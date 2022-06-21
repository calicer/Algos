package NewArrays;

public class StringReverse {

    public static void main(String[] args) {
        String str = "This is vishal";

        String[] st = str.split(" ");
        String fin ="";

        for (int i =0; i<st.length; i++){
            String s = st[i];
            String[] spli = s.split("");
            String rev = "";
            for (int j = spli.length-1; j>= 0; j--){
                rev += spli[j];
            }
            fin = fin + " " + rev;
        }
        System.out.println(fin);

    }
}
