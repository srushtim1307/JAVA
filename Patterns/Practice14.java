/* A
   AB
   ABC
   ABCD
   ABCDE */

import java.util.Scanner;
public class Practice14 {

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            //number
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch +" ");
            }
        System.out.println();
    }
    }
    
}
