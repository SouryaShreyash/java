package recursion;

import java.util.Arrays;

public class backtracking {
    public static void main(String[] args){
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        backTrackPath("",board,0,0,path,1);
    }
    public static void backTrack(String p,boolean[][] maze,int r, int c) {
        if (r==maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
           maze[r][c]=false;
        if(r<maze.length-1 ) {
            backTrack(p + 'V',maze, r + 1, c);
        }
        if(c<maze[0].length-1) {
            backTrack(p + 'H',maze, r, c + 1);
        }
        if(r>0 ) {
            backTrack(p + 'U',maze, r - 1, c);
        }
        if(c>0) {
            backTrack(p + 'D',maze, r, c - 1);
        }
        maze[r][c]=true;
    }

    public static void backTrackPath(String p,boolean[][] maze,int r, int c,int[][] path,int step) {
        if (r==maze.length-1 && c == maze[0].length-1) {
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1 ) {
            backTrackPath(p + 'V',maze, r + 1, c,path,step+1);
        }
        if(c<maze[0].length-1) {
            backTrackPath(p + 'H',maze, r, c + 1,path,step+1);
        }
        if(r>0 ) {
            backTrackPath(p + 'U',maze, r - 1, c,path,step+1);
        }
        if(c>0) {
            backTrackPath(p + 'D',maze, r, c - 1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}