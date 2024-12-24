import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,reversed=0, sum =0,digit ;
        System.out.println("Enter a number:");
        number = sc.nextInt();
        while(number != 0){
            digit = number % 10 ;
            sum = sum + digit ;
            reversed = reversed * 10 + digit ;
            number /= 10;
        }

        System.out.println("The sum of didgits is " + sum);
        System.out.println("The number reversed is : " + reversed);






        sc.close();
    }
}
