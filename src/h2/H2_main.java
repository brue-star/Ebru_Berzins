package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		int j = 4;
		int k = 9;
		
		int min = i;
		if (j < min) min=j;
		if (k < min) min = k;
		
		
		int max = i;
		if (j > max) max = j;
		if (k > max) max = k;
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	

	}

}
