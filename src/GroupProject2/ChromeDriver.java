package GroupProject2;
 public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open the Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close the browser");

    }

    @Override
    public String getTitle() {

        return null;
    }


    @Override
    public void navigate() {

    }

}

