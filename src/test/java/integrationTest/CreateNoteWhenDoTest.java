package integrationTest;

import activity.whenDo.ListScreen;
import activity.whenDo.MainScreen;
import activity.whenDo.NoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class CreateNoteWhenDoTest {
    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();

    ListScreen listScreen = new ListScreen();

    @Test
    public void verifyCreateNewNote(){
        String title="Go to Shopping";
        String note="Get money from ATM";


        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the title was not created");

        Assertions.assertTrue(mainScreen.isNoteDisplayed(note),
                "ERROR, the note was not created");

    }

    @Test
    public void verifyCalcelNewNote(){
        String title="Go to Shopping";
        String note="Get money from ATM";


        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        mainScreen.calncelButton.click();


        Assertions.assertFalse(mainScreen.isNoteDisplayed(title),
                "ERROR, the title was created");

        Assertions.assertFalse(mainScreen.isNoteDisplayed(note),
                "ERROR, the note was created");

    }


    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }



}
