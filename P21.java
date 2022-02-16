package patterns;

import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsta=0;
		int nsp=2*n-1;
		int nstb=0;
		int ntp=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print("\t*");
				cst++;
				
			}
			int csp=1;
			while(csp<=nsp)
			{
				if(csp==1||csp==nsp) {System.out.print("\t*");}
				else { System.out.print("\t");}
				csp++;
				
			}
			cst=1;
			while(cst<=nstb)
			{
				System.out.print("\t*");
				cst++;
			}
		
			
		System.out.println();
		row++;
		nsta++;
		nsp=nsp-2;
		nstb++;
		
		
		}
		// TODO Auto-generated method stub

	}

}
