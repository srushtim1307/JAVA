import java.util.Scanner;

class StringReverse {
    static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("Length = " + s.length());


        System.out.print("Reversed string: " +(reverse(s)));
    }
    
}
