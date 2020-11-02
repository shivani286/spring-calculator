package com.spring.StringCalculator;

// Assignment by Incubyte Software Craftsperson Team Member (Kaushal Rohit , Astart_rowshay Vadher)

/*Input:{{ 1 2 3 4 
 * 		 5 6 7 8 
 * 		 9 10 11 12 
 * 		 13 14 15 16 }}
 * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 * Explanation: The output is matrix in spiral format.
 * 
 */

 /* 
 *  @author Shivani Thakur
 */
public class TwoDProblem {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4},{ 5, 6, 7, 8},{ 9, 10, 11, 12},{ 13, 14, 15, 16 } };

		printSprialFormat(matrix,4,4);
	}

	private static void printSprialFormat(int[][] matrix,int row, int col) {

		int i,start_row=0,start_col=0;
		
		int last_row = row-1; // if row start_row start with 0 index then row-1 is 3 last_row index
		int last_col=col-1;   // if col start_col start with 0 index then col-1 is 3 last_col index
		
		
		/* when we are going to print the martix in sprial form so start_row should not go beyond last_row and 
		   start_col should not go beyond last_col*/
		while(start_row <= last_row && start_col <= last_col) { 
			
			/*Step 1:
			 	* This for loop printing the first row  with :
			 	* 1) start_row index constant and i index change value 
			 	* 2) start_row increment for next row of matrix
			 */			
			for(i=start_col;i<=last_col;i++) {
				System.out.println(matrix[start_row][i]);
			}
			start_row++;
			
			/*Step 2:
				* This for loop printing the last column with :
			 	* 1) start row increment so start print next row last column
			 	* 2) last_col index constant and i index change value 
			 	* 3) As last print now last_col decrement 
			*/			
			for(i=start_row;i<=last_row;i++) {
				System.out.println(matrix[i][last_col]);
			}
			last_col--;			
			
			/*Step 3:
 				* 1) Confirm start_row has it not gone last_row(if condition)
 				* 2) Print last_col to start _col(last_row index constant and i index change value )
 				* 3) As last print now last_row decrement 
 			*/			
			if(start_row <= last_row) {
				for(i=last_col;i>=start_col;i--) {
					System.out.println(matrix[last_row][i]);
				}
				last_row--;
			}
			
			/*Step 4:
				* 1) Confirm strat_col has it not gone beyond last_col(if condition)
				* 2) Print last_row to start_row(last_row index constant and i index change value )
				* 3) As last column print now start_col increment  to inner matrix 
			*/
			if(start_col <= last_col) {
				for(i=last_row;i>=start_row;i--) {
					System.out.println(matrix[i][start_col]);
				}
				start_col++;
			}
		}		
	}
}
