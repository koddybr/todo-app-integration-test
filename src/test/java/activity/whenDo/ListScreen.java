package activity.whenDo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ListScreen {

    //public

    //List<WebElement> weekObjetList = driver.findElements(By.xpath("//android.widget.ListView[1]//android.widget.RelativeLayout"))

    //public Button elementViewGroup = new Button(By.xpath("//android.widget.TextView[@text='Shopping']"));

    public Button elementViewGroup(String text){
        return new Button(By.xpath("//android.widget.TextView[@text='"+text+"']"));
    }


}
