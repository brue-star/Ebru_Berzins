package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 220;
		int j = 40;
		int k = -10; // Startwert

		System.out.println("e1 (i>j)    = " + (i > j));
		System.out.println("e2 (i>200)  = " + (i > 200));
		System.out.println("e3 (j>100)  = " + (j > 100));

		if (i > j) {
			if (i > 200) {
				if (j > 100) {
					k = 3;
				} else {
					k = 2;
				}
			} else {
				if (j > 100) {

				} else {
					k = 1;
				}
			}
		} else {
			if (i > 200) {

			} else {
				if (j > 100) {
				} else {
					k = 4;
				}
			}
		}

		System.out.println("i=" + i + ", j=" + j + ", k=" + k);
	}

}
