package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		int a = 1;
		String moi = "Annezo Quentin";
		int b = 100;
		
		for (int i = 1; i <= 10 ; i++) {
			
			System.out.println(a);
			a++;
		}
		
		for (int i = 1; i <= 20 ; i++) {
		
			System.out.println(moi);
		
		}
		
	    for (int i = 1; i <= b; i++) {
	    	
	    	if (i % 2 == 0) {
	    		
	    		System.out.println(i);
	        }
	        
	    }
	    
	    for (int i = 1; i <= b; i++) {
	    	
	    	if (i % 2 == 1) {
	    		
	    		System.out.println(i);
	        }
	        
	    }

	}

}
