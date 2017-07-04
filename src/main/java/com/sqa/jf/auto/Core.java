/**
 * File Name: Core.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 28, 2017
 */
package com.sqa.jf.auto;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.jf.adactin.*;

/**
 * Core //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Core {

	private Logger log = Logger.getLogger(this.getClass());

	private String baseURL;

	private WebDriver driver;

	private int screenshotCount = 1;

	protected String testingName = "Auto Test";

	private BasicTest relTest;

	public Core(BasicTest test) {
		super();
		this.baseURL = test.getBaseURL();
		this.driver = test.getDriver();
		this.relTest = test;
	}

	public Core(String baseURL) {
		super();
		this.baseURL = baseURL;
	}

	public Core(String baseURL, WebDriver driver) {
		super();
		this.baseURL = baseURL;
		this.driver = driver;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public Logger getLog() {
		return this.log;
	}

	public boolean isPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by, getLog());
	}

	public boolean takeScreenshot() {
		boolean tookScreenshot = AutoBasics.takeScreenshot("screenshots", this.testingName + this.screenshotCount,
				getDriver(), getLog());
		if (tookScreenshot) {
			this.screenshotCount++;
		}
		return tookScreenshot;
	}

	public boolean takeScreenshot(String fileName) {
		return AutoBasics.takeScreenshot("screenshots", fileName, getDriver(), getLog());
	}

	protected BasicTest getRelTest() {
		return this.relTest;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
