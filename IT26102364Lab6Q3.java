import java.util.Scanner;

public class IT26102364Lab6Q3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {

            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }


            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }


            sumSquares = sumSquares + (number * number);


            count++;
        }



        double meanSquare = sumSquares / count;
        double rms = Math.sqrt(meanSquare);

        System.out.println("\nThe Root Mean Square (RMS) is: " + rms);




    }
}
