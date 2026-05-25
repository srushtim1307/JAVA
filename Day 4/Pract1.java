import java.util.Scanner;

class Pract1 {

    static int sumofnum(int n){
        int sum=0;
        for(int i = 1; i<=n; i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The sum is : " +(sumofnum(n)));
    }
}
