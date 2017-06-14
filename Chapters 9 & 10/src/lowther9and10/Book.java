//Austin Lowther 2130268
package lowther9and10;

/* 
 *  Class Book

	has instance data members (all private) String title, String author, int pages, double price.
	has a public static int variable named numBooks with an initial value of zero.
	has a parameterized constructor that will be used to make a Book object and assign values to its data members, and increment numBooks.
	has a no-arg constructor that increments numBooks.
	has getters and setters for all instance data members.
	has a toString() method that returns a string displaying the state of a Book instance.
	Use the numBooks variable to report the number of books instantiated.
 * 
 */

//define instance data members
public class Book {
	private String title;
	private String author;
	private int pages;
	private double price;
	public static int numBooks = 0;
	
	//no-arg constructor, increments numBooks
	public Book()
	{
		numBooks++;
	}
	
	//parameterized constructor setting all values and incrementing numBooks.
	public Book(String title, String author, int pages, double price)
	{
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		numBooks++;
	}
	
	//getters and setters
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}	
	
	//returns a String displaying Book state.
	public String toString()
	{
		return String.format("Book title=" + this.getTitle() + ", author=" + this.getAuthor() + ", pages=" + this.getPages() + ", price = $%.2f", this.getPrice());
	}

}
