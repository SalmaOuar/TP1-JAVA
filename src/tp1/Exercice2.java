package tp1;

public class Exercice2 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 2, 3, 5, 7 };
		int sommeCible = 7;

		System.out.println("Les paires dont la somme est " + sommeCible + " sont :");

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == sommeCible) {
					System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
				}
			}
		}
	}
}
