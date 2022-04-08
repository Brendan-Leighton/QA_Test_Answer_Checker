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
        int startingIndexForColumnsWithQuestions = 2;
        int userScore = 0;

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
            // loop through the columns
            for (int colNum = 0; colNum < columnCount; colNum++) {
                // print column header
                System.out.println("\n***\n" + headerRow.getCell(colNum));

                // print row data
                String usersAnswer = currRow.getCell(colNum) == null ? null : currRow.getCell(colNum).toString();
                System.out.println("User's Answer: " + usersAnswer + "\n***\n");

                // TODO: check if data is valid
                if (colNum >= startingIndexForColumnsWithQuestions) {
                    int answersIndex = colNum - startingIndexForColumnsWithQuestions;

                    String[] subMethods = answers[answersIndex].getSubMethods();
                    if (subMethods == null || usersAnswer == null) continue;
                    for (String method : subMethods) {
                        System.out.print("looking for: " + method);
                        if (usersAnswer.contains(method)) {
                            System.out.print(" * found");
                            userScore += 1;
                        }
                        System.out.print("\n"); // make a line break after the previous 2 prints
                    }
                    System.out.println("User's Score: " + userScore);
                }

            }
        }

        System.out.println("User's Score: " + userScore);
    }
}
