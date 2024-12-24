abstract class Shape {
    public abstract void CalculateArea();
}

abstract class TwoDim extends Shape{}
abstract class ThreeDim extends Shape{}
class Square extends TwoDim{
    float side;
    public Square(float side){
        this.side = side;
    }
    public void CalculateArea(){
        System.out.println("Area of the square is " + (side*side));
    }
}
class Triangle extends TwoDim{
    float base , height;
    public Triangle(float base,float height){
        this.base = base;
        this.height = height;
    }
    public void CalculateArea(){
        System.out.println("Area of the triangle is " + (0.5 * base * height));
    }
}
class Sphere extends ThreeDim{
    float radius;
    public Sphere(int radius){
        this.radius = radius;
    }
    public void CalculateArea(){
        System.out.println("Area of the sphere is : " + (4 * Math.PI * radius * radius));

    }
}
class Cube extends ThreeDim {
    int side;
    public Cube(int side){
        this.side=side;
    }
    public void CalculateArea(){
        System.out.println("Area of the cube is : " + (6 * side * side));
    }
}
public class p15 {
    public static void main(String[] args) {
        Square square = new Square(5);
    Triangle triangle = new Triangle(2,3);
    Sphere sphere = new Sphere(4);
    Cube cube = new Cube(2);

    square.CalculateArea();
    triangle.CalculateArea();
    sphere.CalculateArea();
    cube.CalculateArea();
        
    }
    

    
}
