package integrationTest;

import activity.whenDo.ListScreen;
import activity.whenDo.MainScreen;
import activity.whenDo.NoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class Edith {

   MainScreen mainScreen = new MainScreen();
   NoteForm createNoteForm = new NoteForm();

   ListScreen listScreen = new ListScreen();

   @Test
   public void verifyEdithText(){
      String title="Go to Shopping";
      String note="Get money from ATM";
      String title2="Go to park";
      String note2="I have to exercise";

      mainScreen.addNoteButton.click();
      createNoteForm.titleTxtBox.setText(title);
      createNoteForm.noteTxtBox.setText(note);
      createNoteForm.saveButton.click();

      Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
              "ERROR, the note was not created");
      listScreen.elementViewGroup(title).click();
      createNoteForm.titleTxtBox.setText(title2);
      createNoteForm.noteTxtBox.setText(note2);
      createNoteForm.saveButton.click();

      Assertions.assertFalse(mainScreen.isNoteDisplayed(title),
              "ERROR, the title was not edited");

      Assertions.assertTrue(mainScreen.isNoteDisplayed(title2),
              "ERROR, the title was not edited");

      Assertions.assertFalse(mainScreen.isNoteDisplayed(note),
              "ERROR, the note was not edited");

      Assertions.assertTrue(mainScreen.isNoteDisplayed(note2),
              "ERROR, the note was not edited");

   }

   @AfterEach
   public void closeApp(){
      Session.getInstance().closeApp();
   }
}
