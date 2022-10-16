package integrationTest;

import activity.whenDo.MainScreen;
import activity.whenDo.NoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class Searcher {

    MainScreen mainScreen = new MainScreen();

    NoteForm createNoteForm = new NoteForm();

    @Test
    public void verifyButtonSearcher(){

        String titleOne="Go to Shopping";
        String noteOne="Get money from ATM";
        String titleTwo="Go to park";
        String noteTwo="I have to exercise";
        String titleTree="Go to dinner";
        String noteTree="I have to use suit";
        String noteTest="park";


        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(titleOne);
        createNoteForm.noteTxtBox.setText(noteOne);
        createNoteForm.saveButton.click();
        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(titleTwo);
        createNoteForm.noteTxtBox.setText(noteTwo);
        createNoteForm.saveButton.click();
        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(titleTree);
        createNoteForm.noteTxtBox.setText(noteTree);
        createNoteForm.saveButton.click();

        mainScreen.searchButton.click();
        createNoteForm.noteTest.setText(noteTest + "\\n");
        //createNoteForm.noteTest.pressReturn();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(titleTwo),
                "ERROR, the todo was not found");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
