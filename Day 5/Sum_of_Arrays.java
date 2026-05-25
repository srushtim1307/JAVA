import java.util.Scanner;

class Sum_of_Arrays {
static int sumArrays(int[] arr){
    int sum=0;
    for(int i = 0 ; i<arr.length; i++){
        sum+=arr[i];
    }
    return sum;
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
    System.out.print("Sum : " +sumArrays(arr));
}
}