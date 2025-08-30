package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product3;
import model.entities.UsedProduct;

public class ExercicioProductsPolimorfismo {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new 	SimpleDateFormat("dd/MM/yyyy");
		List<Product3> list = new ArrayList<>();
		System.out.print("How many products will be entered? ");
		int n = sc.nextInt();
		for (int i = 0;i<n;i++) {
			System.out.println("Enter product #" + (i + 1) + " Data: ");
			System.out.print("Common,used or imported(c/u/i): ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			if(option == 'c') {
				list.add(new Product3(name,price));
			}else if (option == 'u') {
				System.out.print("Manufacture date(DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.nextLine());
				list.add(new UsedProduct(name,price,manufactureDate));
			}else if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name,price,customsFee));
			}
		}
		System.out.println("PRICE TAGS: ");
		for(Product3 prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
