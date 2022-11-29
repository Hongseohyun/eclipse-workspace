import java.util.Scanner;

public class ExamWhile01 {

	public static void main(String[] args) {
		int x,y,r;
		int repeat=0;
		System.out.println("두개의 정수를 입력하시오(큰수 작은수):");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		
		while(y != 0) {
			r = x % y;
			x = y;
			y = r;
			repeat++;
		}
		System.out.println("최대 공약수는 " + x + ", 반복회수는 " + repeat);
	}

}
