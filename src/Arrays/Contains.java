package Arrays;

public class Contains {

    public static void main(String[] args) {
        int[] arr = {1,3,5,3,6,7,2};
        int n = 7;
        for (int i = 0; i<arr.length; i ++){
            if (arr[i] == n){
                System.out.println("Found");
            }
        }
    }
}
