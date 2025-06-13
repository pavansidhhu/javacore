import java.util.HashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;
    private Map<String, Integer> subjectMarks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjectMarks = new HashMap<>();
    }

    public void addSubjectMark(String subject, int mark) {
        subjectMarks.put(subject, mark);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMarkForSubject(String subject) {
        return subjectMarks.get(subject);
    }

    public Map<String, Integer> getAllMarks() {
        return new HashMap<>(subjectMarks);
    }
}
