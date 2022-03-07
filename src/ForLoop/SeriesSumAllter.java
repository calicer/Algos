package ForLoop;

public class SeriesSumAllter {

    public static void main(String[] args) {

        int n = 8;
        float res = 0;

        for(float i = 1;i <= n; i ++){
            if (i%2 == 0){
                res = res - (1/i);
            } else{
                res = res + (1/i);
            }
        }
        System.out.println(res);
    }
}
