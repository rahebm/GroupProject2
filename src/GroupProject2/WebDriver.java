package GroupProject2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();

    static void getScreenshot();
}
    interface  RemoteWebDriver extends WebDriver{
        void navigate();

    }
    interface TakeScreenshot extends RemoteWebDriver {
        void getScreenshot();
    }
