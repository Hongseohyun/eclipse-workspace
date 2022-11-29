import java.util.Scanner;

public class ExamFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5;
		int sum =0;
		int[] score = new int[STUDENTS];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<score.length;i++) {
			System.out.println("학생의 성적을 입력하세요");
			score[i]= input.nextInt();
			sum += score[i];
		}
		System.out.println(STUDENTS + "명의 성적의 합은 " + sum + "이며, 그 평균은 " + sum/STUDENTS + "이다.");
	}

}
