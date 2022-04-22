public class Rectangle extends Shape {
	
	private double height;
	private double width;
	
	public Rectangle(String name, String colour, double x, double y, double height, double width ) {
	
		super(name, colour, x,  y);
		
		this.height = height;
		this.width = width;
		
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public Point getCenterPoint() {
		double coordinateX = ( super.getX() + (this.width/2) );
		double coordinateY = ( super.getY() + (this.height/2) );
		Point centerPoint = new Point(coordinateX, coordinateY);
		return centerPoint;
		
	}
	
	public String toString() {
		
		return "Name: " + super.getName() +
		"\nColour: " + super.getColour() +
		"\nX: " + super.getX() + 
		"\nY: " + super.getY() +
		"\nHeight: " + this.height +
		"\nWidth: " + this.width;
		
	}
	
	public boolean isSquare() {
		if( this.width == this.height ) {
			return true;
		}
		return false;
	}
}