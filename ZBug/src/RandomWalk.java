
public class RandomWalk {

	public static void main(String[] args) {
		String tile[][] = new String[10][10];
		String hash ="# ";
		String dot = ". ";
		int step, direction;
		
		int x=5, y=5;
		
		for(int i =0; i<10; i++) {
			for(int j =0; j<10; j++) {
				if(tile[i][j]==null)
					tile[i][j]=dot;
			}
		}
		
		for(step=1;step<=20;step++) {
			direction = (int)(Math.random()*4);
			if(direction==0&&x>0)x--;
			else if(direction==1&&x<9)x++;
			else if(direction==2&&y>0)y--;
			else if(direction==3&&y<9)y++;
			
			if(step%3==0) {
				tile[x][y]=step+"";
			}else {
				tile[x][y]=hash;
				
			}
			
		}
		for(int i =0; i<10; i++) {
			for(int j =0; j<10; j++) {
				System.out.print(tile[i][j]);
			}System.out.println();
		}
	}

}
