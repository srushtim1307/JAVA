import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("How many elements?");
        int n = sc.nextInt();

        for(int i = 0 ;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("List: " +list);
        System.out.println("List size: " +list.size());
        System.out.println("First index: " +list.get(0));
        System.out.println("Last Index: " +list.get(list.size()-1));
    }
}
