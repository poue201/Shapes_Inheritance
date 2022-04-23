class Circle extends Shape{
	
	private double radius;
	
	public Circle(String name, String colour, double x, double y) {

		super(name, colour, x, y);
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);

	}

	public Point getCenterPoint(} {
		Point centerPoint = new Point(super.getX(), super.getY());
		//I assumed the origin of our circle was our center of circle
		//need to ask Kishore what does th epoint coords in shape class model/represent
	}
}


