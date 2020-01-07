import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikipediaTest extends TestBase{

    @Test
    public void openWikipedia() throws InterruptedException {

        maximize();
        click(By.cssSelector("#js-link-box-en"));
        click(By.xpath("//*[@id='ca-history']"));
        back();
        pause(3000);
        click(By.cssSelector("#ca-viewsource"));
        pause(3000);
        back();
        click(By.xpath("//*[contains(@title, 'Arts')]"));
        back();
        pause(3000);
        click(By.xpath("//*[@type='search']"));
        pause(3000);
        click(By.cssSelector("[title=Wikipedia]"));
        back();
        pause(3000);
        click(By.xpath("//*[@class='mw-wiki-logo']"));
        click(By.xpath("//*[contains(@title, 'Technology')]"));
        back();
        pause(3000);
        click(By.xpath("//*[@title='Commons']"));
        back();
        pause(3000);
        click(By.xpath("//*[contains(@title, 'Foundation')]"));
        back();
        pause(3000);

    }

}
