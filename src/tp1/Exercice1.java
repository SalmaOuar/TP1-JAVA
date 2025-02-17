package tp1;

public class Exercice1 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 3, 2, 1 };
		int unique = 0;

		for (int num : numbers) {
			unique ^= num;
		}

		if (unique != 0) {
			System.out.println("Le nombre unique est: " + unique);
		}
	}
}
