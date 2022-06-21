package NewArrays;

public class LargestElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,12,6,7,8,11};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
