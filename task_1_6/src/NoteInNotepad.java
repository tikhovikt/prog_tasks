/**
 * It is the class to create element for notepad. It contains only one String for note data.
 *
 * @author Tikhomirov Viktor
 * @version 1.0
 */
public class NoteInNotepad {

    /**
     * Contains a note data.
     */
    private String note;

    /**
     * This constructor use for create instance of Note.
     * @param note String note data.
     */
    public NoteInNotepad(String note) {
        this.note = note;
    }

    /**
     * Standart getter for note field in instance of Note
     * @return String of note data.
     */
    public String getNote() {
        return note;
    }

    /**
     * Standart getter for note field in instance of Note
     * @param note it is String of note data.
     */
    public void setNote(String note) {
        this.note = note;
    }
}
