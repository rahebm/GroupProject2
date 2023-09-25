package GroupProject2;

public class FireFoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("FireFox");

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

