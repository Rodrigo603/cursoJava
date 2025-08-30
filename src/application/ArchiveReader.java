package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchiveReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\rodri\\OneDrive\\Documentos\\MM2.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}
}	
		
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			String line = br.readLine();
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		finally {
//			try {
//				if (br != null) {
//					br.close();
//				}
//				if (fr != null) {
//					fr.close();
//				}
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

