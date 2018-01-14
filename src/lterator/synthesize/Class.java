package lterator.synthesize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Class {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        final Comparator comparator = new MyComparator();
        Collections.sort(students, comparator);
        final Iterator i = students.iterator();
        while (i.hasNext()) {
            final Student student = (Student) i.next();
            System.out.println("姓名:" + student.getName() + "年龄:" + student.getAge());
        }
    }
}
