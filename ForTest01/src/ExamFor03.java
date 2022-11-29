public class ExamFor03 {
	public static void main(String[] args) {
		int[] digit = {39,72,55,48,81,14,50,91,7,66};
		int minimum;
		
		minimum = digit[0];
		
		for(int i =1; i< digit.length; i++) {
			if(digit[i]<minimum)
				minimum = digit[i];
		}
		System.out.println("배열에서 가장 작은 값은 " + minimum + "이다.");
	}
}
