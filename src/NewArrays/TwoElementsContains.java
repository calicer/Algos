package NewArrays;

public class TwoElementsContains {

    public static void main(String[] args) {
        int[] arr = {12,1,1,13,13,15,61,161,22};
        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i <arr.length; i++){
            if (arr[i] == 12){
                flag1 = true;
            }
            if (arr[i] == 161){
                flag2 = true;
            }
        }
        if (flag1 && flag2){
            System.out.println("true");
        }
    }
}
