
public class Car {

	String color, brand, output;
	int speed, gear;
	double ratioFuel;
	
	public double calcRatioFuel(double distance) {

		
		return distance/ratioFuel;

	}
	
	public void screenPrint() {
		System.out.println(color + " " + brand + " " + output + " 현재 속력은 "+  speed + "km/h" );
	}
	public void printFuelRatio(double distance) {
		System.out.println(color + " " + brand + "가 "+distance +"km를 주행하며 사용하는 연료양은 "+calcRatioFuel(distance)+"L이다.");
	}
	
	
	public void speedUP() {
		speed = speed + 5;
	}
	
	public void speedDown() {
		speed = speed - 5;

	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color="빨간색";
		c1.brand="마티즈";
		c1.output="800cc";
		c1.speed=50;
		c1.gear=3;
		c1.ratioFuel=13.4;
		c1.speedUP();
		c1.speedUP();
		//c1.screenPrint();
		c1.printFuelRatio(110.0);
		
		Car c2 = new Car();
		c2.color="파란색";
		c2.brand="그랜저";
		c2.output="3000cc";
		c2.speed=100;
		c2.gear=4;
		c2.ratioFuel=6.2;
		c2.speedDown();
		//c2.screenPrint();
		c2.printFuelRatio(110.0);
		
	}

}
