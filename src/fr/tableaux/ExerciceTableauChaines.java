package fr.tableaux;

public class ExerciceTableauChaines {
	
	public static void main(String[] args) {
		
		String [] tableauVille = new String [5];
		
		tableauVille[0] = "Paris";
		tableauVille[1] = "Marseille";
		tableauVille[2] = "Lyon";
		tableauVille[3] = "Toulouse";
		tableauVille[4] = "Nice";
		
		for (int i = 0; i < tableauVille.length; i++) {
			
			System.out.println(tableauVille[i]);
		}
		
		System.out.println(tableauVille.length);
		
		tableauVille [3] = "Reims";
		
		for (int i = 0; i < tableauVille.length; i++) {
			
			System.out.println(tableauVille[i]);
		}
	}

}
