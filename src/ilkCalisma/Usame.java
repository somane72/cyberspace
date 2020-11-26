package ilkCalisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usame {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/SOMANE/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını  doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");

        String actualYouTubeTitle =  driver.getTitle();
        String expectedYouTubeTitle = "youtube";

        if (actualYouTubeTitle.equals(expectedYouTubeTitle)){
            System.out.println("YouTube Title testi PASS");
        }else {
            System.out.println("YouTube Title testi FAILED");
            System.out.println("Actual Title : " + actualYouTubeTitle);
        }
        // 3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa  doğru URL'yi yazdırın.
        String actuelYouTubeURL = driver.getCurrentUrl();
        if (actuelYouTubeURL.contains("youtube")){
            System.out.println("URL icerik testi PASS");
        }else {
            System.out.println("FAILED");
        }
        // Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        // Youtube sayfasina geri donun
        driver.navigate().back();
        // RefrSayfayi yenileyin
        driver.navigate().refresh();
        // Amazon sayfasina donun
        driver.navigate().forward();
        // Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        // Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa     doğru başlığı(Actual Title) yazdırın.

        // Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru  URL'yi yazdırın

        // Sayfayi kapatin
        Thread.sleep(5000);
        driver.close();
    }
}
