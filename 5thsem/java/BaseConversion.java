
// Program to convert the bases of numbers 
import java.util.Scanner;
class BaseConversion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;

        System.out.println("Enter a number : ");
        number = sc.nextInt();
        System.out.println("The number in binary is " + Integer.toBinaryString(number));
        System.out.println("The number in octal is " + Integer.toOctalString(number));
        System.out.println("The number in hexadecimal is " + Integer.toHexString(number));
        sc.close();
    }
}