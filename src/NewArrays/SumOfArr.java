package NewArrays;

public class SumOfArr {

    public static void main(String[] args) {
        int[] arr = {1,7,4,7,3,3,5,4,88};
    int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }

}
