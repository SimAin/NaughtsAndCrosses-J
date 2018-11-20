public class naughtsAndCrossesCalculator {

    static int Height, Width, Depth, SizeOfWL; //Input variables
    int HWinningLines, VWinningLines; // 2D winning line variables TODO: use for 2d inputs
    static int D1WL, D2WL, D3WL, CDWL, CD1WL, CD2WL, CD3WL, TotalWL, TotalWL2, TotalWL4;// Dimension winning line variables
    //int error, ExitControl, EndGame, NandC, CDLoopLines; // Control variables - TODO: add system controls
    static int dig1, dig2;

    //TODO: Create test file to run code with a number of different combinations
    //TODO: Create inputs, so system can be run by user(see sys controls)
    //TODO: comment maths explanation
    public static void main (String[] args) {

        Width = 3;
        Height = 3;
        Depth = 1;
        SizeOfWL = 3 ;

        //TODO: Simplify IF to manage duplicated code inside
        if(!validateSizesFit() && Depth != 1 ){
            //Calls dimension calculator on each combination of sides
            D1WL = D_Grid(Height,Width,SizeOfWL);
            D1WL = (D1WL * Depth);

            D2WL = D_Grid(Width,Depth,SizeOfWL);
            D2WL = (D2WL * Height);

            D3WL = D_Grid(Depth,Height,SizeOfWL);
            D3WL = (D3WL * Width);

            //Uses dig function to calculate correct winning lines and Cross dimension function to calculate how many times to use it.
            dig1 = Dig(Height,Width,SizeOfWL);
            CD1WL = CrossDGrid(Depth, dig1, SizeOfWL);

            dig2 = Dig(Height,Depth,SizeOfWL);
            CD2WL = CrossDGrid(Width, dig2, SizeOfWL);

            //Adds up all the totals
            TotalWL = (D1WL + D2WL + D3WL + CDWL);
            TotalWL2 = (TotalWL * 2);
            TotalWL4 = (TotalWL2 * 2);

            //TODO: reduce println statements (code clarity)
            System.out.println("When noughts and crosses is played on a ");
            System.out.println(Height + " x " + Width + " x " + Depth);
            System.out.println(" grid and the size of the winning line is " + SizeOfWL);
            System.out.println("The number of possible wining lines for each player in a standard 2 player game is : ");
            System.out.println(TotalWL);
            System.out.println("The number of possible wining lines including both players (Straight X's or O's) - ");
            System.out.println(TotalWL2);
            System.out.println("The number of possible wining lines is (If alternating X's and O's counts as a winning line) - ");
            System.out.println(TotalWL4);
        }

        if(!validateSizesFit() && Depth == 1 ){
            //Calls dimension calculator on each combination of sides
            D1WL = D_Grid(Height,Width,SizeOfWL);

            //Adds up all the totals
            TotalWL = (D1WL );
            TotalWL2 = (TotalWL * 2);
            TotalWL4 = (TotalWL2 * 2);

            //TODO: reduce println statements (code clarity)
            System.out.println("When noughts and crosses is played on a " + Height + " x " + Width + " grid");
            System.out.println("and the size of the winning line is " + SizeOfWL);
            System.out.println("The number of possible wining lines for each player in a standard 2 player game is : ");
            System.out.println(TotalWL);
            System.out.println("The number of possible wining lines is (Straight X's or O's) : ");
            System.out.println(TotalWL2);
            System.out.println("The number of possible wining lines is (If alternating X's and O's counts as a winning line) : ");
            System.out.println(TotalWL4);
        }

    }

    public static boolean validateSizesFit(){
        if (Width > Height)
        {
            if(Height > Depth)
            {
                if(Depth < SizeOfWL)
                {
                    return true;
                }
            }
        }
        if (Height > Depth)
        {
            if(Depth > Width)
            {
                if(Width < SizeOfWL)
                {
                    return true;
                }
            }
        }
        if (Depth > Width)
        {
            if(Width > Height)
            {
                if(Height < SizeOfWL)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //TODO: rename inputs
    public static int D_Grid (int y, int z, int n)
    {
        int HWL, VWL,DWL; // Horizontal, vertical, diagonal winning lines variable
        int TWL; // Total winning lines

        HWL = (y*((z-n)+1)); //Horizontal winning lines
        VWL = (z*((y-n)+1)); //Vertical winning lines
        DWL = (2 * ((HWL/y) * (VWL)/z)); //diagonal winning lines
        TWL = (HWL + VWL + DWL); //total winning lines
        //Return total
        return TWL;
    }

    //TODO: rename inputs
    public static int Dig (int y, int z, int n)
    {
        int HWL, VWL,DWL; // Horizontal, vertical, diagonal winning lines variable

        HWL = (y*((z-n)+1)); // Horizontal winning lines
        VWL = (z*((y-n)+1)); //Vertical winning lines
        DWL = (2 * ((HWL/y) * (VWL)/z)); //diagonal winning lines
        //Return diagonal winning lines
        return DWL;
    }

    //TODO: rename inputs
    public static int CrossDGrid (int u, int d, int n) {
        int Horizontal, CDLines; //winning lines to calculate diagonals

        Horizontal = ((u - n) + 1); //((Height - Winning line length) +1) =  number of times to run the loop
        CDLines = (d * Horizontal); // total of the above result run the correct amount of times
        //Return total
        return CDLines;
    }
}