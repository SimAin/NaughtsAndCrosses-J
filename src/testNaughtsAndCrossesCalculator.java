public class testNaughtsAndCrossesCalculator {

    //Run Search methods.
    public static void main (String[] args) {
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,3,3,3), 72));
    }

    public static boolean resultWasAsExpected(int actual, int expected) {
        if(actual == expected) {
            return true;
        }
        return false;
    }
}
