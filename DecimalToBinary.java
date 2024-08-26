import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        // take a decimal input

        System.out.println("Enter a decimal number; ");
        int DecimalNo = scanner.nextInt();

        // convert decimal to binary using Integer.toBinaryString() method.

        String binaryString = Integer.toBinaryString(DecimalNo);

        // display the equivalent binary output
        
        System.out.println("the binary equivalent of " + DecimalNo + " is " + binaryString);
        
        scanner.close();



     }
     
}
