import java.util.Scanner;

public class ExamWhile02 {

	public static void main(String[] args) {
		int score;
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("성적을 입력하세요: ");
			score = input.nextInt();
			
			if (score >=95) {
				System.out.println(score + "학점은 A+입니다.");
			}else if(score >=90){
				System.out.println(score +"학점은 A0입니다.");	
			}else if(score >=85){
				System.out.println(score +"학점은 B+입니다.");
			} else if(score >=80){
				System.out.println(score +"학점은 B0입니다.");
			}else if(score >=75){
				System.out.println(score +"학점은 C+입니다.");
			} else if(score >=70){
				System.out.println(score +"학점은 C0입니다.");
			}else if(score >=65){
				System.out.println(score +"학점은 D+입니다.");
			}else if(score >=60){
				System.out.println(score +"학점은 D0입니다.");
			} else if(score > 0) {
				System.out.println(score +"학점은 F입니다.");
			}	
		} while (score != 0);
		System.out.println("학점 조회를 종료합니다.");
		input.close();
	}
}
