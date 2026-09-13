import java.util.Scanner;

public class IT26102364Lab6Q2C{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average;

        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1)  + ": ");
            numbers[i] = input.nextInt();
        }


        System.out.println("\nThe numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
            sum = sum + numbers[i];

        }



        average = sum/10.0;

        System.out.println("\n");

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);



    }
}