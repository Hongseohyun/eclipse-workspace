
public class ExamRandom01 {

	public static void main(String[] args) {
		int[][] myArray = {
				{20, 45, 62, 13},
				{55, 90, 23, 26},
				{84, 11, 90, 35}
		};
		
		for(int i=0;i<myArray.length; i++) {
			for(int j=0;j<myArray[i].length; j++) {
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
	}

}
