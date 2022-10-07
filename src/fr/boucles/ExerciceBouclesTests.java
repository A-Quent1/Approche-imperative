package fr.boucles;

public class ExerciceBouclesTests {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 16;
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Tableau sens ordinaire");
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[a]);
			a++;
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Tableau sens inverse");
		for (int i = array.length ; i > 0; i--) {
			
			System.out.println(array[b]);
			b--;
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Valeur tableau supérieur à 3");
		for (int i = 0 ; i < array.length; i++) {
			
			if (array[i] > 3) {
				
				System.out.println(array[i]);
				
			}	
		}
			
		System.out.println("---------------------------------------------");
		
		System.out.println("Valeur tableau pair");
		for (int i = 0 ; i < array.length; i++) {
				
			if (array[i] % 2 == 0) {
					
					System.out.println(array[i]);
			}
		
	    }
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Valeur tableau index pair");
		for (int i = 0 ; i < array.length; i++) {
			
			if (i % 2 == 0) {
				System.out.println(array[i]);
				
			}
				
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Valeur tableau impair");
		for (int i = 0 ; i < array.length; i++) {
				
			if (array[i] % 2 == 1) {
					
					System.out.println(array[i]);
			}
		
	    }
	}

}
