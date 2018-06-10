import java.util.ArrayList;

public class Notepad {

    private ArrayList<NoteInNotepad> notesArray = new ArrayList<>();

    public int addNote(String note) {
        notesArray.add(new NoteInNotepad(note));
        return notesArray.size()-1; //return index of added element
    }

    public boolean deleteNote(int index) {
        if ((index<notesArray.size())&&(index>=0)) {
            notesArray.remove(index);
            return true;
        }
        else
            return false;
    }

    public boolean editNote(int index, String newNote) {
        if ((index<notesArray.size())&&(index>=0)) {
            notesArray.get(index).setNote(newNote);
            return true;
        }
        else
            return false;
    }

    public void seeAllNotes() {
        for (NoteInNotepad note : notesArray) {
            System.out.println(note.getNote());
        }
    }

}
