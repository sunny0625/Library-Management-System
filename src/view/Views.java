package view;
import java.util.Scanner;

import controller.Operations;
import model.DriverManager;
import model.Functionality;

public class Views {
	
	static Functionality op = DriverManager.getFunctionality();
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		boolean res = true;
		while(res)
		{
			System.out.println("enter the choice: \n1.create account \n2.donate books"
					+ "\n3.issue books  \n4.return books  \n5.show books \n6.login  \n7.exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: op.createAccount();
				        break;
				        
				case 2: op.donateBooks();
				        break;
				        
				case 3: op.issueBook();
				        break;
				
				case 4: op.returnBook();
				        break;
				        
				case 5: op.showBooks();
				         break;
				    
				case 6: op.login();
				        break;
				
				case 7: res=false;
					    break;
					    
			    default: System.out.println("Invalid choice");
			}
		}
		System.out.println("Thank you for using Library management system");
		
	}
}
