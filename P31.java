package patterns;

import java.util.Scanner;

public class P31 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nst=n;
		
		while(row<=n)
		{
			int cst=1;
			int ntp=n;
			while(cst<=nst)
			{
				if (cst+row==n+1)
				{
					System.out.print(" *");
				}
				else
				{	
				System.out.print(" "+ntp--);
				}
				cst++;
			}
		System.out.println();
		row++;
	
		}
		// TODO Auto-generated method stub

	}

}
