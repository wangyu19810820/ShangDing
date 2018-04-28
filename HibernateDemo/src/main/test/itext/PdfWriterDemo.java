package itext;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;


public class PdfWriterDemo {

    // 最简单的例子
    @Test
    public void test1() throws Exception {
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        document.open();

        document.add(new Paragraph("Hello World!!!"));
        document.addAuthor("wangyu");
        document.addCreationDate();
        document.addCreator("HowToDoInJava.com");
        document.addTitle("Set Attribute Example");
        document.addSubject("An example to show how attributes can be added to pdf files.");

        document.close();
        pdfWriter.close();
    }

    // 文档带图片
    @Test
    public void test2() throws Exception {
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        document.open();

        document.add(new Paragraph("Hello World!!!"));

        Image image = Image.getInstance("f:\\a.png");
        image.setAbsolutePosition(100f, 550f);
        image.scaleAbsolute(200, 200);

        String imageUrl = "https://cdn2.jianshu.io/assets/web/nav-logo-4c7bbafe27adc892f3046e6978459bac.png";
        Image image1 = Image.getInstance(new URL(imageUrl));
        document.add(image1);


        document.close();
        pdfWriter.close();
    }

    // 文档带表格
    @Test
    public void test3() throws Exception {
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Table.pdf"));
        document.open();

        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        float[] columnWidth = {1f, 1f, 1f};
        table.setWidths(columnWidth);

        PdfPCell cell1 = new PdfPCell(new Paragraph("cell1"));
        cell1.setBorderColor(BaseColor.BLUE);
        cell1.setPaddingLeft(10);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
        cell2.setBorderColor(BaseColor.GREEN);
        cell2.setPaddingLeft(10);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
        cell3.setBorderColor(BaseColor.RED);
        cell3.setPaddingLeft(10);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);

        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        document.add(table);

        document.close();
        pdfWriter.close();
    }

    // 文档带字体和颜色的文字
    @Test
    public void test4() throws Exception {
        Font blueFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(255, 0, 0, 0));
        Font redFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(0, 255, 0, 0));
        Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 0, 255, 0));

        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Font.pdf"));
        document.open();

        document.add(new Paragraph("Styling Example"));
        Paragraph paragraphOne = new Paragraph("Some colored paragraph text", redFont);
        document.add(paragraphOne);

        Paragraph chapterTitle = new Paragraph("Chapter Title", yellowFont);
        Chapter chapter1 = new Chapter(chapterTitle, 1);
        chapter1.setNumberDepth(0);

        Paragraph sectionTitle = new Paragraph("Section Title", redFont);
        Section section1 = chapter1.addSection(sectionTitle);

        Paragraph sectionContent = new Paragraph("Section Text content", blueFont);
        section1.add(sectionContent);

        document.add(chapter1);

        document.close();
        pdfWriter.close();
    }
}
