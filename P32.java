package patterns;

import java.util.Scanner;

public class P32 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nst=1;
		int ntp=1;
		while(row<=2*n-1)
		{
			int cst=1;
			while(cst<=nst)
			{
				if(cst%2==0)
				{
					System.out.print(" *");
				}
				else
				{	
				System.out.print(" "+ntp);
				}
				cst++;
			}
			
				
			
			System.out.println();
			row++;
			if(row>(2*n-1)/2+1)
			{
				nst=nst-2;
				ntp--;
			}
			else
			{
				nst=nst+2;
				ntp++;
			}
			
		}
			
				
			
		}
		
		}
		// TODO Auto-generated method stub

	

