
public class Animal implements Runnable {

	//declare variables
	String name;
	int position;
	int speed;
	int restMax;
	static  boolean winner = false;
	Food apple;
	
	
	public Animal(String name,int position, int speed,int restMax, Food apple) {
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.restMax = restMax;
		this.apple = apple;
		
		
	}
	//create methods
	

	@Override
	public void run() {
		while((position <= 100) && (winner == false)) {
			//Random number to restMAx
			 
			//sleep ^ the number 
			
			try {
				Thread.sleep((long)(Math.random()*(restMax)));
				//Advance the animal by its speed
				position = position + speed;
				
				if(position < 100)
					apple.eat(name);
				
				if(position >= 100) {
					winner = true;
					System.out.println("The winner is "+ name);
					System.exit(0);
					
				}
				
				if(winner == false) {
					
					System.out.println(name + " is currently running at position " + position);
					
				}
				
					
				
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRestMax() {
		return restMax;
	}
	public void setRestMax(int restMax) {
		this.restMax = restMax;
	}
	
}