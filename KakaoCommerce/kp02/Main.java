package kp02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {
    // combinations()
    static ArrayList<ArrayList<Integer>> combResultSet = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> result = new ArrayList<Integer>();

    public static int[][] deepCopy(int[][] original2) {
        if(original2 == null) return null;
        int[][] result = new int[original2.length][original2[0].length];
         
        for(int i=0; i<original2.length; i++){
            System.arraycopy(original2[i], 0, result[i], 0, original2[0].length);
        }
         
        return result;
    }
    
    public static void combinations(int L, int S, int pick, int[] arr) {
        if (L == pick){
            combResultSet.add((ArrayList<Integer>) result.clone());
        } else {
            for(int i=S;i < arr.length;i++) {
                result.add(arr[i]);
                combinations(L + 1, i + 1, pick, arr);
                result.remove(result.size() - 1);
            }
        }
    }
    public static int solution(int[][] needs, int r) {
        int L = needs[0].length;
        int[] arr = IntStream.range(0, L).toArray();
        combinations(0, 0, r, arr);
        int ans = 0;

        Iterator<ArrayList<Integer>> it = combResultSet.iterator();
        while (it.hasNext()){
            int[][] board = deepCopy(needs);
            ArrayList<Integer> list = it.next();
            Iterator<Integer> iit = list.iterator();
            while(iit.hasNext()) {
                int e = iit.next();
                
                // solve
                for(int i=0;i < board.length;i++) {
                    board[i][e] = 0;
                }
            }
            int cnt = 0;
            // checking (해당 행에 1이 하나라도 있으면 그 제품은 못 만듦)
            for(int i=0;i<board.length;i++) {
                int j;
                for (j=0;j <board[0].length;j++) {
                    if (board[i][j] == 1) {
                        break;
                    }
                }
                if(j == board[0].length) {
                    cnt += 1;
                }
            }
            if(cnt > ans) {
                ans = cnt;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] needs = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int res = solution(needs, 2);
        System.out.println(res);
    }     
}
