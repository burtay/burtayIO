package org.burtay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author burtay
 */
public class burtayIO 
{
    BufferedReader br;
    FileReader fr;
    
   
   
     /**
     * This method returns a file contents as a String
     * 
     * @param filePath is a String val which is inludes file path to add
     * 
     * @return file contents
     */      
    public String getFileContentasString(String filePath) throws FileNotFoundException, IOException
    {
        String result = "";
        String line = null;
        this.fr = new FileReader(filePath);
        this.br = new BufferedReader(this.fr);
        while((line = br.readLine()) != null)
        {
            result +=line+"\n";
        }
        this.fr.close();
        this.br.close();
        return result;
    }
    
     /**
     * This method returns a file contents as a list
     * every line of the file an element of the list
     * 
     * @param filePath is a String val which is inludes file path to add
     * 
     * @return file contents a list for every line of the file
     */  
    public List getFileContentasList(String filePath) throws FileNotFoundException, IOException
    {
        List result = new ArrayList();        
        String line = null;
        this.fr = new FileReader(filePath);
        this.br = new BufferedReader(this.fr);
        while((line = br.readLine()) != null)
        {
            result.add(line);
        }
        this.fr.close();
        this.br.close();
        return result;      
    }
    
     /**
     * This method add a string to a file
     * @param filePath is a String val which is inludes file path to add
     * @param data is a String val which is includes the data to be added
     */
    public void appendToFile(String filePath,String data) throws IOException
    {
        FileWriter fr = new FileWriter(filePath,true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(data);
        br.close();
        fr.close();
    }
    
    
    public void writeToFile(String filePath, String data) throws IOException      
    {
        File file = new File(data);
        if(file.exists())
        {
            FileWriter fr = new FileWriter(filePath);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(data);
            br.close();
            fr.close();  
        }
    }
    
  
    public boolean createFile(String fileName) throws IOException
    {
        File file = new File(fileName);
        return file.createNewFile();
    }
    
    public boolean deleteFile(String filePath)
    {
        File file = new File(filePath);        
        return file.delete();        
    }
}
