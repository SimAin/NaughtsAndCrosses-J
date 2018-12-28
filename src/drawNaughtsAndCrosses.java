public class drawNaughtsAndCrosses {
    public static void drawFront2D(gameBoard grid) {
        System.out.println("Front View");
        String line = "_|";
        String finalLine = " |";
        for (int i = 0; i < grid.getWidth() - 2 ; i++) {
            line = line + "_|";
            finalLine = finalLine + " |";
        }
        line = line + "_";
        for (int i = 0; i < grid.getHeight() - 1; i++) {
            System.out.println(line);
        }
        System.out.println(finalLine);
    }

    public static void drawSide2D(gameBoard grid) {
        System.out.println("Side View");
        String line = "_|";
        String finalLine = " |";
        for (int i = 0; i < grid.getDepth() - 2 ; i++) {
            line = line + "_|";
            finalLine = finalLine + " |";
        }
        line = line + "_";
        for (int i = 0; i < grid.getHeight() - 1; i++) {
            System.out.println(line);
        }
        System.out.println(finalLine);
    }

    public static void drawTop2D(gameBoard grid) {
        System.out.println("Top View");
        String line = "_|";
        String finalLine = " |";
        for (int i = 0; i < grid.getWidth() - 2 ; i++) {
            line = line + "_|";
            finalLine = finalLine + " |";
        }
        line = line + "_";
        for (int i = 0; i < grid.getDepth() - 1; i++) {
            System.out.println(line);
        }
        System.out.println(finalLine);
    }
}
