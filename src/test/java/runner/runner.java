package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import singletonSession.Session;

@RunWith(Cucumber.class)
public class runner {

    @Before
    public void before(){

    }
    @After
    public void after(){
        Session.getInstance().closeApp();
    }


}