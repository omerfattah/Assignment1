package assignment;

/*
 * Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]
Sample Input 1:
Enter the digits:
65
66
67
68
Sample Output 1:
65-A
66-B
67-C
68-D
Sample Input 2:
Enter the digits:
115
116
101
112
Sample Output 2:
115-s
116-t
101-e
112-p

 * */
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the digits ranging from 65-122 ");

		int a=sc.nextInt();
 		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		char e=(char)a;
		char f=(char)b;
		char g=(char)c;
		char h=(char)d;
		System.out.println("\n\n");
		System.out.println(a+"-"+e);
		System.out.println(b+"-"+ f);
		System.out.println(c+"-"+ g);
		System.out.println(d+"-"+ h);
		
	}

}
