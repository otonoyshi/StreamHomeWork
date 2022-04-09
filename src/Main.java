import java.util.*;

public class Main {
    public static void main (String[] args){
        List<Integer> intlist = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int num : intlist){
            if (num > 0 && num % 2 == 0) {
                newList.add(num);
            }
        }
        Collections.sort(newList);
        for (int num : newList) {
            System.out.println(num);
        }
    }
}
