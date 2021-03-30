package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator{
    public Maze generate(int rows, int columns){
        int[][] m_map = new int[rows][columns];
        Position[] positions = CheckPositions(rows,columns);
        Position start = positions[0];
        Position goal =  positions[1];
        Maze my_maze = new Maze(m_map,start,goal);
        return my_maze;
    }
}
