/*
Program: WAP to print determine oldest and youngest
@author: Sunita kumrari
@Date: 20 oct 2022
*/

//import packages 

import java.util.Scanner;
//declaring a class
class DetermineAge
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		//declaring variables
		float 12,25,45;
		int oldest,youngest,among;

		//taking input
		System.out.println("Enter oldest:");
		oldest= sc.nextInt();
		System.out.println("Enter youngest:");
		youngest= sc.nextInt();
		System.out.println("Enter among3:");
		among= sc.nextInt();

		//checking age 
		if((45>50)&&(25>24))
	     	 System.out.println("The age is :"+oldest);

		else if(num12>14)
			 System.out.println("The age is :"+youngest);

			 else
				 System.out.println("The age is :"+among);


		//end of outer ifelse	


	}

	// end of main
}
// end of class 
