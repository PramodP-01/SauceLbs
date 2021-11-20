import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TEst {
	public static class SauceLabsTest {

		static WebDriver driver;

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			ChromeOptions opt = new ChromeOptions();
			opt.setPlatformName("Windows 10");
			opt.setBrowserVersion("latest");

			Map<String, Object> sauceOptions = new HashMap<>();
			sauceOptions.put("username", System.getenv("oauth-pramodrocky005-1f6ef"));
			sauceOptions.put("accessKey", System.getenv("2a4cd3ee-ad3a-4fcf-b256-8cfc62d1aab2"));

			opt.setCapability("sauce:opt", sauceOptions);
			URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");

			driver = new RemoteWebDriver(url, opt);
		}

	}
}
