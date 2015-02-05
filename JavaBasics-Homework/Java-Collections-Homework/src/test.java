import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] faces=input.nextLine().split("\\W+");
		Map<String,Integer> facesMap=new LinkedHashMap<>();
		for (String face : faces) {
			if(facesMap.containsKey(face)){
				facesMap.put(face,facesMap.get(face)+1);
			}
			else{
				facesMap.put(face, 1);
			}			
		}
		DecimalFormat formater=new DecimalFormat("#0.00");
		for (Map.Entry<String, Integer> face : facesMap.entrySet()) {
			System.out.println(face.getKey() + " -> " + formater.format((double) face.getValue() / faces.length * 100) + "%");
		}
	}

}
