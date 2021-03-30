package algorithms.mazeGenerators;

import java.util.ArrayList;

public class Position {
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int row;
    int column;
    public int getRowIndex(){
        return row;
    }
    public int getColumnIndex(){
        return column;
    }
    public String toString(){ // ????
        return "{"+row+","+column+"}";
    }
    public ArrayList<Position> getNeighbors(int rows ,int columns){
        ArrayList<Position> posarray = new ArrayList<Position>();
        if (row>0) {
            posarray.add(new Position(row - 1, column));
            if (column>0)
                posarray.add(new Position(row-1, column-1));
            if (column<columns-1)
                posarray.add(new Position(row-1, column+1));
        }
        if (column>0)
            posarray.add(new Position(row, column-1));
        if (column<columns-1)
            posarray.add(new Position(row, column+1));
        if (row<rows-1){
            posarray.add(new Position(row+1, column));
            if (column>0)
                posarray.add(new Position(row+1, column-1));
            if (column<columns-1)
                posarray.add(new Position(row+1, column+1));
        }
        return posarray;
    }
    public boolean equals(Object p){
        if ((this.getRowIndex()==((Position)p).getRowIndex())&&(this.getColumnIndex()==((Position)p).getColumnIndex()))
            return true;
        return false;
    }
}
