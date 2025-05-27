package module4.task4_4;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        if (!students.contains(student))
        {
            students.add(student);
        }
    }

    public String getTitle()
    {
        return title;
    }

    public List<Student> getStudents()
    {
        return students;
    }
}
