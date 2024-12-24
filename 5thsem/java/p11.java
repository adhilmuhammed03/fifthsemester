import java.util.*;
class Student {
    String regno , name;
    public  void read(Scanner sc){
        System.out.println("Enter the regno of the student : ");
        regno = sc.next();
        System.out.println("Enter the name of the student");
        name = sc.next();
    
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Regno : " + regno);
    }
}

class Mark extends Student{
    float m1 , m2 , m3 , m4 , m5,sum , avg;
    public void read_marks(Scanner sc){
        super.read(sc);
        System.out.println("Enter the mark of first subject : ");
        m1 = sc.nextFloat();
        System.out.println("Enter the mark of second subject : ");
        m2 = sc.nextFloat();
        System.out.println("Enter the mark of third subject : ");
        m3 = sc.nextFloat();
        System.out.println("Enter the mark of fourth subject : ");
        m4 = sc.nextFloat();
        System.out.println("Enter the mark of fifth subject : ");
        m5 = sc.nextFloat();
        sum = m1 + m2 + m3 + m4 + m5;
        avg = sum / 5;

    }
    public void result(){
        System.out.println("The result of given student ");
        super.display();
        System.out.println("Subject 1 : " + m1);
        System.out.println("Subject 2 : " + m2);
        System.out.println("Subject 3 : " + m3);
        System.out.println("Subject 4 : " + m4);
        System.out.println("Subject 5 : " + m5);
        System.out.println("Total : " + sum);
        System.out.println("Average : " + avg);
    }
}


class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mark obj = new Mark();
        obj.read_marks(sc);
        obj.result();
        sc.close();
    }

}