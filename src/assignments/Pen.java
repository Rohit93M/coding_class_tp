package assignments;

public class Pen implements Comparable<Pen> {
	String brand;
	int price;

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "brand: " +brand+", price: " +price;
	}

	@Override
	public int compareTo(Pen p) {
		// TODO Auto-generated method stub
		if (this.price > p.price) {
			return 1;
		} else if (this.price < p.price) {
			return -1;
		} else
			return 0;
	}
}
