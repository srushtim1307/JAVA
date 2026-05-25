import java.util.Scanner;

class Even_numbers {
    static int countEven(int[] arr){
        int count=0;
        for(int i = 0 ; i<arr.length; i++){
            if (arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter the elements of array : ");
    for(int i = 0 ; i<n; i++){
        arr[i]=sc.nextInt();
    }
     System.out.print("Even numbers : " +countEven(arr));
    }
    
}
