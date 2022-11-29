
public class Car {
	String  color, brand, output;
	int speed,gear;
	double rf;
	
	public void printCar() {
		System.out.println(color + brand+ output+ speed+gear );
	}
	
	public double RF(double d) {
		return d/rf;
	}
	
	public void printRF(double d) {
		System.out.println("이 차의 연비는 "+String.format("%.1f",RF(d))+ " 입니다.");
	}
	public void speedUp() {
		speed = speed + 5;
	}
	public void speedDown() {
		speed = speed - 5;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color="red";
		c1.brand="morning";
		c1.output="3000";
		c1.speed=50;
		c1.gear=1;
		c1.rf=13.4;
		c1.printRF(110.0);
		c1.printCar();
		
		Car c2 = new Car();
		c2.color="red";
		c2.brand="morning";
		c2.output="3000";
		c2.speed=50;
		c2.gear=1;
		c2.rf=13.4;
		c2.printRF(110.0);
		c2.printCar();
		
	}

}
