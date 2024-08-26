import java.util.Scanner;

public class AvgCal{
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        // take any five integers as inputs

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Enter the fifth number: ");
        int num5 = scanner.nextInt();

        // calculate the average of these five numbers

        int avg = (num1 + num2 + num3 + num4 + num5)/5;

        // display the results

        System.out.println(" the average of " + num1 + ", " + num2 + ", " + num3 + "," + num4 + ", " + num5 + " = " + avg);

        scanner.close();

    }
}