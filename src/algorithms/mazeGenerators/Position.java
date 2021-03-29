package algorithms.mazeGenerators;

public class Position {
    public Position(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    int rows;
    int columns;
    int getRowIndex(){
        return rows;
    }
    int getColumnIndex(){
        return columns;
    }
    public String toString(){ // ????
        return "{"+rows+","+columns+"}";
    }

}
