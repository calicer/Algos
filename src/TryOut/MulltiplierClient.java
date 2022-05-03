package TryOut;

import java.util.Arrays;
import java.util.List;

public class MulltiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println("Result is : " + multiplier.multiply(list));
        System.out.println(multiplier.size(list));
        System.out.println(Multiplier.isEmpty(list));
    }
}
