import java.util.Random;
import java.util.Scanner;

public class ExamFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Random ran = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("몇 번 반복 할까요?");
		
		int count = input.nextInt();
		
		int digit1, digit2;
		
		for(int i=0; i<count;i++) {
			digit1 = ran.nextInt(6)+1;
			digit2 = ran.nextInt(6)+1;
			sum += digit1;
			sum += digit2;
			System.out.print("(" + digit1+", " + digit2 + ")");
		}
		System.out.println(" ");
		System.out.println(count + "회 반복의 합은 " + sum);
	}

}
