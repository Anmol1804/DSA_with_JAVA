package com.anmol;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        paths("", board, 0,0);
    }
    static void paths(String p, boolean[][] maze, int r, int c){
        // here base is end cordinates (we start with 0 0)
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        // if obstacle => false return
        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            paths(p+ "D", maze,r+1,c);
        }

        if(c < maze[0].length-1){
            paths(p + "R",maze, r, c+1);
        }
    }
}
