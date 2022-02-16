package patterns;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner  scn=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nst=1;
		while(row<=2*n-1)
		{
			int cst=1;
			while(cst<=nst)
			{
			 System.out.print(" *");
			 cst++;
			}
			
		
			row++;
		if(row<=n) {nst++;}
		else {nst--;}
		
		System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
