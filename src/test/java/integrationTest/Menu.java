package integrationTest;

import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class Menu {

    MainScreen mainScreen = new MainScreen();

    @Test
    public void verifyMenu(){

        mainScreen.menuButton.click();
        mainScreen.addNoteButton.click();

        Assertions.assertFalse(mainScreen.isNoteDisplayed("Local Account"));
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
