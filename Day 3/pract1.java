import java.util.Scanner;

class pract1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int even = 2;
        for(int i = 0 ; i<n ; i++){
            System.out.print(" " +even);
            even=even+2;
        }
    }
}