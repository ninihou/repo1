package Loop;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pattrn D");
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		for (int i = 0, j = 0; (1 + 3 * j) / (2 + 2 * i) < 2; i++, j++) {
//		}
	

	}

}