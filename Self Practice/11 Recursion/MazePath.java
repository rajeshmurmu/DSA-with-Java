//Why do local variables need to be initialized in Java?
public class MazePath {
    public static int mazePath(int startRow, int startCol, int endRow, int endCol) {
        int rightWays = 0;
        int downWays = 0;
        if (startRow == endRow && startCol == endCol) {
            return 1;
        }

        if (startRow == endRow) {
            rightWays += mazePath(startRow, startCol + 1, endRow, endCol);
        } else if (startCol == endCol) {
            downWays += mazePath(startRow + 1, startCol, endRow, endCol);
        } else {
            rightWays += mazePath(startRow, startCol + 1, endRow, endCol);
            downWays += mazePath(startRow + 1, startCol, endRow, endCol);
        }

        int totalWays = rightWays + downWays;
        return totalWays;
    }

    public static void main(String[] args) {
        int endRow = 2;
        int endCol = 3;

        int res = mazePath(1, 1, endRow, endCol);
        System.out.println(res);
    }
}
