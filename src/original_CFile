/*program called Naughts and Crosses*/
/*Program edited by Simon Ainslie*/
/*Date written - 29/12/15 */

#include <stdio.h>

//Declares functions
int D_Grid(int y, int z, int n);
int CrossDGrid(int u, int d, int n);
int Dig (int y, int z, int n);

int main()
{
	//Declares variables needed in program
	int Height, Width, Depth, SizeOfWL; //Input variables
	int HWinningLines, VWinningLines; // 2D winning line variables
	int D1WL, D2WL, D3WL, CDWL, CD1WL, CD2WL, CD3WL, TotalWL, TotalWL4;// Dimension winning line variables
	int error, ExitControl, EndGame, NandC, CDLoopLines; // Control variables
	int dig1, dig2;
	//Begins program loop
	do {
		//Sets error variable to "no error"
		error = 0;
		//Begins error loop
		do {
			//Asks user to input desired details and puts responses into corrosponding variables
			printf ("enter number of rows (width)\n");
			scanf("%d", &Width);
			printf ("enter number of columns (height) \n");
			scanf("%d", &Height);
			printf ("enter number of rows (depth) \n");
			scanf("%d", &Depth);
			printf ("enter the size of the winning line (insure this is less than each of the sides) \n");
			scanf("%d", &SizeOfWL);
			//Checks that smallest value is equal or greater than length of winning line
			if (Width > Height)
			{
				if(Height > Depth)
				{
					if(Depth < SizeOfWL)
					{
						error = 1;
					}
				}
			}
			if (Height > Depth)
			{
				if(Depth > Width)
				{
					if(Width < SizeOfWL)
					{
						error = 1;
					}
				}
			}
			if (Depth > Width)
			{
				if(Width > Height)
				{
					if(Height < SizeOfWL)
					{
						error = 1;
					}
				}
			}
		} while (error > 0);
		//Calles dinemtion calculator on each combination of sides
		D1WL = D_Grid(Height,Width,SizeOfWL);
		D1WL = (D1WL * Depth);

		D2WL = D_Grid(Width,Depth,SizeOfWL);
		D2WL = (D2WL * Height);

		D3WL = D_Grid(Depth,Height,SizeOfWL);
		D3WL = (D3WL * Width);

		//Uses dig function to calculate correct winning lines and Cross dimention function to calculate how 			//many times to use it.
		dig1 = Dig(Height,Width,SizeOfWL);
		CD1WL = CrossDGrid(Depth, dig1, SizeOfWL);

		dig2 = Dig(Height,Depth,SizeOfWL);
		CD2WL = CrossDGrid(Width, dig2, SizeOfWL);
		//Adds together cross dimention lines
		CDWL = (CD1WL + CD2WL);
		//Adds up all the totals
		TotalWL = (D1WL + D2WL + D3WL + CDWL);
		TotalWL = (TotalWL * 2);
		TotalWL4 = (TotalWL * 2);
		//Displays output to user
		printf("When noughts and crosses is played on a ");
		printf("%d", Height);
		printf(" x ");
		printf("%d", Width);
		printf(" x ");
		printf("%d", Depth);
 		printf(" grid \nand the size of the winning line is ");
		printf("%d\n", SizeOfWL);
		printf("The number of possible wining lines is \n(Straight X's or O's) - ");
		printf("%d\n", TotalWL);
		printf("The number of possible wining lines is \n(Straight X's or O's or alternating) - ");
		printf("%d\n", TotalWL4);
		//Sets the exit value to 0 ("reuse program")
		//Then askes the user to input based on if they want to repeat the program or not
		//This input is then set to variable ExitControl
		ExitControl = 0;
		printf("\nTo Exit program type 1 then select enter, to continue type 0 select enter \n");
		scanf("%d", &ExitControl);
	//Loops if the user wants to reuse the program
	} while (ExitControl < 1);
}

int D_Grid (int y, int z, int n)
{
	int HWL, VWL,DWL; // Horizontal, vertical, diagional winning lines variable
	int TWL; // Total winning lines

	HWL = (y*((z-n)+1)); //Horizontal winning lines
	VWL = (z*((y-n)+1)); //Vertical winning lines
	DWL = (2 * ((HWL/y) * (VWL)/z)); //diagional winning lines
	TWL = (HWL + VWL + DWL); //total winning lines
	//Return total
	return TWL;
}

int Dig (int y, int z, int n)
{
	int HWL, VWL,DWL; // Horizontal, vertical, diagional winning lines variable

	HWL = (y*((z-n)+1)); // Horizontal winning lines
	VWL = (z*((y-n)+1)); //Vertical winning lines
	DWL = (2 * ((HWL/y) * (VWL)/z)); //diagional winning lines
	//Return diagional winning lines
	return DWL;
}

int CrossDGrid (int u, int d, int n)
{
	int Horizontal, CDLines; //winning lines to calculate diagonals

	Horizontal = ((u-n)+1); //((Hight - Winning line length) +1) =  number of times to run the loop
	CDLines = (d * Horizontal); // total of the above result run the correct ammount of times
	//Return total
	return CDLines;
}