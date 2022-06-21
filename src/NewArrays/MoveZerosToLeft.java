package NewArrays;

import java.util.Arrays;

public class MoveZerosToLeft {

    public static void main(String[] args) {
        int[] array_nums = {0,0,1,0,3,0,5,0,6};

        int i = 0;

        for(int j =0; j< array_nums.length; j++){
            if (array_nums[i] != 0){
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
            } else{
                i++;
            }
        }

        System.out.println(Arrays.toString(array_nums));
    }
}
