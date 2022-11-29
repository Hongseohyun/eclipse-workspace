
public class Emp {
	private String name;
	private double sal;
	private static int count =0;
	public Emp(String n, double s) {
		name =n;
		sal=s;
		count++;
	}
	
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}

}
