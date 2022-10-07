package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		int [] entier = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(entier[0]);
		System.out.println("La longueur du tableau est: "+entier.length);
		System.out.println("Dernier élément du tableau: "+entier[entier.length -1]);
		
		entier[4]=entier[8];
		
		System.out.println(entier[4]);
	}
}
