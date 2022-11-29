import java.util.Scanner;

public class ExamSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, days;
		Scanner input = new Scanner(System.in);
		
		System.out.println("날수를 알고싶은 월을 입력하세요 :");
		month = input.nextInt();
			
		switch (month) {
		case 4:
		case 5:
		case 9:
		case 11:
			days = 30;
			break;		//스위치 블럭을 빠져나가라
		case 2:
			days = 28;
			break;
		default:
			days = 31;
			break;
		}
		System.out.print(month + "월의 날수는 " + days + "일 입니다.");
	}

}
