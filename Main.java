import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n Student Grading Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();

                    sms.addStudent(new Student(name, age, id, marks));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String graduateName = sc.nextLine();

                    System.out.print("Enter age: ");
                    int graduateAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student ID: ");
                    String graduateId = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double graduateMarks = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter thesis title: ");
                    String thesis = sc.nextLine();

                    sms.addStudent(
                            new GraduateStudent(graduateName, graduateAge, graduateId, graduateMarks, thesis)
                    );
                    System.out.println("Graduate student added successfully.");
                    break;

                case 3:
                    sms.showStudents();
                    break;

                case 4:
                    sms.saveData();
                    break;

                case 5:
                    sms.loadData();
                    break;

                case 6:
                    sms.saveData();
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
