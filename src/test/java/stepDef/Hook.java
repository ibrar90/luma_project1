package stepDef;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {
    // QA: http://www.qa.taltektc.com
    // STAGE: http://www.stage.taltektc.com
    // PROD: http://www.prod.taltektc.com

    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        if (Strings.isNullOrEmpty(driverType)) {
            driverType = "Ch";
        }
        if (Strings.isNullOrEmpty(envType)) {
            envType = "qa";
        }
        driver = setupBrowser(driverType);
        switch (envType){
            case "qa":
                url = "https://magento2.algolia.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvMi5hbGdvbGlhLmNvbS8%2C/";
                Email_Address =  "Khalilsyl19@yahoo.com";
                Password = "Aircrafter200";

                break;
            case "prod":
            url = "https://magento2.algolia.com/customer/account/logi/referer/aHR0cHM6Ly9tYWdlbnRvMi5hbGdvbGlhLmNvbS8%2C/";
            Email_Address =  "Khalilsyl19@yahoo.com";
            Password = "Aircrafter200";
            break;


        }
        driver.get(url);
    }

    @After
    public void afterEachTest(){
        // driver.quit();
    }
}

