package Arrays;

public class FindIndexOf {

    public static void main(String[] args) {

        int[] arr = {1,3,5,3,6,7,2,1};
        int n = 1;
        System.out.println(indexOf(arr, n));

        System.out.println(lasIndexOf(arr, n));

    }


    public static int indexOf(int[] arr, int n){
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static int lasIndexOf(int[] arr, int n){
        int index = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == n){
                index = i;
            }
        }
        return index;
    }
}
