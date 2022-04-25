import answers.Answers;
import helper.Answer;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class Index {

    public static void main(String[] args) throws IOException {
        checkAnswers();
    }

    /**
     * Rows count 0-based Cols count start @ 1
     *
     * @throws IOException Comes from XSSF stuff
     */
    public static void checkAnswers() throws IOException {
        // SETUP
        final Map<String, Answer> answers = new Answers().getAnswers();  //
        int skippingColumns = 2;  // skip beginning cols that include data such as the Date the test was taken
        int score_Total = 0;      // test-takers total score

        // GET EXCEL FILE & ROW/COL COUNTS

        File file = new File("C:\\Users\\br3nd\\_Code\\Java\\Selenium_Test_Answer_Checker\\src\\main\\resources\\Responses2.xlsx");
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
            score_Total = Answers.checkAnswers(headerRow, currRow, skippingColumns);
        }

        System.out.println(
                "\n********************\n********************\n" +
                "SCORE:" +
                "\nTotal Score: " + score_Total +
                "\n********************\n********************\n"
        );
    }
}