import java.io.*;
import java.util.List;

public class FileHandler {

    public static void saveStudents(List<Student> students, String fileName) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(students);
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            System.out.println("File save error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Student> loadStudents(String fileName) {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File load error: " + e.getMessage());
            return null;
        }
    }
}


