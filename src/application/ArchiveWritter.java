package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchiveWritter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning" , "Good afternoon", "Good evening"};
		String path = "C:\\Users\\rodri\\OneDrive\\Documentos\\Out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) { // path,true é para não recriar o arquivo toda vez q executa o codigo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.getStackTrace();
		}
	}

}
