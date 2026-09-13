import java.util.Scanner;

public class IT26102364Lab6Q1{
  public static void main (String[]args){
 
        double number,square,squareRoot;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        square = number *number;
        squareRoot = Math.sqrt(number);

        System.out.println("The square of " + number + " is :" + square);
        System.out.println("The square root of " + number + " is :" + squareRoot);


    }
}


  
  
  
  