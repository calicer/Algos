package NewArrays;

import java.util.ArrayDeque;

public class ArrayDque {

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for (int i = 0; i< nums.length; i++){
            if (nums[i] == 0){
                ad.addFirst(nums[i]);
            } else{
                ad.addLast(nums[i]);
            }
        }
        System.out.println(ad);
    }
}
