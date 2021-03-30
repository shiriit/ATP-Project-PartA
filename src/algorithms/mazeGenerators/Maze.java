package algorithms.mazeGenerators;

public class Maze {
    int[][] map;
    Position start;
    Position goal;


    public Maze(int[][] map, Position start, Position goal) {
        this.map = map;
        this.start = start;
        this.goal = goal;
    }

    public Position getStartPosition() {
        return start;
    }

    public Position getGoalPosition() {
        return goal;
    }

    public void print() {
        System.out.print("{\n");
        for (int i = 0; i < map.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < map[i].length; j++) {
                if ((i==start.getRowIndex())&(j==start.getColumnIndex()))
                    System.out.print("S");
                else if ((i==goal.getRowIndex())&(j==goal.getColumnIndex()))
                    System.out.print("E");
                else
                    System.out.print(map[i][j]);
                if (j != map[i].length - 1)
                    System.out.print(" ");
            }
            System.out.print(" }");
            if (i!=map.length-1)
                System.out.print(" ");
            System.out.print("\n");
        }
        System.out.print("}\n");
    }
}
