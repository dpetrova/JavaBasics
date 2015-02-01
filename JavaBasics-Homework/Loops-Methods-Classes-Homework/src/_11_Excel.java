import java.io.FileInputStream;
import java.util.Locale;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// I used an external library poi-bin-3.11-20141221, which is not included in the archive because of large size
public class _11_Excel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		TreeMap<String, Double> allOffices = new TreeMap<String, Double>();
		try (FileInputStream input = new FileInputStream("3.Incomes-Report.xlsx"))
		{
			Workbook wb = WorkbookFactory.create(input);
			Sheet sh = wb.getSheet("Incomes");
			double totalIncome = 0;
			Row currentRow = sh.getRow(1);
			while (currentRow != null) {
				Cell officeCell = currentRow.getCell(0);
				String currentOffice = officeCell.getStringCellValue();
				Cell incomeCell = currentRow.getCell(5);
				double currentIncome = incomeCell.getNumericCellValue();
				totalIncome += currentIncome;
				if (allOffices.containsKey(currentOffice)) {
	         		currentIncome += allOffices.get(currentOffice);
				}
				allOffices.put(currentOffice, currentIncome);
				currentRow = sh.getRow(currentRow.getRowNum() + 1);
			}
	    
			for (String office: allOffices.keySet()) {
				double income = allOffices.get(office);
				System.out.printf("%s -> %.2f", office, income);
				System.out.println();
			}
			System.out.println("Grand Total -> " + totalIncome);
	         
		} catch (Exception e) {
        e.printStackTrace();
		}
	}
}
