package ForLoop;

public class SeriesSum {

    public static void main(String[] args) {
        int n = 6;
        float res = 0.0f;

        for (float i = 1; i <= n ; i++){
            res+= 1/i;
        }
        System.out.println(res);
    }
}
