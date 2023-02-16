//2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
//        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
//        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.


import java.util.Scanner;

public class Question15 {
    public static void user(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter first number: ");
        int secondNumber = scanner.nextInt();

        int squareFirstNumber = firstNumber * firstNumber;
        System.out.println("The square of "  + firstNumber + " is " + squareFirstNumber);
        int squareSecondNumber = secondNumber * secondNumber;
        System.out.println("The squares of " + secondNumber + " is " + squareSecondNumber);

        int differenceSquare = squareFirstNumber - squareSecondNumber;
        System.out.println("The difference of " + squareFirstNumber + " and " + squareSecondNumber + " is " + differenceSquare );

        int sumSquare = squareFirstNumber + squareSecondNumber;
        System.out.println("The sum of " + squareFirstNumber + " and " + squareSecondNumber + " is " + sumSquare );

    }

    public static void main(String[] args) {
        user();
    }


}
