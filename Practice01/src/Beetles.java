
public class Beetles {

	public static void main(String[] args) {
		// 1. 변수
		String[][] tile = new String[10][10];
		int x = 5, y = 5;
		int steps, direction;
		String dot = ". ";
		String hash = "# ";

		tile[5][5] = hash;

		// 2.타일
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (tile[i][j] == null)
					tile[i][j] = dot;
			}
		}

		// 3.걷기

		for (steps = 1; steps <= 20; steps++) {
			direction = (int) (Math.random() * 4);
			if (direction == 0 && x > 0)
				x--;
			else if (direction == 1 && x < 9)
				x++;
			else if (direction == 2 && y > 0)
				y--;
			else if (y < 9)
				y++;

			// 4.3의배수
			if ((steps % 3) == 0) {
				tile[x][y] = steps + "";
			} else {
				tile[x][y] = hash;

			}
		}

		// 5.출력
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(tile[i][j]);
				
			}
			System.out.println();
		}
	}

}
