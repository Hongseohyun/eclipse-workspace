
public class Employee {
	String name;
	String address;
	int salary;
	String rrn;
	
	Employee(String n, String a, int s, String r){
		this.name =n;
		this.address = a;
		this.salary =s;
		this.rrn =r;
		
	}
	
	public void printEmployee() {
		System.out.println("직원의 이름은 " + this.name + "이다.");
	}
}
