public class NQueens {
    public static void solve(int row, int n) {
        if (row == n) {
            System.out.println("One solution found.");
            return;
        }
        solve(row + 1, n);
    }
}
