package utils;

public class DriverFactory {

    // getDriver method to get object of type WebDriverSingleton
    public WebDriverSingleton getDriver(String driverType){
        switch (driverType){
            case "CHROME":
                return new ChromeDriverSingleton();
            case "FIREFOX":
                return new FirefoxDriverSingleton();
            default:
                throw new IllegalArgumentException("Invalid driver type: " + driverType);
        }
    }
}

