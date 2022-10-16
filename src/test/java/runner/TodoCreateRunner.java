package runner;

import activity.whenDo.MainScreen;
import activity.whenDo.NoteForm;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class TodoCreateRunner {

    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();
    String title="Go to Shopping";
    String note="Get money from ATM";
    @Given("I open the application")
    public void iOpenTheApplication() {
    }

    @When("I press create button")
    public void iPressCreateButton() {
        mainScreen.addNoteButton.click();
    }

    @And("Fill creation data")
    public void fillCreationData() {
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
    }

    @And("Save the Todo")
    public void saveTheTodo() {
        createNoteForm.saveButton.click();
    }

    @Then("todo should be created")
    public void todoShouldBeCreated() {
        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the title was not created");

        Assertions.assertTrue(mainScreen.isNoteDisplayed(note),
                "ERROR, the note was not created");
    }

    @Given("I open application")
    public void iOpenApplication() {
    }

    @When("I press to create button")
    public void iPressToCreateButton() {
        mainScreen.addNoteButton.click();
    }

    @And("Fill data")
    public void fillData() {
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
    }

    @And("I cancel the Todo")
    public void iCancelTheTodo() {
        mainScreen.calncelButton.click();
    }

    @Then("Title Todo should not be created")
    public void titleTodoShouldNotBeCreated() {
        Assertions.assertFalse(mainScreen.isNoteDisplayed(title),
                "ERROR, the title was created");
    }

    @And("Note should not be created too")
    public void noteShouldNotBeCreatedToo() {
        Assertions.assertFalse(mainScreen.isNoteDisplayed(note),
                "ERROR, the note was created");
    }
}
