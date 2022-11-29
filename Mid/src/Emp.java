
public class Emp {
	String name,add,rnn;
	int sal;
	
	Emp(String n,String a, String r, int s){
		this.name = n;
		this.add = a;
		this.rnn = r;
		this.sal = s;
	}
	public void printEmp() {
		System.out.println("직원이름"+this.name);
	}
}
