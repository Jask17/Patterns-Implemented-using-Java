package patterns;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value for n");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nst=n;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{ 
				if(row==cst||row+cst==n+1) {System.out.print(" *");}
				else { System.out.print("  ");}
			cst++;	
			}
		
			
		System.out.println();
		row++;
		}
		
		
		// TODO Auto-generated method stub

	}

}
