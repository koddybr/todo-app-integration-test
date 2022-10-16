package activity.whenDo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NoteForm {
    public TextBox titleTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

    public Button confirDeleteButton = new Button(By.id("android:id/button1"));

    public TextBox noteTest = new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));





    //public Click EdithTxBox = new Button(By.id(""))
}
