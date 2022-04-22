public class InheritanceEx {

	public static void main(String [] args){
	
		Point p1 = new Point(1, 2);
	
		//System.out.println(p1.toString());
		
		//Shape s1 = new Shape("trapezius", "red", 3.5, 9.7);
		
		//System.out.println(s1);
		
		Rectangle r1 = new Rectangle("rectangle", "blue", 4, 8, 10, 10);
		
		System.out.println(r1);
		System.out.println(r1.getCenterPoint());
		System.out.println(r1.isSquare());
	
	}

}