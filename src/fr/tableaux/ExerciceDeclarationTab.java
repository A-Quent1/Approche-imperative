package fr.tableaux;

public class ExerciceDeclarationTab {
	
	public static void main(String[] args) {
		
		short[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};
		
		
		System.out.println(tableau[0]);
		System.out.println(tableau.length);
		System.out.println(tableau[7]);
		System.out.println(tableau[10]); 
		// La commande va échouer car il n'y a que 8 entrées dans le tableau
		// qui sont de 0 à 7
		
		
	}
}
