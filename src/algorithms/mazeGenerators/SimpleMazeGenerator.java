package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.Random;

public class SimpleMazeGenerator extends AMazeGenerator{
    public Maze generate(int rows, int columns){
        int[][] m_map = new int[rows][columns];
        Position[] positions = CheckPositions(rows,columns);
        Position start = positions[0];
        Position goal =  positions[1];
        Random rand = new Random();
        int num_of_walls = (rows*columns)/2;
        for (int i=0; i<num_of_walls; i++)
        {
            int rows_random = rand.nextInt(rows);
            int cols_random = rand.nextInt(columns);
            m_map[rows_random][cols_random]=1;
        }
        Position current = start;
        Position last = start;

/*        Maze my_maze = new Maze(m_map,start,goal);
        my_maze.print();*/

        while ((!current.equals(goal))&(!current.getNeighbors(rows, columns).contains(goal)))
        {
            ArrayList<Position> neighbors = current.getNeighbors(rows,columns);
            boolean found_neighbor = false;
            for (Position p: neighbors) {
                if ((m_map[p.getRowIndex()][p.getColumnIndex()] == 0) & (!p.equals(last))) {
                    found_neighbor = true;
                    last = current;
                    current = p;
                    break;
                }
            }
            if (!found_neighbor){
                Position randomPos;
                do {randomPos = neighbors.get(rand.nextInt(neighbors.size()));}
                while (randomPos.equals(last));
                last=current;
                current=randomPos;
                m_map[current.getRowIndex()][current.getColumnIndex()]=0;
            }

        }
        Maze my_maze = new Maze(m_map,start,goal);
        return my_maze;
    }
}
