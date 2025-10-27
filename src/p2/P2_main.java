package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 18;
		boolean b = false;
		if (i > 10) {
			b = true;
		}
		System.out.println("i = " + i + ", b = " + b);

		// Test 2: i = 5, b = false -> erwartet wird: b = false
		i = 5;
		b = false;
		if (i > 10) {
			b = true;
		}
		System.out.println("Test 2 -> 1=" + i + ", b=" + b); // erwartet: false

		// Test 3: i = 5, b = true erwartet: b = true

		i = 5;
		b = true;
		if (i > 10) {
			b = true;
		}
		System.out.println("Test 3 -> i=" + i + ", b=" + b); // erwartet: true

	}

}
