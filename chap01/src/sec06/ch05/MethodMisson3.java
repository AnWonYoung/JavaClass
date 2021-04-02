package sec06.ch05;

public class MethodMisson3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10); // sum :
		sumAllFromTo(2, 4);
		sumAllFromTo(4, 2);
	}

	public static void sumAllFromTo(int n1, int n2) {
		int sum = 0;
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
		} else if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
	}

}
