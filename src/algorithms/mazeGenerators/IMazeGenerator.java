package algorithms.mazeGenerators;

public interface IMazeGenerator {
    Maze generate(int rows, int columns);
    Long measureAlgorithmTimeMillis(int rows, int cols);
}
