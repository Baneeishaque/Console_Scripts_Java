// Efficient Java program to remove 
// duplicates from input.txt and  
// save output to output.txt 
  
import java.io.*; 
import java.util.HashSet; 
  
public class FileOperation 
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for output.txt 
        PrintWriter pw = new PrintWriter("output.txt"); 
          
        // BufferedReader object for input.txt 
        BufferedReader br = new BufferedReader(new FileReader("input.txt")); 
          
        String line = br.readLine(); 
          
        // set store unique values 
        HashSet<String> hs = new HashSet<String>(); 
          
        // loop for each line of input.txt 
        while(line != null) 
        { 
            // write only if not 
            // present in hashset 
            if(hs.add(line)) 
                pw.println(line); 
              
            line = br.readLine(); 
              
        } 
          
        pw.flush(); 
          
        // closing resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("File operation performed successfully"); 
    } 
} 