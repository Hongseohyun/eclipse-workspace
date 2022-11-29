
public class RandomWalk {

	public static void main(String[] args) {

		int x = 5, y = 5;
		String tile[][] = new String[10][10];
		int steps;
		int direction;
		tile[5][5] = "#";

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (tile[i][j] == null) {
					tile[i][j] = ".";
				}
			}

		}

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

			if (steps % 3 == 0) {
				tile[y][x] = steps + "";
			} else {

				tile[y][x] = "#";
			}
			System.out.println("==============");
			System.out.println(steps + "번째걸음");
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.print(tile[j][i]);
				}
				System.out.println();
			}

		}
	}

}