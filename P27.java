package patterns;

import java.util.Scanner;

public class P27 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			
			int cst=1;
			int ntp=0;
			while(cst<=nst)
			{
				if(cst>nst/2+1)
				{
					System.out.print("\t"+(--ntp));
					
				}
				else
				{
					System.out.print("\t"+(++ntp));
				}
				
				
				
			    
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
	        nst=nst+2;
	        
		}
		// TODO Auto-generated method stub

	}

}
