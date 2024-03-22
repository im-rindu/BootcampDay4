import java.util.*;

public class Odd {
    public static List<Integer> oddRemover(int[] allNumber){
        List<Integer> evenNumberOnly = new ArrayList<Integer>();

        for (int even : allNumber) {
            if(even%2==0){
                evenNumberOnly.add(even);
            }
        }
        return evenNumberOnly; 
    }

    public static void main(String[] args) {
        List<Integer> evenNumberOnly = new ArrayList<Integer>();
        int[] allNumber = {1,2,3,4,5,6,7,8,9,10};
        evenNumberOnly = oddRemover(allNumber);
        
        System.out.println(evenNumberOnly);
        
    }
}
