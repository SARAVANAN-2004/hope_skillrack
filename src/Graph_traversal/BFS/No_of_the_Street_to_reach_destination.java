package Graph_traversal.BFS;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class No_of_the_Street_to_reach_destination {
    public static class  Obj{
    int row,col,street;

        public Obj(int row, int col, int street) {
            this.row = row;
            this.col = col;
            this.street = street;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,0,0},
                {0,0,1,1,0},
                {0,1,0,1,1},
                {0,1,0,0,1},
                {0,1,1,1,1},
                {1,1,0,0,0}
        };
        int r = 6;
        int c = 5;
        boolean[][] visited = new boolean[r][c];
        int rst = 0;
        int cst = 0;
        int ren = 4;
        int cen = 1;
        Queue<Obj>  que = new ArrayDeque<>();
        que.add(new Obj(rst,cst,0));
        while (!que.isEmpty()){
            Obj curr = que.poll();
            System.out.println("row" + curr.row + "col = "+curr.col+" street = "+ curr.street);
            if(curr.row == ren && curr.col == cen){
                System.out.println(curr.street);
                return;
            }
            // go left;
            for (int col = curr.col-1; col >= 0; col--) {
                if (arr[curr.row][col] == 0 || visited[curr.row][col]){
                    break;
                }
                    visited[curr.row][col] = true;
                    que.add(new Obj(curr.row, col, curr.street+1));

            }
            // go right
            for (int col = curr.col+1; col < c; col++) {
                if (arr[curr.row][col] == 0 || visited[curr.row][col]){
                    break;
                }
                    visited[curr.row][col] = true;
                    que.add(new Obj(curr.row, col, curr.street+1));

            }
            // go up
            for (int row = curr.row-1; row >= 0; row--) {
                if (arr[row][curr.col] == 0 || visited[row][curr.col]){
                    break;
                }
                    visited[row][curr.col] = true;
                    que.add(new Obj(row, curr.col, curr.street+1));
            }
            // go down
            for (int row = curr.row+1; row < r; row++) {
                if (arr[row][curr.col] == 0 || visited[row][curr.col]){
                    break;
                }
                visited[row][curr.col] = true;
                que.add(new Obj(row, curr.col, curr.street+1));
            }
        }
    }
}
