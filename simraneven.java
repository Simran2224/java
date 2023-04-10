
package sj;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.print("enter the number");
		int a=S.nextInt();
		if(a%2==0)
		{
			System.out.println("even"+a);
		}
		else
		{
			System.out.println("odd"+a);
		}
	}

}
