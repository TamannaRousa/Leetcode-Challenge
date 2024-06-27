import java.util.ArrayList;
import java.util.List;

public class Leetcode1791 {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        
        List<Integer>[] adjList = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList[u - 1].add(v - 1); // Adjust indices assuming edges are 1-based
            adjList[v - 1].add(u - 1);
        }
        
        int maxDegree = 0;
        int centreNode = 0;
        
        for (int i = 0; i < n; i++) {
            int degree = adjList[i].size();
            if (degree > maxDegree) {
                maxDegree = degree;
                centreNode = i + 1; // Adjust index to 1-based if needed
            }
        }
        
        return centreNode;
    }
}


