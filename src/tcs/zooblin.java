package tcs;
import java.util.*;

public class zooblin {
    static int E;
    static Map<Integer, List<Integer>> g1 = new HashMap<>();
    static Map<Integer, List<Integer>> g2 = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g1.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            g1.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g2.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            g2.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        System.out.println(findMinRotations());
    }

    static int findMinRotations() {
        Set<Integer> visited = new HashSet<>();
        int rotations = 0;

        for (int node : g1.keySet()) {
            if (!visited.contains(node)) {
                rotations++;
                dfs(node, visited);
            }
        }

        return rotations - 1; // rotations needed to align cycles
    }

    static void dfs(int node, Set<Integer> visited) {
        visited.add(node);
        for (int nbr : g1.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(nbr))
                dfs(nbr, visited);
        }
    }
}
