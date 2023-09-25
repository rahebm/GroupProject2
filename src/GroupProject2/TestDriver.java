package GroupProject2;

import static GroupProject2.FireFoxDriver.*;

public class TestDriver{
    public static void main(String[] args) {


        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        chromeDriver.getTitle();
        chromeDriver.close();


        FireFoxDriver firefoxdriver=new FireFoxDriver();
        firefoxdriver.open();
        firefoxdriver.navigate();
        firefoxdriver.getTitle();
        firefoxdriver.close();



        SafariDriver safaridriver=new SafariDriver();
        safaridriver.open();
        safaridriver.navigate();
        safaridriver.getTitle();
        safaridriver.close();





    }
}