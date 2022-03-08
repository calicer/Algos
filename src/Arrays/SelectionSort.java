package Arrays;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] a = {2,5,22,644,121,765};

        for (int i = 0; i<a.length-1;i++){
            int minIn = i;
            for (int j = i; j<a.length;j++){
                    if (a[j]<a[minIn]){
                        minIn = j;
                    }
            }
            int temp = a[i];
            a[i] = a[minIn];
            a[minIn] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
