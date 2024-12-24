import java.util.Scanner;
import java.lang.Math;
class p2 {
    public static void main(String args[]) {
        double area ,s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle : ");
        double a = sc.nextDouble();

        System.out.println("Enter the second side of the Triangle : ");
        double b = sc.nextDouble();

        System.out.println("Enter the third side of the triangle ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            if(a == b  && b == c){
                System.out.println("Equilateral ");
            }else if ((a == b) || (a == c) || (b == c)){
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
            s = (a + b + c) / 2;
            area = Math.sqrt((s * (s-a) * (s-b) * (s-c)));
            System.out.println("The area of the traingle is : " + area);


        }else {
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
    
}