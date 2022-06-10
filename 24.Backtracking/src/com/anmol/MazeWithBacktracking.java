package com.anmol;

import java.util.Arrays;

public class MazeWithBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];
//        paths("", board, 0,0);
        allPathPrint("", board, 0,0, path, 1);
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

        // i am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length-1){
            paths(p+ "D", maze,r+1,c);
        }

        if(c < maze[0].length-1){
            paths(p + "R",maze, r, c+1);
        }

        // up
        if(r>0){
            paths(p+"U", maze, r-1, c);
        }

        // left
        if(c>0){
            paths(p+"L", maze, r, c-1);
        }

        // this line is where function will be over
        // so b4 function gets removed, alos remove changes made by funcion
        maze[r][c] = true;
    }


    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        // here base is end cordinates (we start with 0 0)
        if(r== maze.length-1 && c== maze[0].length-1){

            // last cell is also a step
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p + "\n");
            return;
        }

        // if obstacle => false return
        if(!maze[r][c]){
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathPrint(p+ "D", maze,r+1,c, path, step+1);
        }

        if(c < maze[0].length-1){
            allPathPrint(p + "R",maze, r, c+1, path, step+1);
        }

        // up
        if(r>0){
            allPathPrint(p+"U", maze, r-1, c, path, step+1);
        }

        // left
        if(c>0){
            allPathPrint(p+"L", maze, r, c-1, path, step+1);
        }

        // this line is where function will be over
        // so b4 function gets removed, alos remove changes made by funcion
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
