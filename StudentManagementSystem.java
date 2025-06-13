import java.util.ArrayList;
import java.util.List;
import java.util.Map;


class StudentManagementSystem {
    private List<Student> students;
    private List<String> subjects;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(String subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
        }
    }

    public void printAllStudents() {
        System.out.println("\nAll Students:");
        System.out.printf("%-5s %-15s", "ID", "Name");
        for (String subject : subjects) {
            System.out.printf(" %-10s", subject);
        }
        System.out.println();

        for (Student student : students) {
            System.out.printf("%-5d %-15s", student.getId(), student.getName());
            Map<String, Integer> marks = student.getAllMarks();
            for (String subject : subjects) {
                Integer mark = marks.get(subject);
                System.out.printf(" %-10s", (mark != null) ? mark : "-");
            }
            System.out.println();
        }
    }

    public void printSubjectMarks(String subject) {
        if (!subjects.contains(subject)) {
            System.out.println("Subject not found!");
            return;
        }

        System.out.println("\nMarks for " + subject + ":");
        for (Student student : students) {
            Integer mark = student.getMarkForSubject(subject);
            if (mark != null) {
                System.out.println(student.getName() + ": " + mark);
            }
        }
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }
}


