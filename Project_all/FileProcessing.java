/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author dhruv
 */
public class FileProcessing {
    
    private int numberLines = 0;
    private String line = "";
    
    
    public void fileReader( ) throws IOException{
        
        try {
            FileReader readFile = new FileReader("C:\\input.txt");
            BufferedReader br = new BufferedReader(readFile);
            String line = "";
            
            while((line = br.readLine()) != null ){
                numberLines ++;
            }
            System.out.println(line);
            
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        if(numberLines / 5 == 4){
            
            
        }
    
        
    }
}
