import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

class Palindrome {
    static boolean isPalindrome(String p){
        int start = 0;
        int end = p.length()-1;
        while(start<end){
            if (p.charAt(start)!=p.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String p = sc.next();
        if (isPalindrome(p)==true) {
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }

    }
}
