package assignment;
/*Problem Statement  – 
 * In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets,
 *  and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme.
 *   The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.
Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.
  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
The ticket cost should be printed exactly to two decimal places.
Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:
Ticket cost:4065.25
Sample Input 2:
Enter the no of ticket:1
Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets
*/

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfTickets;
		double total = 0;
		double cost;
		String refreshment;
		String coupon;
		String choiceOfClass;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no of ticket:");
		numberOfTickets = s.nextInt();

		if (numberOfTickets < 5 || numberOfTickets > 40) {
			System.out.println("Minimum of 5 and Maximum of 40 tickets");
			System.exit(0);
		}

		System.out.println("Do you want refreshment:");
		refreshment = s.next();

		System.out.println("Do you have coupon code:");
		coupon = s.next();

		System.out.println("Enter the circle:");
		choiceOfClass = s.next();

		if (choiceOfClass.charAt(0) == 'k')
			cost = 75 * numberOfTickets;
		else if (choiceOfClass.charAt(0) == 'q')
			cost = 150 * numberOfTickets;
		else {
			System.out.println("Invalid Input");
			return;
		}
		total = cost;

		if (numberOfTickets > 20)
			cost = cost - ((0.1) * cost);
		total = cost;

		if (coupon.charAt(0) == 'y')
			total = cost - ((0.02) * cost);

		if (refreshment.charAt(0) == 'y')
			total = total+(numberOfTickets * 50);

		System.out.format("Ticket cost:%.2f", total);
	}

}
