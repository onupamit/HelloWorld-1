import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.List;

public class MZaminHome extends Base {
    // prothom-alo

    @Test
    public void myFirstTry() throws  InterruptedException, Exception{
        System.out.println("\n --------------////786//// ------------------ \n");
        String curTitle =  webDriver.getTitle();

        System.out.println("First Title"+ curTitle);


        webDriver.quit();




    }
}
