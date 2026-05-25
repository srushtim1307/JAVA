import java.util.Scanner;

class Search {
    static boolean search(int[][] mat, int key){
        for(int i =0 ; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if (mat[i][j]==key) {
                    return true;
                }
            }
        }
        return false;
    }

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

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        if (search(mat, key)==true) {
            System.out.println("The elements are found");
            
        }
        else{
            System.out.println("Not found");
        }
    }
}
