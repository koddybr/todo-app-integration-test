package integrationTest;

import activity.whenDo.ListScreen;
import activity.whenDo.MainScreen;
import activity.whenDo.NoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class Delete {

    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();

    ListScreen listScreen = new ListScreen();

    @Test
    public void deleteList(){
        String title="Go to Shopping";
        String note="Get money from ATM";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();
        listScreen.elementViewGroup(title).click();
        createNoteForm.deleteButton.click();
        createNoteForm.confirDeleteButton.click();

        Assertions.assertFalse(mainScreen.isNoteDisplayed(title),
                "ERROR, the title was not deleted");
        Assertions.assertFalse(mainScreen.isNoteDisplayed(note),
                "ERROR, the note was not deleted");
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }


}
