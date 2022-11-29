import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width, height, area, perimeter;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형의 가로 값을 입력하세요!");
		width = scan.nextDouble();
		System.out.println("사각형의 세로 값을 입력하세요!");
		height = scan.nextDouble();

		area = width * height;
		perimeter = 2 *  (width + height);
		
		System.out.println("사각형의 가로가 " + width +"사각형의 가로가 " + height + "인 사각형의 면적은" + area + " 이다" + "인 사각형의 둘레는" + perimeter + " 이다");

	}

}
