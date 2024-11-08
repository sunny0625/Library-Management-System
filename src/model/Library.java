package model;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> available = new ArrayList<>();

	public List<Book> getAvailable() {
		return available;
	}

	public void setAvailable(Book b)
	{
		this.available.add(b);
	}
	
	@Override
	public String toString() {
		return "Books: "+ available;
	}
	
	
}
