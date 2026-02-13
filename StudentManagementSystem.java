import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
            System.out.println("-------------------");
        }
    }

    public void save(String fileName) {
        FileHandler.saveStudents(students, fileName);
    }

    public void load(String fileName) {
        List<Student> loaded = FileHandler.loadStudents(fileName);
        if (loaded != null) {
            students = loaded;
            System.out.println("Data loaded from " + fileName); // ✅ confirmation message
        }
    }
}
