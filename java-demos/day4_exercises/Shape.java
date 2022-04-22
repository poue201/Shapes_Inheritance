public abstract class Shape{

	private String name;
	private String colour;
	private double x;
	private double y;
	
	public abstract double getArea();
	public abstract Point getCenterPoint();

	
	public Shape(String name, String colour, double x, double y) {
		
		this.name = name;
		this.colour = colour;
		this.x = x;
		this.y = y;
	}
	
	public void setName(String name){
	
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setColour(String colour){
	
		this.colour = colour;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setX(double x){
	
		this.x = x;
	}
	
	public double getX() {
		
		return this.x;
	}
	
	public void setY(double y){
	
		this.y = y;
	}
	
	public double getY() {
		
		return this.y;
	}
	
	public String toString() {
		return "Name: " + this.name +
		"\nColour: " + this.colour +
		"\nX: " + String.valueOf(this.x) + 
		"\nY: " + String.valueOf(this.y);
	}
	
}