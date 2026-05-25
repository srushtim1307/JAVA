import java.util.Scanner;

public class reverse {
    static String reverse(String s){
        if (s.length()==0) { 
        return "";    
    }
    return reverse(s.substring(1)) + s.charAt(0);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();

        System.out.print("The reverse of the String is : " +reverse(s));
    }
}
