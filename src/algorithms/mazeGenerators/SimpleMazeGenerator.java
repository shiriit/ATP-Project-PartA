package algorithms.mazeGenerators;

import java.util.Random;

public class SimpleMazeGenerator extends AMazeGenerator{
    public Maze generate(int rows, int columns){
        int[][] m_map = new int[rows][columns];
        Position[] positions = CheckPositions(rows,columns);
        Position start = positions[0];
        Position goal =  positions[1];
        Random rand = new Random();
        int rows_random = rand.nextInt(rows);
        int cols_random = rand.nextInt(columns);
        int num_of_walls = (rows*columns)/2;
        Maze my_maze = new Maze(m_map,start,goal);
    /*    return my_maze;
    }*/
}
