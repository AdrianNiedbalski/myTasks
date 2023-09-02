package OOP.Notebook;

import java.util.Date;
import java.util.List;

public class Note {
    private static int nextID = 1;
    private int noteID;
    private String text;
    private List<String> tags;
    private Date creationDate;

    public Note(String text, List<String> tags) {
        this.noteID = nextID++;
        this.text = text;
        this.tags = tags;
        this.creationDate = new Date();
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Note.nextID = nextID;
    }

    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean Match (String filter) {
        return text.contains(filter) || tags.contains(filter);
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteID=" + noteID +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                ", creationDate=" + creationDate +
                '}';
    }
}
