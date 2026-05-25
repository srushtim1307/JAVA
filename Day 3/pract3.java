import java.util.Scanner;

class pract3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int n = sc.nextInt();

        if (n<=1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i<n/2; i++){
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}

