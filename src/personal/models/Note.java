package personal.models;

import java.util.Date;

public class Note {
    private String id = "";
    private String noteHeader;
    private String noteText;
    private Date noteDate;

    public Note(String noteHeader, String noteText){
        this.noteHeader = noteHeader;
        this.noteText = noteText;
    }

    public String getId(){
        return id;
    }

    public String getNoteHeader() {
        return noteHeader;
    }

    public String getNoteText() {
        return noteText;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    @Override
    public String toString() {
        return String.format("Тема заметки: %s\nТекст заметки: %s\nДата заметки: %t", noteHeader, noteText, noteDate);
    }
}
