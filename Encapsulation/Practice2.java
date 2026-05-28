class BankAccount{
    private int balance;

    void deposit(int amount){
        if(amount>0){
            balance += amount;
        }
    }
    void withdraw(int amount){
        if(amount<=balance){
            balance -= amount;
        }
    }
    int getBalance(){
        return balance;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        System.out.println(b1.getBalance());
    }
}
