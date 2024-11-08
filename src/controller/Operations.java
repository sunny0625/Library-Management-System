package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Book;
import model.Functionality;
import model.Library;

public class Operations implements Functionality {

	Book.User u = new Book.User();
	HashMap<String, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	Library lb = new Library();
	boolean isLogin;
	
	public void createAccount() 
	{
		System.out.println("enter the name");
		String name = sc.next();

		if (!map.isEmpty()) {
			if (map.containsKey(name))
				System.out.println("your account is already exist");
			else {
				System.out.println("oop's something went wrong");
			}
		}

		else {
			System.out.println("enter the password");
			String password = sc.next();
			Book.User u1 = new Book.User(name, password);
			map.put(name, password);
			System.out.println("Account is created successfully");
		}
	}
	
	public boolean login()
	{
		System.out.println("enter the username");
		String name=sc.next();
		System.out.println("enter the password");
		String password = sc.next();
		if(map.isEmpty()) {
			System.out.println("you dont have an account");
			return false;
		}
		
		else if(map.containsKey(name) && map.containsValue(password)) {
			System.out.println("logged in successfully");
			return true;
		}
		else 
			return false;
	}
	
	

	public void donateBooks()
	{
		if(!isLogin)
		{
			System.out.println("please login to donate the book");
			if(map.isEmpty())
				System.out.println("you dont have an account please create");
			else if(!login())
				System.out.println("invalid credential");
			else
				isLogin=true;
		}
		if(isLogin)
		{
			System.out.println("enter the book id");
			int id = sc.nextInt();
			System.out.println("enter the book name");
			String name=sc.next();
			Book b = new Book(id,name);
			this.lb.setAvailable(b);
			System.out.println("Thank you for your donation");
		}
			
	}
	
	public void showBooks()
	{
		if(!isLogin)
		{
			System.out.println("please log in to fetch the details");
			if(login())
				isLogin=true;
			else
				System.out.println("Invalid credential");
		}
		if(isLogin)
			System.out.println(lb.getAvailable());
	}
	
	public void issueBook()
	{
		if(!isLogin)
		{
			System.out.println("please log in to issue a book");
			if(login())
				isLogin=true;
			else
				System.out.println("invalid credential");
		}
		
		if(isLogin)
		{
			System.out.println("enter the book id");
			int id = sc.nextInt();
			System.out.println("enter the book name");
			String name=sc.next();
			Book temp = new Book(id,name);
			if(lb.getAvailable().contains(temp))
			{
				lb.getAvailable().remove(temp);
				u.getLb().add(temp);
				System.out.println("Book is successfully issued");
				System.out.println(u.getLb());
			}
			else
				System.out.println("This books is not available");
		}
	}
	
	public void returnBook()
	{
		if(!isLogin)
		{
			if(login())
				isLogin=true;
		}
		
	   if(isLogin)
	   {
		   System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the book name");
			String name=sc.next();
			Book b = new Book(id,name);
			if(u.getLb().contains(b))
			{
				lb.getAvailable().add(b);
				u.getLb().remove(b);
				System.out.println("successfully returned..!!! "+lb.getAvailable());
			}
	   }
		
	}
}
