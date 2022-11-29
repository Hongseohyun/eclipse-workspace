
public class Car {
	String color;
	int gear,speed;
	double rf;
	
	public double Rf(double d) {
		return d/rf;
	}
	public void PrintRf(double d) {
		System.out.println("이차의 연비는 "+ Rf(d));
	}
	public void SpeedUp() {
		speed=speed+1;
	}
	public void SpeedDown() {
		speed=speed-1;
	}
	public void changeCarGear(int CarGear) {
		gear=gear+1;
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.rf=20;
		c1.PrintRf(200);
	}

}
