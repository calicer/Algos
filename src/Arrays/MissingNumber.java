package Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int total_num;
        int[] numbers = new int[]{1,2,3,4,6,7};

        int sum = numbers.length * ((numbers.length+1)  /2);
        System.out.println(sum);
        int arrSum = 0;

        for (int i = 0; i<numbers.length; i ++){
            arrSum = arrSum + numbers[i];
        }

        System.out.println("Missing number is " + (sum - arrSum));

    }
}
