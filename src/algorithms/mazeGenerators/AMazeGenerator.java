package algorithms.mazeGenerators;

public abstract class AMazeGenerator implements IMazeGenerator {
    public Long measureAlgorithmTimeMillis(int rows, int columns){
        Long start_time = System.currentTimeMillis();
        generate(rows, columns);
        Long end_time = System.currentTimeMillis();
        Long result_time = end_time-start_time;
        return result_time;
    }
}
