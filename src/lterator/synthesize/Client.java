package lterator.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Class obj = new Class();
        final Student student1 = new Student("杨过", 21, "男");
        final Student student2 = new Student("小龙女", 23, "女");
        final Student student3 = new Student("令狐冲", 22, "男");

        obj.addStudent(student1);
        obj.addStudent(student2);
        obj.addStudent(student3);

        obj.displayStudents();
    }
}
