*/
Program: To calculater
@author: Sunita kumari
@Date: 20 oct 2022  
/*
//importing packages
import java.util.*;

//declaring a class
class Calculater
{
	public static void main(String args[])
	{
		//declaring variables
		flot num1,num2;
		int choice;
		
		//intput 2 number
		System.out.println("Enter the two number:");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		
		//menu
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Exit ");
		
		choice=sc.nextInt();
		//switch case
		
		switch(choice)
		{
			case 1:add(num1,num2);
			     break;
			case 2:sub(num1,num2);
			      break;
			case 3:mul(num1,num2);
			       break;
			case 4:div(num1,num2);
		            break;	
			case 5:System.exit(0);
			       break;
			default: System.out.println("Wrong input");

        }			
}


	// end of main
}
// end of class 