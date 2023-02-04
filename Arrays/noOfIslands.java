class Solution {
    public void explore(char[][] grid, int h, int w, int height, int width)
    {
        if(h<0 || h>height-1)
        {
            return;
        }
        if(w<0 || w>width-1)
        {
            return;
        }
        if(grid[h][w]=='1')
        {
            grid[h][w]='2';
            explore(grid,h+1,w,height,width);
            explore(grid,h-1,w,height,width);
            explore(grid,h,w+1,height,width);
            explore(grid,h,w-1,height,width);
        }
    }
    public int numIslands(char[][] grid) {
        
        if(grid.length==0)
        {
            return 0;
        }
        int height=grid.length;
        int width = grid[0].length;
        int count=0;
        
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                if(grid[i][j]=='1')
                {
                    count+=1;
                    explore(grid,i,j,height,width);
                }
            }
        }
        return count;
        
    }
}