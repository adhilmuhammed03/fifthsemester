import java.util.Scanner;
class hcflcm {
    public static void main(String[] args) {
        int num1 , num2,temp,larger,smaller ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter Second  number : ");
        num2 = sc.nextInt();
        larger = Integer.max(num1, num2);
        smaller = Integer.min(num1,num2);
        while(smaller != 0){
            temp = smaller;
            smaller = larger % smaller;
            larger = temp;
        }
        System.out.println("The hcf of the two numbers is " + larger);
        System.out.println("The lcm of the two numbers is " + (num1*num2) / larger);

        sc.close();
    }
}