public class PracticeProblem {

	public static int sumOfDigits(int x) {
		if (x == 0) {
			return 0;
		}

		if (x < 0) {
			x *= -1;
		}

		return (x % 10) + sumOfDigits(x / 10);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		return factorial(n-1)*n;
	}

	public static void main(String args[]) {
		int result = sumOfDigits(222);
		System.out.println(result);

		int result2 = factorial(7);
		System.out.println(result2);
	}

	

}
