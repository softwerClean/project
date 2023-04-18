package mycleann;

import java.io.*;

public class EmailServer
{
	
	public void sendEmail(String email,String a,String f)throws IOException
	{
		FileWriter file = new FileWriter("email.txt");
        BufferedWriter buff = new BufferedWriter(file);
        try 
        {
        	buff.write(email);
        	buff.append("\n");
        	buff.append(a);
        	buff.append("\n");
        	buff.append(f);
        	buff.close();
        	file.close();
        }
catch(Exception excep) {
	
}
    	finally {
    		buff.close();
    		file.close();
        }
    	
	}
	
	

}
