
public class Mng extends Emp {
	int bonus=10000;
	Mng(String n, String a, String r, int s, int b) {
		super(n, a, r, s);
		this.bonus = b;
	}
	
	public void printMng() {
		System.out.println("์ด ๋งค๋์ " + this.name);
	}

}
