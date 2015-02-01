import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class _09_ListOfProducts {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		try (BufferedReader input = new BufferedReader (new FileReader ("Input2.txt"))) {
			
			while (true) {
				String line = input.readLine();
				if (line == null) {
				    break;
				}
				String[] splitted = line.split(" ");
				String prod = splitted[0];
				double price = Double.parseDouble(splitted[1]);
				Product product = new Product(prod, price);
				productList.add(product);
			}
			
			Collections.sort(productList);
			
			try (BufferedWriter output = new BufferedWriter(new FileWriter("Output2.txt"))) {
                 for (Product product : productList) {
                         output.write(String.format("%.2f %s", product.getPrice(), product.getName()));
                         output.newLine();
                 }
         }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File written in project directory");

	}

}
