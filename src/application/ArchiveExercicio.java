package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class ArchiveExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		System.out.println("Enter the path of the file: ");
		String pathFileStr = sc.nextLine();
		File pathFile = new File(pathFileStr);
		String pathFolder = pathFile.getParent();
		boolean sucess = new File(pathFolder + "\\out").mkdir();
		String newFile = pathFolder + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
			String itemCsv = br.readLine();
			while (itemCsv != null) {
			String[] items = itemCsv.split(",");
			String name = items[0];
			double price = Double.parseDouble(items[1]);
			int quantity = Integer.parseInt(items[2]);
			list.add(new Product(name, price,quantity));
			itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f",item.totalValueInStock()));
					bw.newLine();
				}
			}
			catch (IOException e) {
				e.getStackTrace();
			}
		}
		catch (IOException e) {
			e.getStackTrace();
		}
		sc.close();
	}

}
