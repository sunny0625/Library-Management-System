package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private int bid;
	private String bname;
	public Book(int bid,String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}

	public int getBid() {
		return bid;
	}

	public String getBname() {
		return bname;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Book b = (Book)obj;
		return this.bid==b.bid && this.bname.equalsIgnoreCase(b.bname);
	}

	public static class User {

		private String name;
		private String pass;
		private List<Book> lb = new ArrayList<>();

		public String getName() {
			return name;
		}

		public String getPass() {
			return pass;
		}

		public List<Book> getLb() {
			return lb;
		}

		public User() {

		}

		public User(String name, String pass) {
			this.name = name;
			this.pass = pass;
		}


	}
}
