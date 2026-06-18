import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
       
        list.addAll(Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5));
        System.out.println("Original List: " + list);

        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("Final List (No Duplicates): " + list);
    }
}
