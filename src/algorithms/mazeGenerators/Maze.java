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
    public void testPrint(){
        int[][] temp = map  ;
        temp[start.getRowIndex()][start.getColumnIndex()] = 2;
        temp[goal.getRowIndex()][goal.getColumnIndex()] = 3;
        String body = "";
        for (int[] r : map  )
            body += "█ ";
        body += "█ ";
        body += "█ ";
        body+="\n";
        for (int[] r : map  ){
            body += "█";
            for (int i : r){
                body += " ";
                if (i != 2 && i != 3 && i == 1)
                    body += "█";
                else if (i != 2 && i != 3 && i == 0)
                    body += " ";
                else if (i == 2)
                    body += "S";
                else
                    body += "E";
            }
            body += " ";
            body += "█";
            body+="\n";
        }
        for (int[] r : map  )
            body += "█ ";
        body += "█ ";
        body += "█ ";
        System.out.println(body);
    }
}
