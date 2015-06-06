/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iso2859eval;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Stefanos Vogiatzoglou
 */
public class ReadFile {
    private String path;
    
    public ReadFile(String file_path){
        path=file_path;
   
    
    
    
    }
     // Methode  OpenFile  SETUP  default Methods FileReader and a BufferedReader 
    public String[] OpenFile() throws IOException {
        
        FileReader fr =new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        int numberOfLines = readLines();
        String[ ] textData = new String[numberOfLines];
        
         for (int i=0; i < numberOfLines; i++) {
         textData[ i ] = textReader.readLine();
    }
         textReader.close();  /*he close method flushes 
         the temporary memory buffer called textReader*/
         
         return textData; 
}
    
    // Methode Reading all the Lines of the TEXT File 
   
    int readLines() throws IOException {
        FileReader file_to_read= new FileReader(path);
        BufferedReader bf =new BufferedReader(file_to_read);
        String aLine;
        int numberOfLines=0;
        while ( ( aLine=bf.readLine() )  != null ){
        numberOfLines++;
    }
        bf.close();    
        return numberOfLines;
        
        
        
    }
    
    
    
    
    
    
}
