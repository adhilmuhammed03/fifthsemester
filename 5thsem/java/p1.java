class p1{
    public static void main(String args[]){
        int n1 = Integer.parseInt(args[0]) , n2 = Integer.parseInt(args[1]);
        int sum = n1 + n2 , difference = n1 - n2 , product = n1 * n2 , quotient = n1/n2,reaminder = n1 % n2;
        System.out.println("Sum of the two number is  : " +sum);
        System.out.println("The difference of the two numbers is : " + difference);
        System.out.println("The product of the two numbers is : " + product);
        System.out.println("The quotient of the two numbers is : "+ quotient);
        System.out.println("The remainder of the two number is  : "+ reaminder);
    }
}