package patterns;

import java.util.Scanner;

public class P29 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int ntp=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			
			int cst=1;
			while(cst<=nst)
			{
				if(cst==1||cst==nst)
				{
				System.out.print("\t"+ntp);
				}
				else
				{
					System.out.print("\t0");
				}
				cst++;
				
			}
			System.out.println();
			row++;
			nsp--;
	        nst=nst+2;
	        ntp++;
		}
		// TODO Auto-generated method stub

	}

}
