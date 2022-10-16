package activity.whenDo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Button searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));

    public Button menuButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));

    public Button menuButtonOption = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));

    public Button calncelButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));

    public MainScreen(){}


    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }
    public void back(){

    }

}
