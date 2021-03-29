package algorithms.mazeGenerators;

public class Maze {
    int[][] maze;
    int rows;
    int columns;
    Position start;
    Position goal;

    public Maze(int rows, int columns, int rstart,int cstart, int rgoal,int cgoal) {
        this.rows = rows;
        this.columns = columns;
        this.start = new Position(rstart,cstart);
        this.goal = new Position(rgoal,cgoal);
        maze = new int[rows][columns];
    }

    public Position getStartPosition(){
        return start;
    }
    public Position getGoalPosition(){
        return goal;
    }
    public void print(){
        System.out.print("{\n");
        for (int i = 0; i < rows; i++) {
            System.out.print("{");
            for (int j = 0; j < columns; j++) {
                System.out.print(maze[i][j]);
                if (j!=columns-1)
                    System.out.print(", ");
             }
            System.out.print("}");
            if (i!=rows-1)
                System.out.print(", ");
            System.out.print("\n");
        }
        System.out.print("}\n");
    }
}
