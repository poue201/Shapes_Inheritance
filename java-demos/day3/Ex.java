class Ex{
	
	public static void main(String[] args) {
	
	Book book1 = new Book("Harry Potter", "JK Rowling", 5.00);
	Book book2 = new Book("The Power of Habit", "Charles Duhigg", 7.99);
	Book book3 = new Book("Grit", "Angela Duckworth", 20.37);
	Book book4 = new Book("Why we do what we do", "Edward L Deci", 18.75);
	/*
	System.out.println(book1.getBookDetails());
	System.out.println(book2.getBookDetails());
	System.out.println(book3.getBookDetails());
	System.out.println(book4.getBookDetails());
	*/
	
	Book[] listOfBooks = {book1, book2, book3};
	//System.out.println(listOfBooks[1].getBookDetails());
	
	for(Book b: listOfBooks ) {
		
			System.out.println(b.getBookDetails());
		}
	}
}

