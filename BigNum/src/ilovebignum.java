import java.math.BigInteger;
import java.util.Scanner;

public class ilovebignum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int limit = input.nextInt();
        BigInteger total = new BigInteger("1");
        for(int i=limit; i>0;i--){
            total = total.multiply(new BigInteger(String.valueOf(i)));
        }
        int sum = 0;
        for(int i = 0; i < total.toString().length(); i++) {
            if(Character.isDigit(total.toString().charAt(i))) {
                sum = sum + total.toString().charAt(i) - '0';
            }
        }
        System.out.println("Outputs" + sum);

    }
}
