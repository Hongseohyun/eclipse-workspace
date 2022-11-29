
public class Circle {
	double radius;
	Point center;
	
	
	Circle(Point p, double r){
		center = p;
		radius = r;
	}
	
	public double calcArea(double r) {
		
		return 3.14*r*r;
		
	}
	public double calcPerimeter(double r) {
		
		return 3.14*2*r;
		
	}
	
	
	public void printCircle() {
		System.out.println("원의 중앙점은 " + "(" + center.x + "," + center.y + ")" + "이고 반지름의 크기는" +radius + "이다.");
	}
	
	public void printArea() {
		System.out.println("원의 면적은 " + calcArea(radius) + "이고 둘레 " + calcPerimeter(radius) + "이다.");
	}
	
}
