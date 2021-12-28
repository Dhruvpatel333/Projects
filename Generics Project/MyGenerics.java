import java.util.*;
public class MyGenerics <K,V>{

	public int partOne(K[] array, int length, K i) {
		
		for(int j= 0; j<length; j++) {
			if(array[j].equals(i)) {
				return j;
			}
		}
		return -1;
	}

	public <K extends V_Method> Object partTwo(K myObj1, K myObj2) {
		
		if(myObj1.value()> myObj2.value())
			return myObj1.toString();
		else
			return myObj2.toString();
		
		
		
	}

}
