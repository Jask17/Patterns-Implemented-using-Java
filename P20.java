package patterns;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows till you want your pattern");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nspa=n-4;
		int nspb=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nspa)
			{
				System.out.print("  ");
				csp++;
			}
			csp=1;
			while(csp<=nspb)
			{
				if (csp==1|| csp==nspb) { System.out.print(" *");}
				else { System.out.print("  ");}
				csp++;
				
			}
		
			System.out.println();
			row++;
			if (row>(n/2)+1) { nspa++;nspb=nspb-2;}
			else { nspa--;nspb=nspb+2;}
		}
		// TODO Auto-generated method stub

	}

}
