import java.util.ArrayList;

public class Problem2 {

    public static int findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 0 ; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(4);

        System.out.println("Max = " +findMax(list));
    }
}

