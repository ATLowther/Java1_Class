//Austin Lowther 2130268
package lowther9and10;

/* 
 *	Class TestBook
	This class needs a main method and two more methods.
	In main:

	create an array capable of holding six Book objects.
	use the parameterized constructor to specify the data in the first four elements of this array
	use the no-arg constructor to create the two remaining books in the array.  
	process the array with a foreach loop to display the array at this point.
	call the finishArray() method with the array as the only argument.
	call the reduceBooks() method with the array as the sole argument.
	repeat the code needed by Step 4 above.
	display the most expensive book after the discounts.
	In finishArray():

	this is a void method.
	use the setter methods to specify the data in all fields of the last two books in the array.
	In reduceBooks():

	this method returns a Book instance.
	use a loop (any type) to reduce the price of every book in the array by 40%.
	determine the most expensive book after the discounts and return this book to main.
 */

public class TestBook {

	public static void main(String[] args) 
	{
		//Define array of type Book and fill in first four out of six books.
		Book[] books = new Book[6];
		books[0] = new Book("Java Programming", "Liang", 1320, 145.00);
		books[1] = new Book("Horton Hears a Who!", "Dr. Seuss", 72, 19.99);
		books[2] = new Book("The Hobbit", "Tolkien", 320, 9.25);
		books[3] = new Book("Born a Crime", "Noah", 304, 17.33);
		books[4] = new Book();
		books[5] = new Book();

		//for each loop printing the value of each data member of each object Book
		for(Book e: books)
		{
			System.out.println(e.toString());
		}
		
		//add values to the last two objects of type Book in the array
		finishArray(books[4], "Dark Territory", "Kaplan", 352, 18.73);
		finishArray(books[5], "Born to Run", "Springsteen", 508, 20.28);
		
		//grab object Book that has the most expensive book within the array
		Book a = reduceBooks(books);
		
		//print all values again after final additions and discount.
		System.out.println();
		System.out.println("Books after completing library and 40% discount");
		for(Book e: books)
		{
			System.out.println(e.toString());
		}
		
		//print which was the most expensive and total size of library.
		System.out.println();
		System.out.println("Here is the most expensive book after the discounts");
		System.out.println(a.toString());
		System.out.println("Size of library: " + (Book.numBooks - 1) + " books");

	}
	
	//Gives values to each data member of object Book
	public static void finishArray(Book books, String title, String author, int pages, double price)
	{
		books.setTitle(title);
		books.setAuthor(author);
		books.setPages(pages);
		books.setPrice(price);
	}
	
	//for each loop through array of object Book to find which book is the most expensive. Set price of all books to 40% off.
	public static Book reduceBooks(Book[] books)
	{
		Book a = new Book();
		double mostExpensiveBook = 0;		
		for(Book e: books)
		{
			e.setPrice(e.getPrice() * .6);
			if (e.getPrice() > mostExpensiveBook)
			{
				mostExpensiveBook = e.getPrice();
				a = e;
			}		
		}
		return a;
	}

}