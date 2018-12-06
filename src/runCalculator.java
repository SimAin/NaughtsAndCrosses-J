import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class runCalculator {

    public static void main (String[] args) throws IOException {
        boolean exit = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Please enter a height for your board: ");
            int height = Integer.parseInt(br.readLine());
            System.out.print("Please enter a width for your board: ");
            int width = Integer.parseInt(br.readLine());
            System.out.print("Please enter a depth for your board (Enter '1' for a 2D grid): ");
            int depth = Integer.parseInt(br.readLine());
            System.out.print("Please enter a size of the desired winning line: ");
            int sizeOfWl = Integer.parseInt(br.readLine());
            System.out.println();
            System.out.println("The number of winning lines are: " + naughtsAndCrossesCalculator.calculatePotentialWinningLines(width,height,depth,sizeOfWl));
            System.out.println();
            System.out.print("To exit enter 'Y', otherwise enter any other key: ");
            String result = (br.readLine());

            if(result.equals("Y")){
                exit = true;
            }
        } while (!exit);
    }
}
