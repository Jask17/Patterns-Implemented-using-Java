package patterns;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a value for no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(cst%2==0) {System.out.print("  ");}
				else {System.out.print(" *");}
				cst++;
			}
			
		System.out.println();
		row++;
		nst=nst+2;
		nsp--;
		}

	}

}
