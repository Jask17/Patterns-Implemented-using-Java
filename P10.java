package patterns;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a valus for n");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=0;
		int nst=n+4;
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
				System.out.print(" *");
				cst++;
			}
				
			row++;
			nst=nst-2;
			nsp++;
				
		    System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
