import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
public class ConcertTickets {
	
	
	//Use the Linked List (Original Line) and a Queue (waitlist)
	LinkedList<String> line = new LinkedList<String>();
	Queue<String> waitList = new LinkedList<String>();
	
	//add an arrayList of strings called list of People
	ArrayList<String> listOfPeople = new ArrayList<String>();
	//create a constructor with a parameter that receives the listOfPeople from the test harness 
	
	public ConcertTickets(ArrayList<String> listOfPeople) {
		
		this.listOfPeople = listOfPeople;
	}
	//Create method insertIntoLine(Person p)
	public void insertIntoLine(String p) {
		this.listOfPeople.add(p);
		
	}
	public void insertInFront(String p) {
		this.listOfPeople.add(0, p);
		
	}
	public void removeFromLine(String p) {
		this.listOfPeople.remove(p);
		
	}
	public String listOfTicketHolders() {
		
		this.listOfPeople.toString();
		String f = "";
		String j = "";
		
		for(int i = 0; i < 10; i++) {
			j = this.listOfPeople.get(i);
			line.add(j);
			
			f= f + " " + j;
			
		}
		return line.toString();
		
	}
	public String printWaitlist() {
		this.listOfPeople.toString();
		
		String f = "";
		String j = "";
		
		for(int i = 10; i < this.listOfPeople.size(); i++) {
			j = this.listOfPeople.get(i);
			waitList.add(j);
			
			
			f= f + " " + j;
			
		}
		return waitList.toString();
	}
	
	
	
	
	//Create method removeFromLine(Person p)
	
	
	
	//Create method addToWaitList(Person p)
	
	
	
	
}
