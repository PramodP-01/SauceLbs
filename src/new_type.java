import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class new_type {
	public static class SauceLabsTest {
		public static final String USERNAME = "oauth-pramodrocky005-1f6ef";

		public static final String ACCESS_KEY = "2a4cd3ee-ad3a-4fcf-b256-8cfc62d1aab2";

		public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

		static WebDriver driver;

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stubD
			ChromeOptions opt = new ChromeOptions();
			opt.setCapability("platform", "Windows 7");
			opt.setCapability("version", "51.0");
			opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			opt.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			opt.merge(opt);
			WebDriver driver = new RemoteWebDriver(new URL(URL), opt);
			driver.get("www.facebook.com");
			System.out.println(driver.getTitle());

		}
	}
}
