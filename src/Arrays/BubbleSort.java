package Arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int []a = {1,2,4,73,3,12,54};

        int n = a.length;

        for (int i = 0; i <a.length; i++){
            for (int j = 0; j<a.length;j++){
                if (a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
