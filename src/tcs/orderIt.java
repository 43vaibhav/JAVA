package tcs;
import java.util.*;

public class orderIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine(); // skip "shuffled"

        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < n; i++) shuffled.add(sc.nextLine().trim());

        sc.nextLine(); // skip "original"
        List<String> original = new ArrayList<>();
        for (int i = 0; i < n; i++) original.add(sc.nextLine().trim());

        // Map original string to index
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) pos.put(original.get(i), i);

        // Convert shuffled to original indices
        int[] order = new int[n];
        for (int i = 0; i < n; i++) order[i] = pos.get(shuffled.get(i));

        // Find longest increasing subsequence (LIS) length
        List<Integer> lis = new ArrayList<>();
        for (int num : order) {
            int idx = Collections.binarySearch(lis, num);
            if (idx < 0) idx = -(idx + 1);
            if (idx == lis.size()) lis.add(num);
            else lis.set(idx, num);
        }

        // Minimum operations = total - LIS length
        int result = n - lis.size();
        System.out.println(result);
    }
}
