
public class MyFirstObject <K>extends V_Method{

	int number;
	
	public MyFirstObject(K number) {
		
		this.number = (int)number;
	}

	public MyFirstObject() {
		
		this.number = 200;
	}
	
	@Override
	public int value() {
		
		return number;
	}

	@Override
	public String toString() {
		return "MyFirstObject [number=" + number + "]";
	}
	
	
}
