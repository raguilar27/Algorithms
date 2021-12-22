import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class downloadContent {
	
	public static void downloadUrlContent() {
		 try {
			//Variables for input data.
			URL url = new URL ("http://www.sap.com/belgique/index.html");
			InputStream stream = url.openStream();
			BufferedReader input = new BufferedReader (new InputStreamReader(stream));
			 
			//Variables for output data.
			File file = new File ("copy.html");
			
			//Creating file if not existing.
			if (!file.exists()) {
				file.createNewFile();
			}
			
			BufferedWriter output = new BufferedWriter (new FileWriter(file.getAbsoluteFile()));
			 
			String line;
			 
			//Reading each line of the web page, and writing them in the output file, replace SAP by Odoo.
			while ( (line = input.readLine()) != null) {
				output.write(line.replace("SAP", "Odoo"));
			}
			 
			output.close();
			
		}catch (MalformedURLException ue) {
			ue.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
		 /*finally{	 
			try{
				if (stream != null) stream.close();
			}catch (IOException ie) {
				ie.printStackTrace();
			}
		}*/
	}

	public static void main(String[] args) {
		
		downloadUrlContent();
	}

}
