import java.util.Scanner;

class basic_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s = sc.next();
        sc.nextLine(); 
        System.out.print("Enter a line of String : ");
        String v = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

    }
    
}
