import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        // Adding some sample data
        sms.addSubject("Math");
        sms.addSubject("Science");
        sms.addSubject("Lang");
        sms.addSubject("English");


        Student s1 = new Student(1, "Alice");
        s1.addSubjectMark("Math", 85);
        s1.addSubjectMark("Science", 90);
        s1.addSubjectMark("Lang", 10);

        Student s2 = new Student(2, "Bob");
        s2.addSubjectMark("Math", 75);
        s2.addSubjectMark("Lang", 20);
        s1.addSubjectMark("English", 100);

        Student s3 = new Student(3, "Charlie");
        s3.addSubjectMark("Science", 88);
        s3.addSubjectMark("Lang", 30);

        Student s4 = new Student(4, "Diana");
        s4.addSubjectMark("Math", 92);
        s4.addSubjectMark("Science", 95);
        s4.addSubjectMark("Lang", 40);

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s4);



        try {
            System.out.println("Available subjects: " + sms.getSubjects());
            System.out.print("Enter subject name: ");
            String subject = scanner.nextLine();
            sms.printSubjectMarks(subject);
        } catch (Exception e) {
            System.out.println("Invalid choice!");
        }


    }
}
