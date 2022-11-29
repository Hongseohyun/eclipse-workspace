import java.util.Random;
public class Exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();                              //랜덤 변수
		int[] wasDigit = new int[6];  
		for(int i=0;i<wasDigit.length;i++) {
			int r = ran.nextInt(45)+1;
			wasDigit[i] = r;
			for (int j=0;j<i;j++) {
				if(wasDigit[j] == r) {
					i--;
				}
			}
		}
		for(int i=0;i< wasDigit.length; i++) {
			System.out.println(wasDigit[i]);
		}
	}
}