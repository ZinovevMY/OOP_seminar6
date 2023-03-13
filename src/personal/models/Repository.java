package personal.models;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String createNote(Note note);

    public void saveNote(List<Note> notes);
    public void deleteNote(String noteId, List<Note> notes);
}
