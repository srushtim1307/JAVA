import java.util.ArrayList;

public class Problem1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(67);
        list.add(45);
        list.add(89);
        list.add(12);
        list.add(55);
        System.out.println("Elements greater than 50: ");
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>50){
                System.out.println(list.get(i)+" ");
            }
        }
    }
}
