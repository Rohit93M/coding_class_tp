package collections;

public class Prayers {
	String day;
	String god;
	int num;

	public Prayers(String day, String god, int num) {

		this.day = day;
		this.god = god;
		this.num = num;
	}
    public String toString() {
    	 return "["+day+","+god+","+num+"]";
    }
}
