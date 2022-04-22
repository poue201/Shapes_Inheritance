class Book{
	
	private String name;
	private String author;
	private double price;
	
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getBookDetails() {
	
		return this.name + this.author + this.price; 
		//return "name: " + this.name + " ; author: " + this.author + " ; price: " + this.price;
	}
}