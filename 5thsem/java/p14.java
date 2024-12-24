public class p14 {
    public static void volume(int a ){
        System.err.println("The volume of the cube is :  " + (a*a*a));
    }
    public static void volume(int w , int h , int l){
        System.out.println("The volume of recatngular box is : " + (w*h*l));
    }
    public static void volume(float r , float h){
        System.out.println("The volume of cylinder is :  " + (3.14 * r * r * h));

    }
    public static void main(String[] args) {
        volume(5);
        volume(1,2);
        volume(1,2,3);
    }
}
