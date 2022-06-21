package NewArrays;

public class IndexOfWhile {

    public static void main(String[] args) {
        int[] arr = {1,7,4,7,3,3,5,4,88};

        int i = 5;
        boolean flag = true;
        int j = 0;
        while(flag){

            if (arr[j] == i){
                System.out.println(arr[j]);
                System.out.println(j);
                break;
            }
             j++;
        }
    }
}
