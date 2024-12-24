import java.util.Scanner;

interface volume {
    double pi = Math.PI;
    public void readdata(Scanner sc);
    public void dispvolume();
    
}
class Sphere implements volume{
    double radius, volume;
    public void readdata(Scanner sc){
        System.out.println("Enter the radius of Sphere");
        radius = sc.nextDouble();

    }
    public void dispvolume(){
        volume = (4/3) * pi * (radius * radius * radius);
        System.out.println("Volume of sphere is :  " + volume);
    }
}
class Cylinder implements volume{
    double radius , height , volume;
    public void readdata(Scanner sc){
        System.out.println("Enter the radius : ");
        radius = sc.nextDouble();
        System.out.println("Enter the height : ");
        height = sc.nextDouble();
    }
    public void dispvolume(){
        volume = pi * (radius * radius) * height;
        System.out.println("Volume of cylinder is : " + volume );
    }
}



public class p16 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();
        Scanner sc = new Scanner(System.in);
        sphere.readdata(sc);
        sphere.dispvolume();
        cylinder.readdata(sc);
        cylinder.dispvolume();
        sc.close();
    }
    
}
