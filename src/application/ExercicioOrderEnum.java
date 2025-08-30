package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.OrderItem;
import model.entities.OrderProduct;
import model.entities.OrderShop;
import model.enums.OrderStatus;

public class ExercicioOrderEnum  {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name,email,birthDate);
		System.out.println("Enter order data: ");
		System.out.print("Order status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		OrderShop order = new OrderShop(new Date(),status,client);
		System.out.print("How many items to this order ? ");
		Integer n = sc.nextInt();
		for (int i = 1; i <= n;i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Product quantity: ");
			Integer quantity = sc.nextInt();
			OrderProduct product = new OrderProduct(productName,price);
			OrderItem it = new OrderItem(quantity,price,product);
			order.addItem(it);
		}
		System.out.println();
		System.out.println(order);
		
		
		sc.close();
		
		

	}

}
