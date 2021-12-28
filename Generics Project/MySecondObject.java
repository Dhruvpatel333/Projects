
public class MySecondObject <K> extends V_Method{

	int number;
	
	public MySecondObject(K number) {
		
		this.number = (int)number;
	}

	public MySecondObject() {
		
		this.number = 400;
	}
	
	
	@Override
	public int value() {
		
		return number;
	}

	@Override
	public String toString() {
		return "MySecondObject [number=" + number + "]";
	}

	

}
