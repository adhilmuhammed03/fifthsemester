import java.util.Scanner;
class Complex{
    int real , imaginary;
    public void read(Scanner sc){
        System.out.println("Enter the real part :  ");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part :  ");
        imaginary = sc.nextInt();
    }
    public void add(Complex c1,Complex c2){
        int real_sum = c1.real + c2.real;
        int img_sum = c1.imaginary + c2.imaginary;
        System.out.println("The sum of numbers is " + real_sum + " + " + img_sum + "i");

    }
}

public class p12 {
    int real , imaginary;
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        obj1.read(sc);
        System.out.println("Enter the second number : ");
        obj2.read(sc);
        obj1.add(obj1,obj2);



        sc.close();
        
    }
    
}
