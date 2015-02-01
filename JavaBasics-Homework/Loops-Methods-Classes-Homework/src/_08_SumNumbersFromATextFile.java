import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class _08_SumNumbersFromATextFile {
	 
	public static void main(String[] args) {
		int sum = 0;
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\urukhai\\workspace\\Loops-Methods-Classes-Homework\\Input.txt"));
			while ((line = reader.readLine()) != null) {
				int number = Integer.parseInt(line);
				sum += number;
			}
			System.out.println(sum);
			reader.close();
		} catch (IOException e) {
			System.out.println("Error");
			//e.printStackTrace();
		}
	}
}

