import java.util.Arrays;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a number: ");
        int number = input.nextInt();
        if (number == 1 || number == 2) {
            System.out.println(number + " is not prime");
        }


        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime");
                return;
            }


        }
        System.out.println(number + " is prime");


    }
}