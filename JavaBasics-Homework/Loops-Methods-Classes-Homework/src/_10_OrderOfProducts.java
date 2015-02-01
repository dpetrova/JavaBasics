import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _10_OrderOfProducts {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		try (Scanner inputProd = new Scanner (new FileReader ("Product.txt"))) {
			while (inputProd.hasNext()) {
			String prod = inputProd.next();
			double price = inputProd.nextDouble();
			Product newProd = new Product(prod, price);
			productList.add(newProd);
			}
			
			double totalPrice = 0;
			try (Scanner inputOrder = new Scanner (new FileReader ("Order.txt"))) {
			while (inputOrder.hasNext()) {
				double quantity = inputOrder.nextDouble();
				String nextProd = inputOrder.next();
				for (Product product : productList) {
                    if (product.getName().equals(nextProd)) {
                            totalPrice += quantity * product.getPrice();
                    }
				}
				
			}
		}
			
		try (BufferedWriter output = new BufferedWriter(new FileWriter("Output.txt"))) {
			output.write(String.format("%.2f", totalPrice));
				
		}

		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		System.out.println("The total price is calculated");
	}
}

	
