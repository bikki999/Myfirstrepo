package com.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;


/**
 * This Class is used to store all webDriver related methods
 */


public class WebDriverUtility 
{
	//WebDriver Methods
		/**
		 * This method is used to fetch the title of the page.
		 * @param driver
		 * @return String
		 */
		public String toGetTitle(WebDriver driver) {
			return driver.getTitle();
		}
		
		/**
		 * This method is used to Fetch the current url of the page.
		 * @param driver
		 * @return String
		 */
		public String toGetCurrentUrl(WebDriver driver) {
			return driver.getCurrentUrl();
		}

		/**
		 * This method is used to Fetch the Source code of the page.
		 * @param driver
		 * @return String
		 */
		public String toGetPageSource(WebDriver driver) {
			return driver.getPageSource();
		}

	//WINDOW
		/**
		 * This method is used to maximize the webPage.
		 * @param driver
		 * @return void
		 */
		public void toMaximize(WebDriver driver) {
			driver.manage().window().maximize();
		}

		/**
		 * This method is used to minimize the webPage.
		 * @param driver
		 * @return void
		 */
		public void toMinimize(WebDriver driver) {
			driver.manage().window().minimize();
		}

		/**
		 * This method is used to FullScreen the webPage.
		 * @param driver
		 * @return void
		 */
		public void toFullscreen(WebDriver driver) {
			driver.manage().window().fullscreen();
		}

		/**
		 * This method is used to get the size of the webPage.
		 * @param driver
		 * @return Dimension
		 */
		public Dimension toGetSize(WebDriver driver) {
			return driver.manage().window().getSize();
		}
//		public void toSetSize(WebDriver driver) {
//			driver.manage().window().setSize(null);
//		}

		/**
		 * This method is used to get the Exact position of the webPage.
		 * @param driver
		 * @return Point
		 */
		public Point toGetPosition(WebDriver driver) {
			return driver.manage().window().getPosition();
		}
//		public void toSetPosition(WebDriver driver) {
//		driver.manage().window().setPosition(null);
	//}

	//NAVIGATE
		/**
		 * This method is used to navigate forward in webpage.
		 * @param driver
		 * @return void
		 */
		public void toNavigateForward(WebDriver driver) {
			driver.navigate().forward();
		}

		/**
		 * This method is used to navigate backward in webpage.
		 * @param driver
		 * @return void
		 */
		public void toNavigateBackward(WebDriver driver) {
			driver.navigate().back();
		}

		/**
		 * This method is used to refresh the webpage.
		 * @param driver
		 * @return void
		 */
		public void toRefresh(WebDriver driver) {
			driver.navigate().refresh();
		}

	//TIMEOUTS
		/**
		 * This method is used add implicit wait.
		 * @param driver
		 * @return void
		 */
		public  void toImplicitlyWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		/**
		 * This method is used add explicit wait.
		 * @param driver
		 * @return void
		 */
		public void toExplicitlyWait(WebDriver driver) {
			 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

	}

	
	
		
	


