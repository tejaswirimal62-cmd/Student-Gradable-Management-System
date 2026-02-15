import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem implements Storable {

    private List<Student> students;
    private final String fileName = "students.data";

    public StudentManagementSystem() {
        students = FileHandler.loadStudents(fileName);
        if (students == null) {
            students = new ArrayList<>();
        }
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("---- Student List ----");
            for (Student s : students) {
                s.displayInfo();
                System.out.println("---------------------");
            }
        }
    }

    // Multithreaded save
    @Override
    public void saveData() {
        Thread t = new Thread(() -> {
            FileHandler.saveStudents(students, fileName);
            System.out.println("Data saved in background thread!");
        });
        t.start();

        try {
            t.join(); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    @Override
    public void loadData() {
        List<Student> loaded = FileHandler.loadStudents(fileName);
        if (loaded != null) {
            students = loaded;
            System.out.println("Data loaded from file.");
        }
    }
}
