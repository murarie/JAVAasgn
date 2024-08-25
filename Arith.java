import java.util.Scanner;
public class Arith{
public static void main(String args [])
 {
  Scanner Scanner = new Scanner(System.in);

  // input 2 nos
  
  System.out.println("Enter the first number: ");
  int num1 = Scanner.nextInt();

  System.out.println("Enter the second number: ");
  int num2 = Scanner.nextInt();

  // perform arithmetic operations

  int sum = num1 + num2;
  int difference = num1 - num2;
  int product = num1*num2;
  int quotient = num1/num2;
  int remainder = num1 % num2;

  // display the results

  System.out.println("sum: " + sum);
  System.out.println("difference: " + difference);
  System.out.println("product: " + product);
  System.out.println("quotient: " + quotient);
  System.out.println("remainder: " + remainder);

  Scanner.close();
  }
}
