package ForLoop;

public class IsPrime {

    public static void main(String[] args) {

        int n = 190;
       // int count = 0;
        boolean isPrime = true;


        for (int i = 2; i <n ; i++){
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Is Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
