class Even implements Runnable{
    int limit;
    public Even(int limit){
        this.limit = limit;
    }
    public void run(){
        for(int i = 0 ; i <= limit;i++){
            if(i % 2 == 0){
                System.out.println("Even number: " + i );
            }
        }
    }
}
class Odd implements Runnable{
    int limit;
    public Odd(int limit){
        this.limit = limit;
    }
    public void run(){
        for(int i = 0 ; i <= limit;i++){
            if(i % 2 != 0){
                System.out.println("Odd number: " + i );
            }
        }
    }
}




public class p17 {
    public static void main(String[] args) {
        Runnable evenTask = new Even(20);
        Runnable oddTask = new Odd(20);

        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        evenThread.start();
        oddThread.start();
    }
    
}
