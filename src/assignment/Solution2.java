package assignment;

import java.util.Scanner;

/*
 * Question-2
Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.
Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!

 * */
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Consider the following prices :\n\t\tRs.100/pizza\t\t\tRs.20/puffs\t\t\tRs.10/cooldrink\n\n");

		System.out.print("enter the no. of pizza bought : ");
		int a = sc.nextInt();
		System.out.print("enter the no. of puffs bought :");
		int b = sc.nextInt();
		System.out.print("enter the no. of cool drinks bought :");
		int c = sc.nextInt();
		
		
			
		a =Math.abs(a);

		b=Math.abs(b);

		c=Math.abs(c);

		System.out.println("BILL DETAILS..");
		if(a>=0) {
		System.out.println("No of pizza : "+a);
		}
		else {
			System.out.println("Invalid input");
		}
		
		if(b>=0) {
		System.out.println("No. of puffs :" + b);
		}
		else {
			System.out.println("Invalid input");
		}
		
		if(c>=0) {
		System.out.println("No. of cool drinks :" + c);
		}
		else {
			System.out.println("Invalid input : You must buy atleast one order for this item ");
		}
		
		
		System.out.println("Total Price = " + ( a*100 + b*20 + c*10 ));
		

		System.out.println("ENJOY THE SHOW !!!!");
	}

}
