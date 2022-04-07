

import java.util.*;


public class threadsPara {
	
	public static int max = 200000000;
	private static int paraSum = 0;
	
	public static synchronized void paraSumAddition(int element) {
		paraSum+= element;
		
	}

	public static void main(String[] args) {
		
		
		//create array with 200 mil random numbers
		
		
		int[] arr = new int[max];
		Random rand = new Random();
		for(int i = 0; i< arr.length; i++) {
			arr[i] = rand.nextInt(10)+1;
		}
		
		
		
		Thread t1 = new Thread (new Runnable() {
			
			int singleSum = 0;
			@Override
			public void run() {
				for(int j = 0; j < arr.length; j++) {
					singleSum += arr[j];
				}
			System.out.println("Total on Single Sum " + singleSum);
				
			}
			
		});
		Thread t2 = new Thread (new Runnable() {
			
			int singleSum = 0;
			@Override
			public void run() {
				for(int j = 0; j < (arr.length / 2); j++) {
					singleSum += arr[j];
				}	
			}
			
		});
		Thread t3 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				for(int j = max/2; j < arr.length; j++) {
					paraSumAddition(arr[j]);
				}
			}
			
		});
		
		
		
		
		try {
			long start = System.currentTimeMillis();
			t1.start();
			t1.join();
			System.out.println("Single Time: " + (System.currentTimeMillis() - start));
			
			
			long paraStart = System.currentTimeMillis();
			t2.start();
			t3.start();
			t2.join();
			t3.join();
			System.out.println("Total ParallelSum " + paraSum);
			System.out.println("ParaSum Time: " + (System.currentTimeMillis() - paraStart));
			
			
		}catch (InterruptedException e){
			e.printStackTrace();
		}

	}

}
