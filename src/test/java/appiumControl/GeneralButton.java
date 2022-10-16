package appiumControl;

import singletonSession.Session;

public class GeneralButton {

    public void back(){
        Session.getInstance().getDriver().navigate().back();
    }
}
