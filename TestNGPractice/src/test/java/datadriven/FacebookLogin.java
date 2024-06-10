/*
 * package datadriven;
 * 
 * 
 * 
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.testng.annotations.AfterMethod; import
 * org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.DataProvider; import org.testng.annotations.Test;
 * 
 * public class FacebookLogin {
 * 
 * 
 * WebDriver driver;
 * 
 * @BeforeMethod public void setup() {
 * System.setProperty("webdriver.chrome.driver",
 * "D:\\Barclays_switch_Workspace\\TestNGPractice\\driver\\chromedriver.exe");
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 * driver.get("https://www.facebook.com/");
 * 
 * // Wait<WebDriver> wait = new FluentWait<>(driver) //
 * .withTimeout(Duration.ofSeconds(10)) // .pollingEvery(Duration.ofMillis(500))
 * // Optional: Set the polling interval
 * //.ignoring(org.openqa.selenium.NoSuchElementException.class);
 * 
 * }
 * 
 * @Test(dataProvider="userData") public void login(String username, String
 * password) { WebElement user= driver.findElement(By.id("email"));
 * user.sendKeys(username); WebElement pass= driver.findElement(By.id("pass"));
 * pass.sendKeys(password);
 * 
 * }
 * 
 * 
 * 
 * @DataProvider(name="userData") public static Iterator<Object[]>
 * providerUserData() throws FileNotFoundException { List<Object[]> data = new
 * ArrayList<>(); FileInputStream fis = new
 * FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Data.xlsx"); Workbook
 * workbook = WorkbookFactory.create(fis); Sheet sheet = new Sheet("Data");
 * Iterator<Row> rowIterator = sheet.iterator();
 * 
 * if (rowIterator.hasNext()) { rowIterator.next(); }
 * 
 * 
 * while (rowIterator.hasNext()) { Row row = rowIterator.next(); Iterator<Cell>
 * cellIterator = row.cellIterator();
 * 
 * List<String> rowData = new ArrayList<>();
 * 
 * while (cellIterator.hasNext()) { Cell cell = cellIterator.next();
 * rowData.add(cell.toString()); }
 * 
 * data.add(rowData.toArray(new Object[0])); }
 * 
 * workbook.close(); fis.close();
 * 
 * return data.iterator(); }
 * 
 * 
 * 
 * 
 * @AfterMethod public void tearDOwn() { driver.close(); }
 * 
 * }
 */