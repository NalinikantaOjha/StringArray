import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateElements {
    public static void main(String[] args) {

        int A[][] = {{11, 22, 33}, {10, 11, 30}, {40, 50, 11}};


        int grather = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                if (hashMap.containsKey(A[i][j])) {
                    int count = hashMap.get(A[i][j]);
                    hashMap.put(A[i][j], count + 1);
                } else {
                    hashMap.put(A[i][j], 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println(map.getKey());

            }
        }


    }
}