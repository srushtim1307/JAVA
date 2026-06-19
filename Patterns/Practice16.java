/* A
   BB
   CCC
   DDDD */

import java.util.Scanner;
public class Practice16 {

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            char ch = (char)('A'+ i) ;
            //number
            for(int j = 0; j<=i; j++){
                System.out.print(ch + " ");
            }
        System.out.println();
    }
    }
}
