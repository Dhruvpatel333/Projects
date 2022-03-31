
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
		
		public static int main(String[] args)throws IOException{
			Scanner reader = new Scanner (System.in);
			int start = reader.nextInt();
			int end = reader.nextInt();
			
			int n = top20(start,end);
			return n;
		}

		public static int top20(int start,int end) throws IOException {
			   
			//Create try catch for fileNotFound
			
			try {
				
				//Create a URL connection of read through the html with Buffered Reader
			
				URL link = new URL(path);
		        
		        BufferedReader in = new BufferedReader(
		        new InputStreamReader(link.openStream()));
			   
		        
			   
			   //Create a Hashmap to keep track of words and iterations of each
			   HashMap<String, Integer> wordIt = new HashMap<String, Integer>();
			   
			   //iterator for what line is being read at the moment
			   int currentLine = 0;
			   String lineInfo;
			   int counter = 0;
			   
			   //checking if the line isnt the end of the html
			   while((lineInfo = in.readLine()) != null) {
				   
				   //System.out.println(lineInfo);
				  
				   currentLine++;
				   
				   //Start of the text analyzer 
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
					   
					   //If the end string has nothing in the string continue
					   if(swabbedLine.isBlank()){
							   continue;   
					   }
					   //System.out.println(swabbedLine);
					   
					   //Split the string into words and check in hashmap 
					   
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
			   
			   
			   //Create a loop for the top 20 values
			   for(Entry aList : listOfEntry.subList(listOfEntry.size()-20, listOfEntry.size())) {
				   System.out.println(aList.getValue()+ " " + aList.getKey());
				   counter++;
			   }
			   //System.out.println(wordIt);
			   return counter;
			   
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				return 1;
			}
			   
		}
}


