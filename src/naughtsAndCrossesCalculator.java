public class naughtsAndCrossesCalculator extends Exception{

    static int Height, Width, Depth, SizeOfWL; //Input variables
    int HWinningLines, VWinningLines; // 2D winning line variables TODO: use for 2d inputs
    static int D1WL, D2WL, D3WL, CDWL, CD1WL, CD2WL, CD3WL, TotalWL, TotalWL2, TotalWL4;// Dimension winning line variables
    //int error, ExitControl, EndGame, NandC, CDLoopLines; // Control variables - TODO: add system controls
    static int dig1, dig2;

    //TODO: Create inputs, so system can be run by user(see sys controls)
    //TODO: comment maths explanation
    public static void main (String[] args) {

        //Takes Winning lines for one player in a 2 player standard game
        TotalWL = calculatePotentialWinningLines(3, 3, 1, 3);
        //Creates "total" winning lines as each player could win therefore there are double the amount of winning lines
        TotalWL2 = (TotalWL * 2);
        //Removing the assumption that a winning line has to be a straight line of 0's or X's, this calculates the number of lines if they can alternate
        TotalWL4 = (TotalWL2 * 2);

        System.out.println("When noughts and crosses is played on a " + Height + " x " + Width + " x " + Depth + " grid and the size of the winning line is " + SizeOfWL + " :");
        System.out.println("The number of possible wining lines for each player in a standard 2 player game is :  " + TotalWL);
        System.out.println("The number of possible wining lines including both players (Straight X's or O's) :  " + TotalWL2);
        System.out.println("The number of possible wining lines is (If alternating X's and O's counts as a winning line) :  " + TotalWL4);

    }

    public static int calculatePotentialWinningLines(int width, int height, int depth, int sizeOfWinningLine) {

        Height = height;
        Width = width;
        Depth = depth;
        SizeOfWL = sizeOfWinningLine;

        if(!validateSizesFit()) {
            //Calls dimension calculator on each combination of sides
            D1WL = D_Grid(Height, Width, SizeOfWL);
            if (Depth != 1) {
                D1WL = (D1WL * Depth);

                D2WL = D_Grid(Width, Depth, SizeOfWL);
                D2WL = (D2WL * Height);

                D3WL = D_Grid(Depth, Height, SizeOfWL);
                D3WL = (D3WL * Width);

                //Uses dig function to calculate correct winning lines and Cross dimension function to calculate how many times to use it.
                dig1 = Dig(Height, Width, SizeOfWL);
                CD1WL = CrossDGrid(Depth, dig1, SizeOfWL);

                dig2 = Dig(Height, Depth, SizeOfWL);
                CD2WL = CrossDGrid(Width, dig2, SizeOfWL);
            }
        } else {
            return 0;
        }
        return (D1WL + D2WL + D3WL + CDWL);
    }

    public static boolean validateSizesFit() throws NumberFormatException{
        if ((Width > Height) && (Height > Depth) && (Depth < SizeOfWL))
        {
            return true;
        }

        if ((Height > Depth) && (Depth > Width) && (Width < SizeOfWL))
        {
            return true;
        }
        if ((Depth > Width) && (Width > Height) && (Height < SizeOfWL))
        {
            return true;
        }

        if((SizeOfWL > Depth ) && (SizeOfWL > Width )&& (SizeOfWL > Height )){
            return true;
        }
        return false;
    }

    //Inputs change depending on stage of calculation, hence vague input names
    public static int D_Grid (int dimension_1, int dimension_2, int dimension_3 )
    {
        int HWL, VWL,DWL; // Horizontal, vertical, diagonal winning lines variable
        int TWL; // Total winning lines

        HWL = (dimension_1*((dimension_2-dimension_3)+1)); //Horizontal winning lines
        VWL = (dimension_2*((dimension_1-dimension_3)+1)); //Vertical winning lines
        DWL = (2 * ((HWL/dimension_1) * (VWL)/dimension_2)); //diagonal winning lines
        TWL = (HWL + VWL + DWL); //total winning lines
        //Return total
        return TWL;
    }

    //Inputs change depending on stage of calculation, hence vague input names
    public static int Dig (int dimension_1, int dimension_2, int dimension_3)
    {
        int HWL, VWL,DWL; // Horizontal, vertical, diagonal winning lines variable

        HWL = (dimension_1*((dimension_2-dimension_3)+1)); // Horizontal winning lines
        VWL = (dimension_2*((dimension_1-dimension_3)+1)); //Vertical winning lines
        DWL = (2 * ((HWL/dimension_1) * (VWL)/dimension_2)); //diagonal winning lines
        //Return diagonal winning lines
        return DWL;
    }

    //Inputs change depending on stage of calculation, hence vague input names
    public static int CrossDGrid (int height, int depth, int winningLineLength) {
        int Horizontal, CDLines; //winning lines to calculate diagonals

        Horizontal = ((height - winningLineLength) + 1); //((Height - Winning line length) +1) =  number of times to run the loop
        CDLines = (depth * Horizontal); // total of the above result run the correct amount of times
        //Return total
        return CDLines;
    }
}