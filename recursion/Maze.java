package recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazePathRestrictions("",board,0,0);
    }

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    public static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1) {
            mazePath(p + 'V', r - 1, c);
        }
        if(c>1) {
            mazePath(p + 'H', r, c - 1);
        }
        if(c>1 && r>1){
            mazePath(p+'D',r-1,c-1);
        }
    }

    public static void mazePathRestrictions(String p,boolean[][] maze,int r, int c) {
        if (r==maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1 ) {
            mazePathRestrictions(p + 'V',maze, r + 1, c);
        }
        if(c<maze[0].length-1) {
            mazePathRestrictions(p + 'H',maze, r, c + 1);
        }
    }
}