import java.util.Scanner;

public class JavaBasicPractice {

    static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("Square: " + square(number));

        System.out.println("Counting:");

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        input.close();
    }
}