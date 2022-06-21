package NewArrays;

public class SecondMax {

    public static void main(String[] args) {
        int[] arr = {1,2,3,12,11,10,9,4,6,7,8};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++){
            if (arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            if(max2 < arr[i] && max1 > arr[i]){
                max2 = arr[i];
            }
        }

        System.out.println(max2);
    }
}
