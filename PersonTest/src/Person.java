
public class Person {
	int age;
	String gender;	//클래스 속성 정의
	String name;
	
	public void screenPrint() {		//메소드
		System.out.println(name + "의 나이는 " + age + " 이다.");

	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person();		//p1, p2 객체 생성. new 라는 생성자를 불러서
		p1.age = 15;
		p1.gender = "남자";
		p1.name = "이순신";
		
		p1.screenPrint();
		
		Person p2 = new Person();
		p2.age = 30;
		p2.gender = "남자";
		p2.name = "세종대왕";
		
		p2.screenPrint();
		
		
	}

}
