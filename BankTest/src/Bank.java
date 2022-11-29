
class Bank {
	public double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank {
	public double getInterestRate() {
		return 10.0;
	}
}
class NormalBank extends Bank {
	public double getInterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank {
	public double getInterestRate() {
		return 3.0;
	}
}
class BestBank extends Bank {
	@Override	
	public double getInterestRate() {
		return 1.0;
	}
}

