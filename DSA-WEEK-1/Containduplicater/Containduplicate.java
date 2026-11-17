
import java.util.*;

public class Containduplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k) {
                    found = true;
                    break;
                }
            }

            map.put(nums[i], i);
        }

        System.out.println(found);

        sc.close();
    }
}
