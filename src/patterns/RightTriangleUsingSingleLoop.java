package patterns;

public class RightTriangleUsingSingleLoop {
	public static void main(String[] args) {
		String pattern = "";
		int n = 5;
		for (int i = 1; i <= n; i++) {
			pattern = pattern + "*";
			System.out.println(pattern);
		}

	}
}
