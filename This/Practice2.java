class BankAccount{
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(int amount){
        this.balance = this.balance + amount;
    }
    void display(){
        System.out.println(this.owner);
        System.out.println(this.balance);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Srushti", 7000);
        b1.deposit(1000);
        b1.display();
    }
}
