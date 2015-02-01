import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



//itextpdf-5.5.4.jar is used as external library (not included in archive because of size limit of homework))
//FreeSerif.ttf is used as font (not included in archive because of size limit of homework)

public class _09_GeneratePDF {

	public static void main(String[] args) throws DocumentException, IOException {
		//Create new document
		Document cardsPDF = new Document();
		PdfWriter.getInstance(cardsPDF, new FileOutputStream("Deck-of-Cards.pdf"));
		
		//Open the document to work on it
		cardsPDF.open();
		
		// Create Table
		PdfPTable table = new PdfPTable(4);
		table.getDefaultCell().setBorder(0);
		
		// Set Font
		BaseFont baseFont = BaseFont.createFont("lib/FreeSerif.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		Font font = new Font(baseFont, 35f, Font.BOLD);
		
		//Set title
		Paragraph title = new Paragraph(new Phrase("Deck of Cards", font));
		title.setAlignment(Element.ALIGN_CENTER);
		cardsPDF.add(title);
		cardsPDF.add(Chunk.NEWLINE);
		
		//Initialize variables
		String card = "";
		String face = "";
		String suit = "";
		
		// Generate cards by Nested Loops
		for (int i = 2; i <= 14; i++) {
			switch (i) {
			case 11:
				face = "J";
				break;
			case 12:
				face = "Q";
				break;
			case 13:
				face = "K";
				break;
			case 14:
				face = "A";
				break;
			default:
				face = "" + i;
				break;
			}
			for (int j = 1; j <= 4; j++) {
				switch (j) {
				case 1:
					suit = "\u2663";
					break;
				case 2:
					suit = "\u2666";
					break;
				case 3:
					suit = "\u2660";
					break;
				case 4:
					suit = "\u2665";
					break;
				}
				card = face + suit;
				
				// Set SuitColor
				if (j == 1 || j == 3) {
					font = new Font(baseFont, 40f, Font.NORMAL, BaseColor.BLACK);
				} 
				else if (j == 2 || j == 4) {
					font = new Font(baseFont, 40f, Font.NORMAL, BaseColor.RED);
				}
				
				PdfPTable cardTable = new PdfPTable(1);
				PdfPCell cell;
				cell = new PdfPCell(new Phrase(card, font));
				cell.setHorizontalAlignment(Element.ALIGN_LEFT);
				cell.setVerticalAlignment(Element.ALIGN_TOP);
				cell.setFixedHeight(150f);
				cell.setBorderColor(BaseColor.BLACK);
				cardTable.addCell(cell);
				table.addCell(cardTable);
				
			}
		}
		
				// Insert the Table in the Document
				cardsPDF.add(table);
				cardsPDF.close();
				
				System.out.println("The pdf is generated");
	}
	
}
