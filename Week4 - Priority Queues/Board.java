import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Board {
    private final int n;
    private final int[][] tiles;

    public Board(int[][] tiles) {
        checkNice(tiles);
        this.tiles = clone(tiles);
        n = this.tiles.length;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(n + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s.append(String.format("%2d ", tiles[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }

    public int dimension() {
        return n;
    }

    public int hamming() {
        int distance = -1;
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tiles[i][j] != number)
                    distance++;
                number++;
            }
        }
        return distance;
    }

    public int manhattan() {
        int distance = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                number++;
                if (tiles[i][j] == 0 || tiles[i][j] == number)
                    continue;

                int[] coo = getShouldBe(tiles[i][j]);

                int value;
                if (coo[0] == i)
                    value = Math.abs(coo[1] - j);
                else if (coo[1] == j)
                    value = Math.abs(coo[0] - i);
                else
                    value = Math.abs(coo[0] - i) + Math.abs(coo[1] - j);
                distance = distance + value;
            }
        }
        return distance;
    }

    public boolean isGoal() {
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tiles[i][j] != number && tiles[i][j] != 0)
                    return false;
                number++;
            }
        }
        return true;
    }

    public boolean equals(Object y) {
        if (y == this)
            return true;

        if (y == null)
            return false;

        if (y.getClass() != this.getClass())
            return false;

        Board that = (Board) y;
        if (this.dimension() != that.dimension())
            return false;

        for (int i = 0; i < this.tiles.length; i++) {
            for (int i2 = 0; i2 < this.tiles.length; i2++) {
                if (this.tiles[i][i2] != that.tiles[i][i2])
                    return false;
            }
        }
        return true;
    }

    public Iterable<Board> neighbors() {
        Stack<Board> neighbors = getTwinsByNumber(0);
        return neighbors;
    }

    public Board twin() {
        int[] coo = getCoordinates(0, tiles);
        int numberX;
        if (coo[0] < n - 1)
            numberX = tiles[coo[0] + 1][coo[1]];
        else
            numberX = tiles[coo[0] - 1][coo[1]];

        Stack<Board> stack = getTwinsByNumber(numberX);
        Board board = stack.pop();

        if (tiles[coo[0]][coo[1]] != board.tiles[coo[0]][coo[1]]) {
            return stack.pop();
        }
        return board;
    }

    private Stack<Board> getTwinsByNumber(int number) {
        Stack<Board> twinsByNumber = new Stack<>();
        int[] coo = getCoordinates(number, tiles);
        int row = coo[0];
        int col = coo[1];

        if (col > 0)
            twinsByNumber.push(copyChange(coo, Direction.left, number, tiles));
        if (col < n - 1)
            twinsByNumber.push(copyChange(coo, Direction.right, number, tiles));
        if (row > 0)
            twinsByNumber.push(copyChange(coo, Direction.up, number, tiles));
        if (row < n - 1)
            twinsByNumber.push(copyChange(coo, Direction.down, number, tiles));

        return twinsByNumber;
    }

    private enum Direction {
        up, down, right, left
    }

    private static Board copyChange(int[] coordinates, Direction direction, int number, int[][] tiles) {
        int[][] board = clone(tiles);
        int row = coordinates[0];
        int col = coordinates[1];
        switch (direction) {
            case up:
                board[row][col] = board[row - 1][col];
                board[row - 1][col] = number;
                break;
            case down:
                board[row][col] = board[row + 1][col];
                board[row + 1][col] = number;
                break;
            case left:
                board[row][col] = board[row][col - 1];
                board[row][col - 1] = number;
                break;
            case right:
                board[row][col] = board[row][col + 1];
                board[row][col + 1] = number;
                break;
        }
        return new Board(board);
    }

    private static int[][] clone(int[][] tiles) {
        int[][] clone = new int[tiles.length][tiles.length];

        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone.length; j++) {
                clone[i][j] = tiles[i][j];
            }
        }

        return clone;
    }

    private static void checkNice(int[][] tiles) {
        if (tiles == null)
            throw new IllegalArgumentException();

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j] < 0)
                    throw new IllegalArgumentException();
            }
        }
    }

    private int[] getShouldBe(int number) {
        int[] coo = { 0, 0 };
        for (int row = 0; row < tiles.length; row++)
            for (int col = 0; col < tiles.length; col++)
                if (number == getIndex(row, col)) {
                    coo[0] = row;
                    coo[1] = col;
                    return coo;
                }
        return coo;
    }

    private int getIndex(int row, int col) {
        return n * row + col + 1;
    }

    private static int[] getCoordinates(int number, int[][] tiles) {
        assert number >= 0 && number < tiles.length;

        int row = -1;
        int col = -1;

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j] == number) {
                    row = i;
                    col = j;
                }
            }
        }
        int[] coordinates = { row, col };
        return coordinates;
    }

    public static void main(String[] args) {
        /*
         * In in = new In(args[0]);
         * int n = in.readInt();
         * int[][] tiles = new int[n][n];
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * tiles[i][j] = in.readInt();
         * }
         * }
         */

        int[][] tiles = { { 8, 1, 3 }, { 4, 0, 2 }, { 7, 6, 5 } };
        Board b = new Board(tiles);
        StdOut.println(b.toString());
        StdOut.println(b.isGoal());
        StdOut.println(b.hamming());
        StdOut.println(b.manhattan());
        StdOut.println(b.neighbors());
        StdOut.println(b.dimension());
        StdOut.println(b.equals(b));
        StdOut.println(b.twin().toString());
    }
}
