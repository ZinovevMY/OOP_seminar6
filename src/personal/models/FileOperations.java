package personal.models;

import java.util.List;

public interface FileOperations {
    List<String> readAllNotes();
    void saveAllNotes(List<String> notes);
}
