

public class p13 {
    static int count = 0;
    public p13(){
        count++;
    }
    public void display_count(){
        System.out.println("The total objects created are : " + count);
    }
    public static void main(String[] args) {
        p13 obj1 = new p13();
        p13 obj2 = new p13();
        p13 obj3 = new p13();
        
        obj3.display_count();

    }
}
