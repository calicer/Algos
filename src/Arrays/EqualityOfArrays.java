package Arrays;

public class EqualityOfArrays {

    public static void main(String[] args) {
        int[] array1 =  {2, 5, 7, 9, 11};
        int[] array2 =  {2, 5, 7, 8, 11};
        int[] array3 =  {2, 5, 7, 9, 11};

        equality_checking_two_arrays(array1,  array2);
        equality_checking_two_arrays(array1, array3);
    }

    private static void equality_checking_two_arrays(int[] array1, int[] array2) {
        boolean flag = false;
        if (array1.length != array2.length){
            System.out.println("Not Equal");
        } else {

            for (int i = 0; i<array1.length; i++) {
                if (array1[i] == array2[i]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                System.out.println("Not Equal");
            } else{
                System.out.println("Equal");
            }
        }

    }


}
