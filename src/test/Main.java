package test;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

public class Main {

    public static void main(String[] args) {
        int[][] map = {{1,1,0,0,0},{1,1,0,0,0},{1,1,0,0,0},{1,1,0,0,0}};
        Position start = new Position(0,0);
        Position goal = new Position(2,3);
        Maze my_maze = new Maze(map, start, goal);

        my_maze.print();
    }
}
