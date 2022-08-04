package UITestFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import logger.Log;

/**
 * contains all the methods to create a new session and destroy the session
 * after the test(s) execution is over. Each test extends this class.
 */
public class CreateSession {

	public WebDriver driver;
	Properties configFile;
	protected static Properties lobConfigProp = new Properties();
	protected static Properties localeConfigProp = new Properties();
	protected FileInputStream configFis, lobConfigFis, localeConfigFis;
	public Properties testDataFile;
	private final String CONFIG_FILE_PATH = "//src//main//java//config//config.properties";
	protected File file = new File("");
	Properties configProp = new Properties();
	String OS;
	GenericMethods methods = new GenericMethods(driver);
	ReadData_PropertyFile prop=new ReadData_PropertyFile();

	/**
	 * this method starts Appium server. Calls startAppiumServer method to start the
	 * session depending upon your OS.
	 * 
	 * @throws Exception Unable to start appium server
	 */
	@BeforeSuite
	public void invokeAppium() throws Exception {
		String OS = System.getProperty("os.name").toLowerCase();
		try {
			startAppiumServer(OS);
			Log.info("Appium server started successfully");
		} catch (Exception e) {
			Log.logError(getClass().getName(), "startAppium", "Unable to start appium server");
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * this method stops Appium server.Calls stopAppiumServer method to stop session
	 * depending upon your OS.
	 * 
	 * @throws Exception Unable to stop appium server
	 */
	@AfterSuite(alwaysRun = true)
	public void stopAppium() throws Exception {
		try {
			stopAppiumServer(OS);
			Log.info("Appium server stopped successfully");

		} catch (Exception e) {
			Log.logError(getClass().getName(), "stopAppium", "Unable to stop appium server");
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * this method creates the driver depending upon the passed parameter (android
	 * or iOS) and loads the properties files (config and test data properties
	 * files).
	 * 
	 * @param os         android or iOS
	 * @param methodName - name of the method under execution
	 * @throws Exception issue while loading properties files or creation of driver.
	 */
	@Parameters({ "os" })
	@BeforeMethod
	public void createDriver(String os, Method methodName) throws Exception {

		propertiesFileLoad(os);

		File propertiesFile = new File(file.getAbsoluteFile() + "//src//main//java//log4j.properties");
		PropertyConfigurator.configure(propertiesFile.toString());
		Log.info("--------------------------------------");

		if (os.equalsIgnoreCase("android")) {
			String buildPath = choosebuild(os);
			androidDriver(buildPath, methodName);
			Log.info("Android driver created");

		} else if (os.equalsIgnoreCase("iOS")) {
			String buildPath = choosebuild(os);
			iOSDriver(buildPath, methodName);
			Log.info("iOS driver created");
		}
	}

	/**
	 * this method quit the driver after the execution of test(s)
	 */
	@AfterMethod
	public void teardown() {
		Log.info("Shutting down driver");
		driver.quit();
	}

	/**
	 * this method creates the android driver
	 * 
	 * @param buildPath  - path to pick the location of the app
	 * @param methodName - name of the method under execution
	 * @throws IOException 
	 */
	public synchronized void androidDriver(String buildPath, Method methodName) throws IOException {
//		File app = new File(buildPath);
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("deviceName", "Android Emulator");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("appPackage", "net.slideshare.mobile");
//		capabilities.setCapability("appActivity", "net.slideshare.mobile.ui.SplashActivity");
		capabilities.setCapability("name", methodName.getName());
//		capabilities.setCapability("app", app.getAbsolutePath());
		// added "MobileCapabilityType.FULL_RESET" capability to start app in fresh
		// state (logout).
		// Remove it if not required
//		capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
//		capabilities.setCapability("automationName", "UiAutomator2");
//		driver = new AndroidDriver(appiumService.getUrl(), capabilities);
		
		capabilities.setCapability("deviceName", "OnePlus Nord CE 5G");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("UDID", "fc3bb66d");
		capabilities.setCapability("appPackage", "com.justdial.search");
		capabilities.setCapability("appActivity", "SplashScreenNewActivity");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("autoGrantPermissions", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, capabilities);
		methods.implicitwait(driver);
		
		

	}

	/**
	 * this method creates the iOS driver
	 * 
	 * @param buildPath-  path to pick the location of the app
	 * @param methodName- name of the method under execution
	 * @throws MalformedURLException Thrown to indicate that a malformed URL has
	 *                               occurred.
	 */
	public void iOSDriver(String buildPath, Method methodName) throws MalformedURLException {
		File app = new File(buildPath);
		DesiredCapabilities caps = new DesiredCapabilities();
//		capabilities.setCapability("platformName","iOS");
//		capabilities.setCapability("platformVersion", "8.2");
//		capabilities.setCapability("appiumVersion", "1.3.7");
//		capabilities.setCapability("name", methodName.getName());
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 5s"); 
//		capabilities.setCapability("app", app.getAbsolutePath());
//		driver  = new IOSDriver( appiumService.getUrl(), capabilities);
		caps.setCapability("browserstack.user", "amsa_KCVipF");
		caps.setCapability("browserstack.key", "VZa6x1E8tMUuk4PUgQ6o");

		// Set URL of the application under test
		caps.setCapability("app", "bs://362d660594ae05e02aa862e4a7b0accb4274e3d9");

		// Specify device and os_version for testing
		caps.setCapability("device", "iPhone 11");
		caps.setCapability("os_version", "14");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("noReset", "true");
		caps.setCapability("autoGrantPermissions", "true");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		driver = new AppiumDriver<IOSElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	/**
	 * this method starts the appium server depending on your OS.
	 * 
	 * @param os your machine OS (windows/linux/mac)
	 * @throws IOException          Signals that an I/O exception of some sort has
	 *                              occurred
	 * @throws ExecuteException     An exception indicating that the executing a
	 *                              subprocesses failed
	 * @throws InterruptedException Thrown when a thread is waiting, sleeping, or
	 *                              otherwise occupied, and the thread is
	 *                              interrupted, either before or during the
	 *                              activity.
	 */
	private static AppiumDriverLocalService appiumService;
	private static AppiumServiceBuilder builder;

	public void startAppiumServer(String os) throws IOException, InterruptedException {
		if (os.contains("windows")) {
			builder = new AppiumServiceBuilder().usingAnyFreePort().withArgument(GeneralServerFlag.SESSION_OVERRIDE)
					.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
			appiumService = builder.build();
			appiumService.start();
		} else if (os.contains("mac os x")) {
			builder = new AppiumServiceBuilder().usingAnyFreePort().withArgument(GeneralServerFlag.SESSION_OVERRIDE)
					.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
		}

		else if (os.contains("linux")) {
			// Start the appium server
			System.out.println("ANDROID_HOME : ");
			System.getenv("ANDROID_HOME");
			// System.out.println("PATH :" +System.getenv("PATH"));
			CommandLine command = new CommandLine("/bin/bash");
			command.addArgument("-c");
			command.addArgument("~/.linuxbrew/bin/node");
			command.addArgument("~/.linuxbrew/lib/node_modules/appium/lib/appium.js", true);
			DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
			DefaultExecutor executor = new DefaultExecutor();
			executor.setExitValue(1);
			executor.execute(command, resultHandler);
			Thread.sleep(5000); // Wait for appium server to start

		} else {
			Log.info(os + "is not supported yet");
		}

		appiumService = builder.build();
		appiumService.start();
		Log.info("Appium started on " + appiumService.getUrl());
	}

	/**
	 * this method stops the appium server.
	 * 
	 * @param os your machine OS (windows/linux/mac).
	 * @throws IOException      Signals that an I/O exception of some sort has
	 *                          occurred.
	 * @throws ExecuteException An exception indicating that the executing a
	 *                          subprocesses failed.
	 */
	public void stopAppiumServer(String os) throws ExecuteException, IOException {
		if (appiumService != null) {
			appiumService.stop();
			Log.info("Appium server stopped");
		} else {
			Log.logError(getClass().getName(), getClass().getEnclosingMethod().getName(),
					"Appium server fail to stopped");
		}
	}

	/**
	 * this method loads properties files config and file having test data.
	 * 
	 * @param platform android or ios, to load specific test data file.
	 * @throws Exception property files are not loaded successfully
	 */
	public void propertiesFileLoad(String platform) throws Exception {
		configFis = new FileInputStream(file.getAbsoluteFile() + CONFIG_FILE_PATH);
		configProp.load(configFis);

		File f = new File(file.getAbsoluteFile() + "//src//main//java//config//" + platform + "_config.properties");

		if (f.exists() && !f.isDirectory()) {
			lobConfigFis = new FileInputStream(
					file.getAbsoluteFile() + "/src//main//java//config//" + platform + "_config.properties");
			lobConfigProp.load(lobConfigFis);

			String locale = lobConfigProp.getProperty("LOCALE");

			localeConfigFis = new FileInputStream(
					file.getAbsoluteFile() + "//src//main//java//testData//" + locale + "_" + platform + ".properties");
			localeConfigProp.load(localeConfigFis);
		} else {
			throw new Exception("Properties files loading failed ");
		}
	}

	public String choosebuild(String invokeDriver) {
		String appPath = null;
		if (invokeDriver.equals("android")) {
			appPath = configProp.getProperty("AndroidAppPath");
			return appPath;
		} else if (invokeDriver.equals("iOS")) {
			appPath = configProp.getProperty("iOSAppPath");
			return appPath;
		}

		return appPath;
	}

	/**
	 * Returns the instance of the webdriver.
	 * 
	 * @return webdriver instance
	 */
	public WebDriver getDriver() {
		return driver;
	}

}
