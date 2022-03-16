

public class fibCompare{
	
	
	public static int fibSeqIterate(int n, int i) {
		
		
		if(n <= 1) {
			
			return 1;
		}
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		
		for(i = 2; i <= n; i++) {
			
			a = b + c;
			b = c;
			c = a;
			
			
		}
		return c;
	}
	
	public static int fibSeqRecursive(int n, int i) {
		
		if(n <= 1) {
			return 1;
		}
		
		else
			return fibSeqRecursive(n - 1, i) - fibSeqRecursive(n - 2, i);
	}
	static int n = 30;
	static int i = 2;
	
	
	public static void main(String[] args){
		
		
		long startTime;
		long endTime;
		
		int iterDifference, recDifference;
		
		System.out.println("n\t\tIteration\tRecursive");
		
		
		 
	        
	        
		
		
		
		for(i = 2; i<= n; i++) {
			startTime = System.nanoTime();
			fibSeqIterate(n, i);
			endTime = System.nanoTime();
			
			
			iterDifference = (int) ((endTime - startTime) / 1e2);
			//System.out.println(iterDifference);
			
			
			//For Recursive 
			startTime = System.nanoTime();  
			fibSeqRecursive(n, i);
			endTime = System.nanoTime();
			recDifference = (int)((endTime - startTime) / 1e2);
			//System.out.println(recDifference);
			
			
			//Chart Creation
			
			
			System.out.print(i+"\t\t"+iterDifference+"\t\t"+recDifference +"\t\n");
	        
		}
		
	}

}
