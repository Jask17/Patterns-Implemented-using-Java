package patterns;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) 
	{
		System.out.println("Enter no of Stars you want in a row");
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
	
		while(row<=n)
		{
			int csp=0;
			while(csp<nsp)
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
	    System.out.println();
		row++;	
		nst--;
		nsp=nsp+2;
		}
		
		// TODO Auto-generated method stub
      scn.close();
		
	}
	

}
