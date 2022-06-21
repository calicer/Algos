package NewArrays;

public class MaxProduct {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, -7, 5, 8, -5 };
        int max = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i]*arr[j] > max){
                    max = arr[i]*arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
