package Graph.DFS;

import java.util.*;
//https://leetcode.com/problems/time-needed-to-inform-all-employees/description/
public class TimeNeededToInformAllEmployees {
    static void main() {

    }

    static public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.get(manager[i]).add(i);
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { headID, 0 });
        int maxTime = 0;

        while (!queue.isEmpty()) {
            int currentId = queue.peek()[0];
            int time = queue.peek()[1];
            queue.remove();
            maxTime = Math.max(maxTime, time);

            for (int sub : adjList.get(currentId)) {
                queue.add(new int[] { sub, time + informTime[currentId] });
            }
        }
        return maxTime;
    }
}
