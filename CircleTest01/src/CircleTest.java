
public class CircleTest {

	public static void main(String[] args) {
		Point p1 = new Point(5,10);	//객체 생성
		Point p2 = new Point(7,12);	//객체 생성
		Circle c1 = new Circle(p1, 5.0);
		Circle c2 = new Circle(p2, 10.0);
		
		c1.calcArea(c1.radius);
		c2.calcArea(c2.radius);
		
		p1.printPoint();
		c1.printCircle();
		c1.printArea();
		c2.printCircle();
		c2.printArea();
		
	}

}
