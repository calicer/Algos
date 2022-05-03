package Arrays;

public class SecondMaxWithoutSorting {

    public static void main(String[] args) {

        int [] arr = {2,5,7,2,2,6,7,2,22,11,554,754,22,11};

        int max1,max2;
        max1 = max2 = 0;

        for (int i = 0; i<arr.length; i++){
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            }
            if (max2 < arr[i] && max1 > arr[i]){
                max2 = arr[i];
            }
        }

        System.out.println(max2);
    }
}
