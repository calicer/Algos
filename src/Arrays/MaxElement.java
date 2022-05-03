package Arrays;

public class MaxElement {

    public static void main(String[] args) {
       // int[] arr = {1,3,5,3,6,7,2,1};
        int[] arr = {-11,-3,-5,-3,-6,-7,-2,-1};
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
