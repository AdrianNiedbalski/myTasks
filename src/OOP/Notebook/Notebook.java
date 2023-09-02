package OOP.Notebook;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNewNote (String text, List<String> tags) {
        Note newNote = new Note(text, tags);
        notes.add(newNote);
    }
    public void setMemo (int noteID, String memo) {
        for (Note note : notes) {
            if(note.getNoteID() == noteID) {
                note.setText(memo);
                return;
            }
        }
        System.out.println("Nie znaleziono notatki o ID: " + noteID);
    }
    public void setTags (int noteID, List<String> tags) {
        for (Note note : notes) {
            if(note.getNoteID() == noteID) {
                note.setTags(tags);
                return;
            }
        }
        System.out.println("Nie znaleziono notatki o ID: " + noteID);
    }
    public List<Note> search (String filter) {
        List<Note> matchingNotes = new ArrayList<>();
        for (Note note : notes) {
            if(note.Match(filter)) {
                matchingNotes.add(note);
            }
        }
        return matchingNotes;
    }
}
