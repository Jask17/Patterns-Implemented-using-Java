package patterns;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		System.out.println("Enter no of Stars you want in a row");
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int row=1;
		int nst=n;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("* ");
			cst++;	
			}
         System.out.println();
		row++;	
		}
		
		// TODO Auto-generated method stub
      scn.close();
	}

}
