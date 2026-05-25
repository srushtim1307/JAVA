import java.util.Scanner;

class Pract2 {

    static boolean Sorted(int[] arr){
        for(int i = 0 ; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
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
    if (Sorted(arr)) {
        System.out.println("Sorted");
    }
    else{
        System.out.println("Not Sorted");
    }
    }
}
