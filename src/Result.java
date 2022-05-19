import java.util.List;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) throws InterruptedException {
 
        int diagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonal+=arr.get(i).get(i);
            diagonal+=arr.get(i).get(arr.size() - (i + 1));
        }

        System.out.println(diagonal);
        Thread.sleep(5000000);

        return Math.abs(diagonal);

    }
}
