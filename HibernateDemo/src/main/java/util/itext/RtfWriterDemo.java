package util.itext;

import com.lowagie.text.*;
import com.lowagie.text.rtf.RtfWriter2;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

public class RtfWriterDemo {

    @Test
    public void test1() throws Exception {
        Document document = new Document(PageSize.A4);
        document.newPage();
        RtfWriter2.getInstance(document, new FileOutputStream(new File("HelloWorld.doc")));
        document.open();

        Font titleFont = FontFactory.getFont(FontFactory.COURIER, 12);
        Paragraph title = new Paragraph("HelloWorld!!!");
//        // 设置标题格式对齐方式
//        title.setAlignment(elementAlign);
//        title.setFont(titleFont);
//        title.setSpacingBefore(before);
//        title.setSpacingAfter(after);

        document.add(title);
    }
}
