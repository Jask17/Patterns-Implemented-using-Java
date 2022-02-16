package patterns;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value for Rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsta=n-4;
		int nsp=1;
		int nstb=n-4;
		while( row<=n)
		{
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print(" *");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cst=1;
			while(cst<=nstb)
			{
				System.out.print(" *");
				cst++;
			}
			 
		
		System.out.println();
		row++;
		if(row>(n/2)+1) {nsta++;nsp=nsp-2;nstb++;}
		else {nsta--;nsp=nsp+2;nstb--;}
		}
		
		
		// TODO Auto-generated method stub

	}

}
