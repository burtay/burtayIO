package org.burtay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author burtay
 */
public class burtayIO 
{
    String filePath;
    BufferedReader br;
    FileReader fr;
    
    public burtayIO(String filePath)
    {
        this.filePath = filePath;
    }
    
    public String getFileContentasString() throws FileNotFoundException, IOException
    {
        String result = "";
        String line = null;
        this.fr = new FileReader(this.filePath);
        this.br = new BufferedReader(this.fr);
        while((line = br.readLine()) != null)
        {
            result +=line+"\n";
        }
        this.fr.close();
        this.br.close();
        return result;
    }
    
    
    public List<String> getFileContentasList() throws FileNotFoundException, IOException
    {
        List result = new ArrayList();        
        String line = null;
        this.fr = new FileReader(this.filePath);
        this.br = new BufferedReader(this.fr);
        while((line = br.readLine()) != null)
        {
            result.add(line);
        }
        this.fr.close();
        this.br.close();
        return result;      
    }
}
