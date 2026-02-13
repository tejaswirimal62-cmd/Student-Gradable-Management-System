import java.io.IOException;

public interface Storable {
    void saveToFile(String fileName) throws IOException;
    void loadFromFile(String fileName) throws IOException;
}
