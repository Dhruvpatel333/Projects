

public class AnimalMain {

	
	public static void main(String[] args)throws InterruptedException{
		Food apple = new Food();
		Animal rabbit = new Animal("Thomas", 0, 5, 150, apple);
		Animal turtle = new Animal("Blastoise", 0, 3, 100, apple);
		
		Thread tTurtle = new Thread(turtle);
		Thread tRabbit = new Thread(rabbit);
		
		//Food Object
		
		
		System.out.println("The contestants are " + rabbit.name + " and " + turtle.name);
		
		tTurtle.setDaemon(false);
		tRabbit.setDaemon(false);
		tRabbit.start();		
		tTurtle.start();

		
	}
}
