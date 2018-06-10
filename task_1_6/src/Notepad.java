import java.util.ArrayList;
/**
 * NotePad class.
 * Need for organize and manage note in Notepad.
 * @see NoteInNotepad For creating instance of Note use NoteInNotepad class.
 *
 * @author Tikhomirov Viktor
 * @version 1.0
 */
public class Notepad {

    /**
     * Create instance of Notepad without notes.
     */
    public Notepad() {
    }

    /**
     * Notes keep in Notepad at ArrayList.
     *
     * notesArray contains instances of NoteInNotepad.
     * @see NoteInNotepad NoteInNotepad class
     */
    private ArrayList<NoteInNotepad> notesArray = new ArrayList<>();

    /**
     * Method addNote is required to add a Note in NotePad
     *
     * @param note it is String with note data.
     * @return index of note element in Array, which method created.
     */
    public int addNote(String note) {
        notesArray.add(new NoteInNotepad(note));
        return notesArray.size()-1; //return index of added element
    }

    /**
     * Method deleteNote is required to remove note from notepad.
     *
     * @param index index of anote wich we will need to remove.
     * @return true, if element contained in notepad; false, if index incorrect.
     */
    public boolean deleteNote(int index) {
        if ((index<notesArray.size())&&(index>=0)) {
            notesArray.remove(index);
            return true;
        }
        else
            return false;
    }

    /**
     * Method editNote is required to editing note in notepad.
     *
     * @param index index of an edited note.
     * @param newNote new data that will be contained in the note.
     * @return true, if element containing in notepad; false, if index incorrect.
     */
    public boolean editNote(int index, String newNote) {
        if ((index<notesArray.size())&&(index>=0)) {
            notesArray.get(index).setNote(newNote);
            return true;
        }
        else
            return false;
    }

    /**
     * Method seeAllNotes is required to print all notes contained in Notepad.
     */
    public void seeAllNotes() {
        for (NoteInNotepad noteInNotepad : notesArray) {
            System.out.println(noteInNotepad.getNote());
        }
    }

}
