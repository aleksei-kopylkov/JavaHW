import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HW4 {
    public static void main(String[] args) {
       System.out.println(waysCounter(2, 11));
    }

    public static int waysCounter(Integer a, Integer b) {
        int result = 1;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = a; i <= b; i++) {
            if (i == a) {
                map.put(i, result);
            } else if(i % 2 != 0) {
                map.put(i, result);
            } else if(i % 2 == 0) {
                if (map.containsKey(i / 2)) {
                    result += map.get(i / 2);
                    map.put(i, result);
                }
            }
        }
        System.out.println(map);
        return result;
    }

}
