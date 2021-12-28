public class Food{

	public synchronized void eat(String name) throws InterruptedException {
		
		if(Animal.winner == false) {
		
			Thread.sleep((long)(Math.random()* 400));
			System.out.println(name + " is eating.");
		}
	}
}

