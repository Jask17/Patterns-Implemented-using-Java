package patterns;

import java.util.Scanner;

public class P33 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int ntp=10;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			int cst=1;
			ntp=ntp-1;
			while(cst<=nst)
			{	
			    if(cst<nst/2+1)
				{
					System.out.print("\t"+(++ntp));
				}
			    else if(cst==row) {ntp=0;System.out.print("\t"+ntp);ntp=10;}
				else
				{
					System.out.print("\t"+(--ntp));   	
				}
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
			nst=nst+2;
			ntp--;
		}
		// TODO Auto-generated method stub

	}

}
