public class testNaughtsAndCrossesCalculator {

    //Run Search methods.
    public static void main (String[] args) {
        System.out.println("Test run, passed tests will return true: ");
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,3,3,3), 72)); // 3 X 3 (2D grid) = 8 wl's, * 9 (number of extra grids added by depth) = 72
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(2,3,4,2), 150));
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,3,3,9), 0)); // 0 == Error, needs to be updated to an exception
    }

    public static boolean resultWasAsExpected(int actual, int expected) {
        if(actual == expected) {
            return true;
        } else {
            System.out.println("Error: failed unit test. See details below:");
            System.out.println("Expected = " + expected);
            System.out.println("Actual = " + actual);
        }
        return false;
    }
}
