import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIO {

	
	
	/*public void readFile(String s) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			String output = "";
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
	}
	}
	*/
	
	public void readAndWrite(String s, String t) {
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			BufferedWriter bw = new BufferedWriter(new FileWriter (t));
			String output = "";
			while ((output = br.readLine()) != null) {
				if (output.trim().length() < 30) {
					if (output.trim().length() > 0) {
						if (output.indexOf("v") >= 0) {
							bw.write(output.trim() + "\n");
						}
						//bw.write(output.substring(output.length()));
						//output = output.replace("\n", "");
					}
					else {
						continue;
					}
				}
				else {
					continue;
				}
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}
