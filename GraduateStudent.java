public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int age, String studentID, double marks, String thesisTitle) {
        super(name, age, studentID, marks);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis: " + thesisTitle);
    }
}
