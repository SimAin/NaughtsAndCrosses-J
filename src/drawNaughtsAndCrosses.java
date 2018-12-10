public class drawNaughtsAndCrosses {
    public static void draw2D(gameBoard grid) {
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
}
