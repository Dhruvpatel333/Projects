
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.util.regex.Pattern;




public class HashFunction {
	
		//Create Static variable for the path	
		private static final String path = 
				"https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
		//Global for start of text analyzer and end
		private static final Integer start = 78;
		private static final Integer end = 244;

		public static void main(String args[]) throws IOException {
			   
			//Create try catch for fileNotFound
			
			try {
			
				URL link = new URL(path);
		        
		        BufferedReader in = new BufferedReader(
		        new InputStreamReader(link.openStream()));
			   //FileReader to read through the html file
			   //FileReader fileRead = new FileReader(path);
			   //Scanning through text 
			   //Scanner scan = new Scanner(fileRead);
			   
			   //Create a Hashmap to keep track of words and iterations of each
			   HashMap<String, Integer> wordIt = new HashMap<String, Integer>();
			   
			   
			   int currentLine = 0;
			   String lineInfo;
			   //Best to put this in a for loop, just left as is 
			   while((lineInfo = in.readLine()) != null) {
				   
				   //System.out.println(lineInfo);
				  
				   currentLine++;

				   if((currentLine >= start) && (currentLine <= end)){
					   		String swabline = lineInfo.toLowerCase();
					   String swabbedLine = swabline.replaceAll("\\<.*?\\>", "")
							   				.replaceAll("—", " ")
							   				.replaceAll("’", "")
							   				.replaceAll("-", " ")
							   				.replaceAll("&emdash", " ")
							   				.replaceAll("&mdash", " ")
					   						.replaceAll("[^a-zA-Z0-9\\s]", "");
					   //System.out.println(swabbedLine);
					   if(swabbedLine.isBlank()){
							   continue;   
					   }
					   //System.out.println(swabbedLine);
					   
					   String[] wordInSent = swabbedLine.split("\\s+");
					   for (String word : wordInSent) {
						   
						   if(wordIt.containsKey(word)) {
							   wordIt.put(word, wordIt.get(word)+1);
						   }
						   else {
							   wordIt.put(word,1);
						   }  
					   }
					   
				   }
				   
			   }
			   
			   Set<Entry<String, Integer>> entrySet = wordIt.entrySet(); 

			   //Creating an ArrayList of Entry objects 

			   ArrayList<Entry<String, Integer>> listOfEntry = 
					 new ArrayList(entrySet);
			   listOfEntry.sort(Comparator.comparing(Entry::getValue));
			   
			   for(Entry aList : listOfEntry.subList(listOfEntry.size()-20, listOfEntry.size())) {
				   System.out.println(aList.getValue()+ " " + aList.getKey());
			   }
			   //System.out.println(wordIt);
			   
			   //scan.close();
			   in.close();
			   
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}	   
		}
}


