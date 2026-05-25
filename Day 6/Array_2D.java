import java.util.Scanner;

class Array_2D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        
        System.out.println("Enter the elements of the 2D array : ");
        for(int i = 0 ; i<r; i++){
            for(int j = 0; j<c; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
        for(int i = 0 ; i<r; i++){
            for(int j = 0 ; j<c; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

     
}