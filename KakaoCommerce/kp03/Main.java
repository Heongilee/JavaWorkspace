package kp03;

import java.util.ArrayList;

public class Main {
    static int[][] graph;
    static int cnt = 0;
    static int[] ans = {0, 0};

    public static void DFS(int v, int w, int[] passenger) {
        int i;
        for(i = 0;i < graph[v].length;i++) {
            if (graph[v][i] == 0) continue;
            else break;
        }
        if(i == graph[v].length) {
            if(w > ans[1]) {
                ans[1] = w;
                ans[0] = v;
            }
        }

        for(i = 0;i < graph[v].length;i++) {
            if (graph[v][i] == 1) {

                DFS(i, w + passenger[i - 1], passenger);
            }
        }

        return;
    }
    public static int[] solution(int n, int[] passenger, int[][] train) {
        graph = new int[n + 1][n + 1];
        for(int i=0;i<train.length;i++) {
            int X = train[i][0];
            int Y = train[i][1];

            graph[X - 1][Y - 1] = 1;
        }

        DFS(1, passenger[0], passenger);

        return ans;
    }
    public static void main(String[] args) {
        int[] passenger = {1, 1, 1, 1, 1, 1};
        int[][] train = {{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}};

        int[] res = solution(6, passenger, train);
        System.out.println(res[0], res[1]);
    }
}
