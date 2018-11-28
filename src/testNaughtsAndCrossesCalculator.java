public class testNaughtsAndCrossesCalculator {

    //Run Search methods
    public static void main (String[] args) {
        System.out.println("Test run, passed tests will return true: ");

        //If Width == Depth == Height == SizeofWinningLine then result = n(6(n+1)) + 4

        testWhenAllAreEqual();

        //Testing edge cases

        testExtremes();

        //Testing Error codes are received

        testForErrors();
        
    }

    public static void testWhenAllAreEqual() {
        System.out.println("12 X 12 X 12 -- WL = 12: ");
        // 12 X 12 (2D grid) = 10 wl's, * 12 (number of extra grids added by depth) = 120 + 4 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(12,12,12,12), 940));

        System.out.println("4 X 4 X 4 -- WL = 4: ");
        // 4 X 4 (2D grid) = 10 wl's, * 12 (number of extra grids added by depth) = 120 + 4 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(4,4,4,4), 124));

        System.out.println("3 X 3 X 3 -- WL = 3: ");
        // 3 X 3 (2D grid) = 8 wl's, * 9 (number of extra grids added by depth) = 72 + 4 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,3,3,3), 76));

        System.out.println("2 X 2 X 2 -- WL = 2: ");
        // 2 X 2 (2D grid) = 6 wl's, * 6 (number of extra grids added by depth) = 36 + 4 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(2,2,2,2), 40));
    }
    
    public static void testExtremes() {
        System.out.println("2 X 3 X 4 -- WL = 2: ");
        // 2 X 3 (2D grid) = 11 wl's, * 4  == 44 +
        // 3 X 4 (2D grid) = 29 wl's, * 2  == 58 +
        // 4 X 2 (2D grid) = 16 wl's, * 3  == 48 = 150 + 24 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(2,3,4,2), 174));

        System.out.println("12 X 12 X 12 -- WL = 2: ");
        // 12 X 12 (2D grid) = 506 wl's, * 12  == 6072
        // 6072 X 3 (For each dimension) = 18216 + 5324 (Number of corner to corner diagonals)
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(12,12,12,2), 23540));
    }
    
    public static void testForErrors(){
        System.out.println("3 X 3 X 3 -- WL = 9: ");
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,3,3,9), 0)); // 0 == Error, needs to be updated to an exception

        System.out.println("3 X 6 X 9 -- WL = 2: ");
        System.out.println(resultWasAsExpected(naughtsAndCrossesCalculator.calculatePotentialWinningLines(3,6,9,9), 76)); // 0 == Error, needs to be updated to an exception
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
