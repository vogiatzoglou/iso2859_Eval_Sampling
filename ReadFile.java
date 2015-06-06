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
        
        String[] textData;
       
        try (BufferedReader textReader = new BufferedReader(fr)) {
            int numberOfLines = readLines();
            
            textData = new String[numberOfLines];
            
            for (int i=0; i < numberOfLines; i++) {
                textData[ i ] = textReader.readLine();
            }   
        }
         
         return textData; 
}
    
    // Methode Reading all the Lines of the TEXT File 
   
    int readLines() throws IOException {
        FileReader file_to_read= new FileReader(path);
        int numberOfLines;
       
        
        try (BufferedReader bf = new BufferedReader(file_to_read)) {
           
            String aLine;
           
            numberOfLines = 0;
          
            while ( ( aLine=bf.readLine() )  != null ){
          
                numberOfLines++;
            }  
        }    
      
        return numberOfLines;
        
        
        
    }
    
    
    
    
    
    
}
