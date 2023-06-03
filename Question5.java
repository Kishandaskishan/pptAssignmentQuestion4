package JavaAssignmentQ4;

public class Question5 {
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int remainingCoins = n;
        int currentRow = 1;

        while (remainingCoins >= currentRow) {
            remainingCoins -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 8;

        int numCompleteRows = arrangeCoins(n);

        System.out.println("Number of Complete Rows: " + numCompleteRows);
    }
}