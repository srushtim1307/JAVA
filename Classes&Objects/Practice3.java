class BankAccount{
    String name;
    int balance;

    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        balance = balance - amount;
    }

    void display(){
        System.out.println(name);
        System.out.println(balance);
    }
}

public class Practice3 {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.name = "Srushti";
        b1.balance = 7000;

        b1.deposit(1000);
        b1.withdraw(2000);
        b1.display();
    }
    
}
