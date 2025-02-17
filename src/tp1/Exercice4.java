package tp1;

public class Exercice4 {
	public static void main(String[] args) {
		int[] tableau = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] result = trouverSousTableauMax(tableau);
		System.out.println("Sous-tableau maximal : ");
		System.out.print("[ ");
		for (int i = result[1]; i <= result[2]; i++) {
			System.out.print(tableau[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Somme = " + result[0]);
	}

	public static int[] trouverSousTableauMax(int[] tableau) {
		int sommeMax = Integer.MIN_VALUE;
		int debut = 0;
		int fin = 0;
		int sommeActuelle = 0;
		int debutActuel = 0;
		for (int i = 0; i < tableau.length; i++) {
			sommeActuelle += tableau[i];
			if (sommeActuelle > sommeMax) {
				sommeMax = sommeActuelle;
				debut = debutActuel;
				fin = i;
			}
			if (sommeActuelle < 0) {
				sommeActuelle = 0;
				debutActuel = i + 1;
			}
		}
		return new int[] { sommeMax, debut, fin };
	}
}
