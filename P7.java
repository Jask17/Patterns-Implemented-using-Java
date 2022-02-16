package patterns;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Value for n");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nst=n;
	 while(row<=n)
	 {
		 
		 int cst=1;
		 while(cst<=nst)
		 {
			if(row==1||row==n|| cst==1||cst==n)
			{
				System.out.print(" *");
			}
			else {System.out.print("  "); }
			
			cst++;
			
		 }		 
	 
	 System.out.println();
	 row++;
	 
	 }
  
	}

}
