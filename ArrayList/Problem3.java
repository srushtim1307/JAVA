import java.util.ArrayList;
public class Problem3 {
    public static boolean isPalindrome(ArrayList<Integer> list){
        int left = 0;
        int right = list.size() - 1;
        while(left<right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); 
        list1.add(2); 
        list1.add(3); 
        list1.add(2); 
        list1.add(1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println("List1 Palindrome: " +isPalindrome(list1));
        System.out.println("List2 Palindrome: " +isPalindrome(list2));
    }
    
}
