
/*Auto-Boxing is used to convert the primitive type of a variable to the wrapper class. Also 
 * when autoboxing its a way of storing the primitive data type in an object.
 *
 * "Data structures in the Collection framework, such as ArrayList and Vector, 
 * store only objects (reference types) and not primitive types." (https://www.geeksforgeeks.org/wrapper-classes-java/)
 * 
 * The equals method and compareTo methods are needed to search and sort elements of a list, for example the compare to
 * method tells if the values of the list is are equal. When searching for a value in a list, yo are able to use both 
 * equal and compareTo methods. Both can be used with an enhanced for loop.
 * 
*/
//import necessary libraries
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Project{
    public static void main(String[] args) {
    	
    	//Auto-Boxing 
    	
    	Integer jConvo = new Integer(12); 
    	System.out.println(jConvo);
    	
    	int j = jConvo;
    	
    	System.out.println(j);
    	
    	
        //declare arrayList
        ArrayList<String> name = new ArrayList<String>();
        name.add("Bob");
        name.add("Susan");
        name.add("Dhruv");
        name.add("Robert");
        name.add("Alvin");

        System.out.println("\n\nName List\n\n");
        //enhanced for loop to output results
        //for(int i = 0; i<5; i++){
        //    System.out.println(name.get(i));
        //}
        for(String temp : name){
            System.out.println(temp);
        }

        System.out.println("\n\nSorted List\n\n");

        Collections.sort(name);
        //Sort the Names
        for(String temp : name){
            System.out.println(temp);
            
        }  

        //Shuffled List

        System.out.println("\n\nShuffled List\n\n");
        Collections.shuffle(name);
        for(String temp : name){
            System.out.println(temp);
            
        }  
        //Searching for the name Susan
        System.out.println("\n\nThe location of the name Susan is " + name.indexOf("Susan"));
        //Searching for a random name
        System.out.println("The location of the name Albert is " + name.indexOf("Albert\n\n"));
        
        for(String temp : name){
            if(temp.equals("Susan")) {
            	System.out.println("The name Susan is in the list at the index of " + name.indexOf("Susan"));
            	
            }
        }
        Object[] arrayName = name.toArray();
        
        //Printing Array
        System.out.println("\n\nPrinting out the array\n\n");
        
        for(int i = 0; i < 5; i++){
            System.out.println(arrayName[i]);
            
        }  
        //Making into List
        List<Object> list = Arrays.asList(arrayName);
        
        System.out.println("\n\nChanging Array back to List\n\n");
        for(Object temp : list){
            System.out.println(temp);
        }
        
        }
}

