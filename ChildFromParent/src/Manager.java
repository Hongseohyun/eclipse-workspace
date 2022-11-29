
public class Manager extends Employee {
	int bonus;
	
	public Manager(String n,String a, int s, String r, int b) {
		super(n, a, s, r);
		this.bonus = b;
	}
	
	public void printManager() {
		System.out.println("매니저의 이름은 " + this.name + "이다.");
		System.out.println("매니저의 주소는 " + this.address + "이다.");
		System.out.println("매니저의 급여는 " + this.salary + "이다.");
		System.out.println("매니저의 번호는 " + this.rrn + "이다.");
		System.out.println("매니저의 보너스는 " + this.bonus + "이다.");
	}
}
