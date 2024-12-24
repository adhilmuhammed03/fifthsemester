class Account extends Exception{
    float balance;
    public Account(float balance){
        this.balance = balance;
    }
    public void deposit(float amount){
        this.balance += amount;
    }
    public void withdraw(float amount){
        try{
            if(this.balance < amount){
                throw new Exception("MinBalExp"); 
             }else {
                 this.balance -= amount;
             }

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

public class p18 {
    public static void main(String[] args) {
        Account account = new Account(2500);
        account.withdraw(3000);
    }
    
}
