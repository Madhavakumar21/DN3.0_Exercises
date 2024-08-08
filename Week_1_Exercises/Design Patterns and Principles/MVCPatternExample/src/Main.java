public class Main {
    public static void main(String[] args) {
        Student student = new Student("Madhavakumar D", "50", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("CTS Assignment");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
