package assignment;

import java.util.Scanner;

/*Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year.
 *  The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements.
 *   Check for all the possible output given in the sample snapshot
Note : If any input is negative, the output should be “Input is Invalid”.
  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.
Sample Input 1:
Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:
Highest placement
CSE
Sample Input 2:
Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:
Highest placement
ECE
MECH
Sample Input 3:
Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:
None of the department has got the highest placement
Sample Input 4:
Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:
Input is Invalid
*/
public class Solution4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of students placed in CSE: ");
		int cse = sc.nextInt();

		System.out.print("Enter the no. of students placed in ECE: ");
		int ece = sc.nextInt();

		System.out.print("Enter the no. of students placed in MECH: ");
		int mech = sc.nextInt();

		sc.close();

		if (cse < 0 || ece < 0 || mech < 0) {
			System.out.println("Input is Invalid");
		}
		else{
			if (cse == ece && ece == mech && mech == cse) {
				System.out.println("None of the department has got the highest placement");
			} else if (cse == ece && cse > mech) {
				System.out.println("Highest Placement:");
				System.out.println("CSE");
				System.out.println("ECE");
			} else if (cse == mech && cse > ece) {
				System.out.println("Highest Placement:");
				System.out.println("CSE");
				System.out.println("MECH");
			} else if (ece == mech && ece > cse) {
				System.out.println("Highest Placement:");
				System.out.println("ECE");
				System.out.println("MECH");
			} else if (cse > ece && cse > mech) {
				System.out.println("Highest Placement:");
				System.out.println("CSE");
			} else if (ece > mech) {
				System.out.println("Highest Placement:");
				System.out.println("ECE");
			} else {
				System.out.println("Highest Placement:");
				System.out.println("MECH");
			}
		}

	}
}
