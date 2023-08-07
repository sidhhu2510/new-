package org.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.common.usermodel.Fill;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	 public static WebDriver driver;
	 
	 public static Actions s ;
	 
	 public static Select w;
	 
	 public static Robot  d ;
	 
	public static void chrome() {
		
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
}
	
	   public static void lourl(String website) {
		driver.get(website);

	}
	   
	   
	   public static void send(WebElement ses,String value) {
	     ses.sendKeys(value);

	}
	   public static void winmix() {
		driver.manage().window().maximize();
}
	   public static void printtit() {
		   
		   String title = driver.getTitle();
		   System.out.println(title);
		
	}
	   public static void cururl() {
		String cur = driver.getCurrentUrl();
		System.out.println(cur);

	}
	   
	
	   public static void btnclick(WebElement ele) {
		ele.click();

	}
	   
	   
	   public static void winclose() {
		driver.close();


	}
	   public static void winquit() {
		  driver.quit();

	}
	  	   public static void textprint(WebElement ele) {
		   
		   String text = ele.getText();
		   System.out.println(text);
		}
	   
	   public static void getvalue(WebElement ele,String value) {
		   ele.getAttribute(value);

	}
		 
		 public static void moveto(WebElement ver) {
			s.moveToElement(ver).perform();

		}
		 public static void drag(WebElement e1,WebElement e2) {
			s.dragAndDrop(e1, e2).perform();
			
			}
		 public static void updown(Keys e1,Keys e2) {
			s.keyDown(e1).keyUp(e2).perform();
	}
		 public static void doubeltab(WebElement bu) {
			 
		Actions	 s=new Actions(driver);
		s.doubleClick(bu).perform();

		}
		 public static void right() {
	       s.contextClick().perform();
	}    
		 public static void send(String value) {
		s.sendKeys(value).perform();

		}
		 public static void clc(WebElement bu) {
			s.click(bu).perform();

		}
			
			public static void enterale() {
				Alert al = driver.switchTo().alert();
				al.accept();
			}
			
			public static void dcc() {
				
				Alert al = driver.switchTo().alert();
				al.dismiss();

			}
			public static void keysend(String value) {
				Alert al = driver.switchTo().alert();
				al.sendKeys(value);
			}
			public static void getal() {
				Alert al = driver.switchTo().alert();
				System.out.println(al.getText());
			}
			 public static void urltitle() {
				 String parend = driver.getWindowHandle();
			System.out.println( parend);

			}
			 public static void urltitles() {
				 
				 Set<String> child = driver.getWindowHandles();
					System.out.println(child);
			}
			 
		 public static void gettitle(  int r ) {
			 
			   Set<String> f = driver.getWindowHandles();
				 
				 List<String> e = new LinkedList<String>();
				 
				 e.addAll(f);
				 
				 driver.switchTo().window(e.get(r));
			}
		 
		 public static void idview(String value) {
		        driver.switchTo().frame(value);
			}
			 
		 
			 public static void nameview(String value) {
			        driver.switchTo().frame(value);
			}
			 
			 public static void numbereview(int value) {
			        driver.switchTo().frame(value);
			} 
			 
			 
			 public static void locater(WebElement value) {
			        driver.switchTo().frame(value);
			 }
			 
			 public static void textnumber(WebElement ele,int  value) {
				Select  w = new Select(ele);
				 w.selectByIndex(value); 
		}
			 public static void textstring(WebElement ele,String  value) {
					Select  w = new Select(ele);
				 w.selectByValue(value); 
		}
			 public static void visbletext(WebElement ele,String  value) {
				  w = new Select(ele);
				 w.selectByVisibleText(value); 
		}
			 public static void dese(WebElement ele) {
				  w = new Select(ele);
				 w.deselectAll(); 
		}
			 public static void getvalue(WebElement ele) {
				  w = new Select(ele);
				 w.getOptions(); 
		}
			 public static void fristvalue(WebElement ele) {
				  w = new Select(ele);
				 w.getFirstSelectedOption(); 
		}
			 public static void getallvalue(WebElement ele) {
				  w = new Select(ele);
				 w.getAllSelectedOptions(); 
		}
			 public static void multiple (WebElement ele) {
				  w = new Select(ele);
				 w.isMultiple(); 
		}
			 public static void deseby (WebElement ele,int value) {
				  w = new Select(ele);
				 w.deselectByIndex(value); 
				 
				 
		}    
			 public static void desevisble(WebElement ele,String value) {
			  w = new Select(ele);
			 w.deselectByVisibleText(value); 
		}

		     public static void desevalue(WebElement ele,String value) {
			  w = new Select(ele);
			 w.deselectByValue(value); 
		}


		     public static void wintitles(String url) {
				 driver.switchTo().window(url);
					}
		 

		     public static void winturl(String url) {
				 driver.switchTo().window(url);
					}

		     public static void winid(String id) {
				 driver.switchTo().window(id);
					}	

		 	public static void entrybotten( ) throws AWTException {
		 	d= new Robot();	
		 	d.keyPress(KeyEvent.VK_ENTER);	
		 	d.keyRelease(KeyEvent.VK_ENTER);
		 	}
		 	
		 	public static void shiftbotten(  ) throws AWTException {
		 	d= new Robot();	
		 	d.keyPress(KeyEvent.VK_SHIFT);	
		 	d.keyRelease(KeyEvent.VK_SHIFT);
		 	}
		 	
		 	public static void contorlbotten( ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_CONTROL);	
		 		d.keyRelease(KeyEvent.VK_CONTROL);
		 		}
		 	public static void capsbotten( ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_CAPS_LOCK);	
		 		d.keyRelease(KeyEvent.VK_CAPS_LOCK);
		 		}
		 	
		 	public static void copybotten(  ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_CONTROL);	
		 		d.keyPress(KeyEvent.VK_C);
		 		d.keyRelease(KeyEvent.VK_CONTROL);	
		 		d.keyRelease(KeyEvent.VK_C);
		 		}
		 	public static void cutbotten(  ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_CONTROL);	
		 		d.keyPress(KeyEvent.VK_X);
		 		d.keyRelease(KeyEvent.VK_CONTROL);	
		 		d.keyRelease(KeyEvent.VK_X);
		 		}
		 	public static void pastbotten(  ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_CONTROL);	
		 		d.keyPress(KeyEvent.VK_V);
		 		d.keyRelease(KeyEvent.VK_CONTROL);	
		 		d.keyRelease(KeyEvent.VK_V);
		 		}
		 	public static void tabbotten( ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_TAB);	
		 		d.keyRelease(KeyEvent.VK_TAB);
		 		}
		 	
		 	public static void spacebotten( ) throws AWTException {
		 		d= new Robot();	
		 		d.keyPress(KeyEvent.VK_SPACE);	
		 		d.keyRelease(KeyEvent.VK_SPACE);
		 		}


		 	public static String getexcel(int rownum ,int cellnum) throws IOException {	
				
				File w = new  File("C:\\Users\\siddh\\eclipse-workspace\\Freamwork\\excelfile\\detalies....xlsx");
			
			FileInputStream f = new FileInputStream(w);
			
			Workbook b = new XSSFWorkbook(f);
			
			Sheet  s = b.getSheet("sheet1");
			
			Row r = s.getRow(rownum);
			
			Cell ce = r.getCell(cellnum);
			
			int sv = ce.getCellType();
			
			
			String value="" ;
			
			if (sv==1) {
				
				 value = ce.getStringCellValue();			 
				
			}
			
			else if (DateUtil.isCellDateFormatted(ce)) {
				
				Date dv = ce.getDateCellValue();
				
				SimpleDateFormat w1 = new SimpleDateFormat("dd/MM/yyyy");
				 value = w1.format(dv);
				
			
			}
			
			else {
				double nu = ce.getNumericCellValue();
				
				long l = (long)nu;
			    value = String.valueOf(l);
			   
			}
			
				return value;
			}
			

				
		 	
		public static void fill(WebElement ele, String value) {
			ele.sendKeys(value);

		}
	
		 	
		public static void imwaites(int t) throws InterruptedException {
			
			driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
			
			}	
		 	

	

}









