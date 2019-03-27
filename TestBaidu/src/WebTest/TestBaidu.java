package WebTest;

import java.util.regex.Pattern;

import javax.swing.filechooser.FileSystemView;

import java.awt.geom.Area;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBaidu {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  String driverPath = System.getProperty("user.dir") + "/src/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBaidu() throws Exception {
	driver.get(baseUrl + "/");
	File filePath = new File(System.getProperty("user.dir")+ "/src/»Ìº˛≤‚ ‘√˚µ•.xlsx");
	FileInputStream file = new FileInputStream(filePath);
	XSSFWorkbook xss = new XSSFWorkbook(file);
	XSSFSheet sheet1 = xss.getSheetAt(0);
	int length = sheet1.getPhysicalNumberOfRows()-1;
	for(int i = 2; i < length; i++) {
		String student_id = sheet1.getRow(i).getCell(1).getRawValue();
		String student_password = student_id.substring(4);
		String student_name = sheet1.getRow(i).getCell(2).getStringCellValue();
		String student_git = sheet1.getRow(i).getCell(3).getStringCellValue();
		driver.findElement(By.name("id")).clear();
		driver.findElement(By.name("id")).sendKeys(student_id);
		driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(student_password);
	    driver.findElement(By.id("btn_login")).click();
	    assertEquals(student_id,driver.findElement(By.id("student-id")).getText());
	    assertEquals(student_name,driver.findElement(By.id("student-name")).getText());
	    assertEquals(student_git,driver.findElement(By.id("student-git")).getText());
	    driver.findElement(By.id("btn_logout")).click();
	    driver.findElement(By.id("btn_return")).click();
	}
	
//    WebElement we = driver.findElement(By.name("id"));
//    we.click();
//    WebElement me = driver.findElement(By.name("password"));
//    me.click();
  }


@After
  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

