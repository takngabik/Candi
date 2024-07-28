import com.itextpdf.text.Document
import com.itextpdf.text.Image
import com.itextpdf.text.PageSize
import com.itextpdf.text.pdf.PdfWriter
import java.io.FileOutputStream

class Report {
    fun create(image: String) {
        val path = "report.pdf"
        val leftMargin = 36f
        val rightMargin = 36f
        val document = Document(PageSize.A4)
        try {
            PdfWriter.getInstance(document, FileOutputStream(path))
            document.open()
            val img = Image.getInstance(image)
            val pageWidth = document.pageSize.width
            val pageHeight = document.pageSize.height
            val availableWidth = pageWidth - leftMargin - rightMargin
            img.scaleToFit(availableWidth, pageHeight)
            img.setAbsolutePosition(
                (pageWidth - img.scaledWidth) / 2,
                (pageHeight - img.scaledHeight) / 2
            )
            document.add(img)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            document.close()
        }
    }
}