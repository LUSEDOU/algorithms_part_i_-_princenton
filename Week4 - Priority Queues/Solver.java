import java.util.Comparator;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Solver {
    private Node root;

    /**
     * A class to anidate boards and save the previous.
     */
    private static class Node implements Comparable<Node> {
        public final boolean original;

        private final Board board;
        private final Node prev;
        private final int moves;
        private final int manhattan;
        private final int priority;

        
        /**
         *  Initialice the node
         * 
         *  @param board    the Board of the node
         *  @param prev     the prev node
         *  @param moves    the current moves
         */
        public Node(Board board, Node prev, int moves, boolean original) {
            this.board = board;
            this.prev = prev;
            this.moves = moves;
            this.manhattan = this.board.manhattan();
            this.priority = this.manhattan + this.moves;
            this.original = original;
        }
        
        public Board getBoard()     {   return board;       }
        public Node getPrev()       {   return prev;        }
        public int getMoves()       {   return moves;       }
        public int manhattan()      {   return manhattan;   }
        public int priority()       {   return priority;    }

        /**
         * Compares two nodes by priority.
         * The priority is defined by priority() method.
         * 
         * @param   that the other node
         * @return  the value <tt>0<tt> if this is equal to the argument
         *          node (priority1 = priority2);
         *          a negative interger if this node is less than the
         *          argument node; a positive interger if this node is 
         *          greater than the argument node
         */
        public int compareTo(Node that) {
            if (this.getMoves() > that.getMoves()) return +1;
            if (this.getMoves() < that.getMoves()) return -1;
            return 0;
        }
    }

    /**
     * Initialice the Solver
     * 
     * @param initial the board which gonna solve
     */
    public Solver(Board initial) {
        if (initial == null) throw new IllegalArgumentException();

        root = new Node(
            initial, 
            null, 
            0, 
            true
        );

        solver(root);
    }
    
    public boolean isSolvable() {   
        return isGoal(root) && root.original;
    }

    public int moves() {
        if (!isSolvable()) return -1;
        return root.moves;                  
    }

    public Iterable<Board> solution() {
        if (!isSolvable()) return null;
        Stack<Board> solution = new Stack<>();
        Node current = root;

        solution.push(current.getBoard());
        while (current.getPrev() != null) {
            current = current.getPrev();
            solution.push(current.getBoard());
        }
        return solution;
    }

    /**
     * Iterate the node while root's board is not goal
     * by calling addNeighboard() method and give it
     * the argument node, then actualizate the argument
     * changing with the invoking node of poll() method.
     * 
     * @param current the iterating node
     * 
     */
    private void solver(Node current) {
        MinPQ<Node> minPQ = new MinPQ<>(new PriorityOrder());
        Node twincurrent = new Node(current.getBoard().twin(), null, 0, false);

        minPQ.insert(current);
        minPQ.insert(twincurrent);

        while (!isGoal(root)) {
            current = minPQ.delMin();
            addNeighboard(current, getNeighbords(current), minPQ);
        }
    }

    /**
     * Adds the neighbords of the node's board by calling
     * getNeighbords() method, check if it's equals to the
     * argument current's previous node to add it in the
     * the priority stack.
     * 
     * @param current the constructors node
     * 
     */
    private void addNeighboard(Node current, Stack<Board> stack, MinPQ<Node> pq) {
        for (Board board : stack)
            if (current.getPrev() == null || !current.getPrev().getBoard().equals(board))
                addNode(new Node(board, current, current.getMoves() + 1, current.original), pq);
    }

    /**
     * Get the neighbords' boards of the argument node
     * and put them in a stack.
     * 
     * @param   current the constructor's node
     * @return  the neighbords' boards of the argument
     * 
     */
    private Stack<Board> getNeighbords(Node current) {
        Stack<Board> stack = new Stack<>();
        for (Board board : current.getBoard().neighbors())
            stack.push(board);
        return stack;
    }

    /**
     * Adds the argument node to the argument stack and call
     * isGoal() method to check if the argument node's board
     * is goal for actualizate the root arguement.
     * 
     * @param current the node which be gonna add and check
     * @param root the node which be gonna actualizate
     * @param pq the priorityqueue to add whitin
     * 
     */
    private void addNode(Node current, MinPQ<Node> pq) {
        if (isGoal(current)) root = current;
        pq.insert(current);
    }

    /**
     * Return if the argument node's board is goal
     * 
     * @param   node the constructor's node
     * @return  if the node's board is goal
     * 
     */
    private static boolean isGoal(Node node) {
        return node.getBoard().isGoal();
    }

    private static class PriorityOrder implements Comparator<Node> {
        public int compare(Node o1, Node o2) {
            if (o1.priority() > o2.priority())      return +1;
            if (o1.priority() < o2.priority())      return -1;
            if (o1.manhattan() > o2.manhattan())    return +1;
            if (o1.manhattan() < o2.manhattan())    return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        // create initial board from file

        In in = new In(args[0]);
        int n = in.readInt();
        int[][] tiles = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                tiles[i][j] = in.readInt();
        Board initial = new Board(tiles);
    
        // solve the puzzle
        Solver solver = new Solver(initial);
    
        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
}
