class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacVisited = new boolean[heights.length][heights[0].length];
        boolean[][] atlVisited = new boolean[heights.length][heights[0].length];
        //Pacific from top and left 
        // Altlantic from right and bottom
        int row = heights.length;
        int col = heights[0].length;
        // top 
         //bottom
        for (int i=0;i<col;i++){
             helper(0 , i , heights , pacVisited ,  heights[0][i]);
             helper(row-1 , i , heights , atlVisited ,heights[row-1][i]  );
        }
        // left
         // right
        for (int i=0;i<row;i++){
             helper(i , 0 , heights , pacVisited , heights[i][0]);
             helper(i , col-1 , heights , atlVisited ,heights[i][col-1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<pacVisited.length;i++){
            for (int j=0;j<pacVisited[0].length;j++){
                if(pacVisited[i][j] && atlVisited[i][j]){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;
    }
    //Pacific
    public void helper(int r , int c , int[][] heights , boolean[][] visited , int prev ){
        if(r<0 || r>=heights.length || c<0 || c>=heights[0].length || visited[r][c]  || prev > heights[r][c] ){
            return;
        }
        visited[r][c] = true;
        int [][]  dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        for (int i=0;i<dirs.length;i++){
            int nextRow = r+dirs[i][0];
            int nextCol = c+dirs[i][1];
             helper(nextRow,nextCol , heights , visited , heights[r][c]);
        }
    }
}
