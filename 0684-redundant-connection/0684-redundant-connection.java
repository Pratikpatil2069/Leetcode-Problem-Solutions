import java.util.*;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<Integer> graph[] = new ArrayList[edges.length + 1];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            Arrays.fill(vis, false);

            if (detectCycle(graph, u, -1, vis, v)) {
                return edges[i];
            }

            graph[u].add(v);
            graph[v].add(u);
        }

        return new int[0];
    }

    public boolean detectCycle(ArrayList<Integer>[] graph, int node,
                               int parent, boolean[] vis, int target) {
        if (node == target) {
            return true;
        }

        vis[node] = true;

        for (int nbr : graph[node]) {
            if (!vis[nbr]) {
                if (detectCycle(graph, nbr, node, vis, target)) {
                    return true;
                }
            }
        }

        return false;
    }
}