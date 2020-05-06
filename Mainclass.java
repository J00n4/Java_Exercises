
public class Mainclass {

	
	public static void main(String[] args) {
		
		
		ReadAndWriteIO io = new ReadAndWriteIO();
		
		//System.out.println( System.getProperty( "user.dir" ) );
		//io.readFile("input.txt");
		
		io.readAndWrite("input.txt", "output.txt");
	}
}
