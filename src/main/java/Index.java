import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Index {

    public static void main(String[] args) throws IOException {
        checkAnswers();
    }

    /**
     * Rows count 0-based
     * Cols count start @ 1
     *
     * @throws IOException Comes from XSSF stuff
     */
    public static void checkAnswers() throws IOException {
        // SETUP
        Answer[] answers = Answers_WebDriverMethods.getAnswers();
        int skippingColumns = 2;
        int score_Total = 0;
        // scores for diff sections
        int score_webDriver = 0;

        // GET EXCEL FILE & ROW/COL COUNTS

        File file = new File("C:\\Users\\br3nd\\Documents\\Code\\Java - Testing\\Selenium_Test_Answer_Checker\\src\\main\\resources\\WebDriver Test (Responses).xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet workSheet = workbook.getSheetAt(0);
        int rowCount = workSheet.getLastRowNum();
        XSSFRow row = workSheet.getRow(0);
        int columnCount = row.getLastCellNum();
        // ROW/COL COUNTS
        System.out.println(
                "Rows: " + rowCount +
                "\nCols: " + columnCount
        );

        // LOOP ROWS AND PRINT HEADER/ROW DATA

        XSSFRow headerRow = workSheet.getRow(0);
        // loop through rows
        for (int rowNum = 1; rowNum <= workSheet.getLastRowNum(); rowNum++) {
            // get current row
            XSSFRow currRow = workSheet.getRow(rowNum);

            // CHECK ANSWERS
            score_webDriver = Answers_WebDriverMethods.checkAnswers(currRow, skippingColumns);
        }

        score_Total = score_webDriver;
        System.out.println(
                "\n********************\n********************\n" +
                "SCORE:" +
                "\n WebDriver Methods: " + score_webDriver +
                "\n----------------------------------" +
                "\nTotal Score: " + score_Total
        );
    }
}
