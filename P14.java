package patterns;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a value for no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=2*n-1)
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
			
		System.out.println();
		row++;
		if(row<=n) { nsp--;nst++;}
		else { nsp++;nst--;}
		
		}

	}

}
