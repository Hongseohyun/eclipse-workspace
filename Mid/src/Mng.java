
public class Mng extends Emp {
	int bonus=10000;
	Mng(String n, String a, String r, int s, int b) {
		super(n, a, r, s);
		this.bonus = b;
	}
	
	public void printMng() {
		System.out.println("이 매니저" + this.name);
	}

}
