package Graph.DFS;
//https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {
    static void main() {
        numIslands(new char[][]{});
    }

    static public int numIslands(char[][] grid) {
        int counter = 0;
        int row= grid.length;
        int col = grid[0].length;
        boolean[][] isVisited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {
                    dfs(i, j, isVisited, grid);
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void dfs(int row, int col, boolean[][] isVisited, char[][] grid) {
            if (row < 0|| row >= grid.length || col < 0 || col >= grid[0].length && isVisited[row][col] || grid[row][col] =='0'){
                return;
            }

        isVisited[row][col] = true;
        dfs(row-1, col, isVisited, grid);
        dfs(row+1, col, isVisited, grid);
        dfs(row, col-1, isVisited, grid);
        dfs(row, col+1, isVisited, grid);
    }
}
