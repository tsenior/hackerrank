import java.util.List;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal+=arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            secondDiagonal+=arr.get(i).get(arr.size() - (i + 1));
        }
        return Math.abs(firstDiagonal - secondDiagonal);

    }
}
