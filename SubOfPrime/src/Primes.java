import java.math.BigInteger;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {

        BigInteger sum = new BigInteger("0");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int limit = scan.nextInt();

        for(int i = 0; i < limit; i++){
            if (isPrime(i)){

                sum = sum.add(new BigInteger(String.valueOf(i)));
            }
        }
        System.out.println("Your sum of all primes below " + limit +  " is: " + sum);
    }
    public static boolean isPrime(int num){
        if(num == 1 || num == 0){
            return false;
        }
        for(int i = 2; i <= Math.floor(Math.sqrt(num)); i++){
            if (num % i == 0){
             return false;
            }
    }
    return true;
    }
}
