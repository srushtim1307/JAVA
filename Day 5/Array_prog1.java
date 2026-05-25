import java.util.Scanner;

class Array_prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Enter element " +(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
