package algorithms.mazeGenerators;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public abstract class AMazeGenerator implements IMazeGenerator {
    public Long measureAlgorithmTimeMillis(int rows, int columns) {
        Long start_time = System.currentTimeMillis();
        generate(rows, columns);
        Long end_time = System.currentTimeMillis();
        Long result_time = end_time - start_time;
        return result_time;
    }

    protected Position GenerateRandomPositions(int rows, int columns) {
        Random rand = new Random();
        int rows_random = rand.nextInt(rows);
        int cols_random = rand.nextInt(columns);
        Position p1 = new Position(0, cols_random);
        Position p2 = new Position(rows - 1, cols_random);
        Position p3 = new Position(rows_random, 0);
        Position p4 = new Position(rows_random, columns - 1);
        List<Position> PositionList = Arrays.asList(p1, p2, p3, p4);
        Position randomPos = PositionList.get(rand.nextInt(PositionList.size()));
        return randomPos;
    }

    protected Position[] CheckPositions(int rows, int columns) {
        Position start = GenerateRandomPositions(rows, columns);
        Position goal = GenerateRandomPositions(rows, columns);

        while (start.getMoreNeighbors(rows, columns).contains(goal) | (goal.getRowIndex()==start.getRowIndex())&(goal.getColumnIndex()==start.getColumnIndex()))
            goal = GenerateRandomPositions(rows, columns);
        Position[] answer = {start, goal};
        return answer;
    }

}
