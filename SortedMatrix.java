
/**
 *  
 * @author devshankhasharm
 * Search in a row wise and column wise sorted matrix
Last Updated: 21-04-2020
Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, 
print “Not Found”. In the given matrix, every row and column is sorted in increasing order. 
The designed algorithm should have linear time complexity.
 * Code taken from ==https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 */


public class SortedMatrix {
	private static void search(int[][] mat, int n, int x) {

		int i = 0, j = n - 1; // set indexes for top right
		// element

		while (i < n && j >= 0) {
			if (mat[i][j] == x) {
				System.out.print("n Found at " + i + " " + j);
				return;
			}
			if (mat[i][j] > x)
				j--;
			else // if mat[i][j] < x
				i++;
		}

		System.out.print("n Element not found");
		return; // if ( i==n || j== -1 )
	}
	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, 
                { 15, 25, 35, 45 }, 
                { 27, 29, 37, 48 }, 
                { 32, 33, 39, 50 } }; 

search(mat, 4, 29); 
	}


}
