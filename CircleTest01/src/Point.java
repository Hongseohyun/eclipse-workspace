
public class Point {
	 int x,y;	//속성
	
	Point(int a, int b){	//생성자
		x = a;
		y = b;
	}
	
	public void printPoint() {	//출력 메소드
		System.out.println("좌표점은  x좌표는 " + x + "이며 y좌표는 " + y + "이다." );
	}
}
