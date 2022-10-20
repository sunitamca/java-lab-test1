/*
Program: WAP to print the square and cube
@author: Sunita kumari
@Date: 20 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class SquareCubeDemo
{
	
	// method to print the day
	static void printnumber(int n) // formal/dummy arguments
	{	

	   //switch case
	   switch(n)
	   {
		   case 1:System.out.println("square");
		          break;
		   case 2:System.out.println("cube");
		          break;
		   case 3:System.out.println("even or odd");
		          

	   }
	// end of switchcase


	}
	//end of method printDay
	
	//main started
	piblic satic void main(satic args[])
	{
		//creating scanner object
		scanner sc=new scanner(System.in);
		
		System.out.println("Enter number");
		//creating variables
		int num= sc.nextInt();
		
		if (num*num)
			System.out.println("The number "+square");
	}
	
		
	//main started
	piblic satic void main(satic args[])
	{
		//creating scanner object
		scanner sc=new scanner(System.in);
		
		System.out.println("Enter number");
		//creating variables
		int num= sc.nextInt();
		
		if (num*num*num)
			System.out.println("The number "+cube");
	}
	
		
	//main started
	public static void main(String args[])
	{

	   //creating Scanner object
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number:");
		// creating variables
		int num= sc.nextInt();

		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");


	}

	// end of main
}
// end of class 