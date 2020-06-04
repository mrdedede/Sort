public class SimpleSort {
	/**
	 * This file implements an application that
	 * takes an int array in which has basically 3 different kinds of
	 * elements within (in this case, 0, 1 and 2) and sorts it in a way
	 * that elements show up in crescent order (from 0 to 2) . 
	 * 
	 * @author André Filho
	 * @since 2019-08-30
	 * @version 1.0
	*/
	static void swap(int[] a, int b, int c) {
		/*  Parameters: An int array and 2 for its indexes
		 *  Goal: To swap the position of the two elements
		 */
		int for_now = a[b];
		a[b] = a[c];
		a[c] = for_now;
	}
	public static void main(String[]args) {
		/*
		 * How does that work?
		 * 		We will create two varibles with coordinates. One of them will represent the position of the last smallest element (i)
		 *		and the other one will represent the position of the first biggest element (j).
		 *  		smallest element and another for the first biggest element.
		 * 		As we walk through the array, if we notice an element that is from the same group as the smallest ones,
		 *		we swap its position with the element at i+1 and update its position.
		 *		The same goes for the biggest ones, but in this case, we swap with the element at (j-1).
		 *		We will also repeat the same analysis for the same
		 * 		index once swapped, because we don't want to lose values that, for some
		 * 		reason may be at the former position of one of those variables.
		 * 		
		 * 		Once we are at the same position as the first element of the biggest,
		 * 		we won't need to worry about sorting anymore, it's already been sorted.
		 * 
		 * 		The complexity of this algorithm is O(n)
		 */
		int[] a = {1, 0, 0, 2, 1, 0, 0, 2, 0, 1, 2}; //An int array. You can place any array made up 0, 1 and 2 here.
		int k = a.length - 1; int j = 0; //Those are the positions of the first biggest and the last smallest, respectively
		for(int i = 0; i <= k; i++) {
			if(a[i] == 0) { //Smallest
				swap(a, i, j);
				j++; //Update the variable
			}
			else if(a[i] == 2) { //Biggest
				swap(a, i, k);
				k--; //Update the variable
				i--; //Repeat
			}
		}
		for(int i = 0; i <= a.length - 1; i++){
			System.out.print(a[i]); //Simple print just to show the results to the user.
		}
	}
}
