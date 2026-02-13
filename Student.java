public class Student extends Person {
    private String ID;
    private double marks;
    private String grade;

    public Student(String name, int age, String ID, double marks) {
        super(name, age);
        this.ID = ID;
        setMarks(marks);
        calculateGrade();
    }

    public void setMarks(double marks) {
        if(marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    private void calculateGrade() {
        if(marks >= 90) {
            grade = "A";
        }
        else if(marks >= 70){
            grade = "B";
        }
        else if(marks >= 50){
            grade = "C";
        }
        else if(marks >= 30){
            grade = "D";
        }
        else{
            grade = "F";
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID: " + ID);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
