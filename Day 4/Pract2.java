import java.util.Scanner;

class Pract2 {

    static void Palindrome(int n){
        int original = n;
        int rev=0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        if (original==rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Palindrome(n);
    }
    
}
